package core.library;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import core.constants.ProgramConstantsTest;
import core.pojo.server.ServerInfo;

public class ShellWrapper {

	JSch jsch = new JSch();
	ServerInfo serverInfo;

	public ShellWrapper(ServerInfo serverInfo) throws JSchException {
		this.serverInfo = serverInfo;
		jsch.setKnownHosts("/home/salman/.ssh/known_hosts");
		jsch.addIdentity(serverInfo.getServerFilePath());
		
	}

	public void getShell() throws JSchException {
		Session session = jsch.getSession(serverInfo.getUserName(), serverInfo.getHostName(), 22);
		session.connect(30000);
		Channel channel = session.openChannel("shell");
		channel.setInputStream(System.in);
		channel.setOutputStream(System.out);
		channel.connect(3 * 1000);
	}

	public static void main(String[] args) throws JSchException {
		ShellWrapper s = new ShellWrapper(ProgramConstantsTest.serverInfo);
		s.getShell();
	}

}
