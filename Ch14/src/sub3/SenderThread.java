package sub3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {

	private Socket socket;
	
	public SenderThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((socket.getOutputStream())));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String msg = br.readLine();
				
				if(msg.equals("bye")) {
					break;
				}
				
				//메시지 전송
				bw.write(msg);
				bw.newLine();
				bw.flush();
				
//				writer.println(msg);
//				writer.flush();
			}
			
			bw.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
