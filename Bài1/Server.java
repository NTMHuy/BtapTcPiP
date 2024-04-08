package TCPIP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.sound.sampled.Port;

public class Server {
    public static void main(String[] args) {
    	final int Port = 12345;
    	try {
			ServerSocket serverSocket = new ServerSocket(Port);
			System.out.println("Thanh cong");
			
			while (true) {
				Socket clienSocket = serverSocket.accept();
				System.out.println("Client connected: " + clienSocket);
				

			}
    	} catch (Exception e) {
			// TODO: handle exception
		}
    }
}