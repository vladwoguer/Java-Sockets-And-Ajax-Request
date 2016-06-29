import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateServer {

	public static void main(String[] args) throws IOException {
		try {
			ServerSocket sock = new ServerSocket(7020);
			// Agora escuta conexões
			while(true) {
				Socket client = sock.accept();
				PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
				// Escreve Data no Socket
				Date hoje = new Date();
				SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				pout.println(dt.format(hoje));
				// Fecha o socket e continua
				// escutando conexões
				client.close();
			}
		} catch(IOException ioe){
			System.out.println(ioe);
		}
	}
}