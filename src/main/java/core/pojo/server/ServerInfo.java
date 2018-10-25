package core.pojo.server;

public class ServerInfo {

	String userName;
	String hostName;
	String serverFilePath;

	public ServerInfo(String userName, String hostName, String serverFilePath) {
		this.userName = userName;
		this.hostName = hostName;
		this.serverFilePath = serverFilePath;
	}

	public String getUserName() {
		return userName;
	}

	public String getHostName() {
		return hostName;
	}

	public String getServerFilePath() {
		return serverFilePath;
	}

}
