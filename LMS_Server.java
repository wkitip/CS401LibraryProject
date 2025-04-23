import java.io.*;
import java.net.*;

public class LMS_Server {
	public static void main(String[] args) {
		
		ServerSocket server = null;	
		try {
			server = new ServerSocket(6000);
			server.setReuseAddress(true);
				
			while(true) {
				Socket client = server.accept();
				ClientHandler clientSock = new ClientHandler(client);
				new Thread(clientSock).start();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(server != null) {
				try {
					server.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
				
		}
		return;
	}
		
	private static class ClientHandler implements Runnable {
		private final Socket clientSocket;
			
		public ClientHandler(Socket socket) {
			clientSocket = socket;
		}
			
		public void run() {
			try {
					
				OutputStream out = clientSocket.getOutputStream();
				ObjectOutputStream oOut = new ObjectOutputStream(out);
					
				InputStream in = clientSocket.getInputStream();
				ObjectInputStream oIn = new ObjectInputStream(in);
			}		
			catch(IOException e) {
				
			}
			finally {
				
			}
		}
	}
}
