package core.constants;

import core.pojo.server.ServerInfo;

public interface ProgramConstantsTest {

	String userName = "ec2-user";
	String host = "52.33.237.202";
	String keyPath = "/home/salman/Desktop/AmbariTest/TestAmbari.pem";

	ServerInfo serverInfo = new ServerInfo(userName, host, keyPath);
	
	

}
