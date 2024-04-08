package TCPIP;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread{
	private Socket clientSocket;
	
	public ClientHandler(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}
	
	public void run() {
		try {
			DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
			
			for (int i = 1; i<=1000; i++) {
				out.write(i);
				out.flush();
				System.out.println(i);
				Thread.sleep(1000);
			}
			out.close();
            clientSocket.close();
            System.out.println("Connection closed with client: " + clientSocket);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
