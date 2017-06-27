/* Java 2 Homework 6
 * author Trashkov Sergey
 * version 0.1 by date 27/06/2017
*/

import java.io.*;
import java.net.*;
import java.util.*;

class SimpleClient {

    final String SERVER_ADDR = "127.0.0.1"; // or "localhost"
    final int SERVER_PORT = 2048;
    final String PROMPT = "$ ";
    final String EXIT_COMMAND = "exit"; // command for exit
    final String CONNECTION_START = "Connection to server established.";
    final String CONNECTION_CLOSED = "Connection closed.";

    Socket socket;
    Scanner scanner;
    PrintWriter writer;
	BufferedReader reader;

    public static void main(String[] args) {
        new SimpleClient();
    }

    SimpleClient() {
        scanner = new Scanner(System.in); // for keyboard input
        String message;
		
        try {
            socket = new Socket(SERVER_ADDR, SERVER_PORT);
            System.out.println(CONNECTION_START);
            writer = new PrintWriter(socket.getOutputStream());
			BufferedReader reader = new BufferedReader(  //read echo message from server
                new InputStreamReader(socket.getInputStream()));
			do {
                System.out.print(PROMPT);
                message = scanner.nextLine();
                writer.println(message);
                writer.flush();
				String str = reader.readLine();
				System.out.println(str);								
            } while (!message.equals(EXIT_COMMAND));
            writer.close();
			reader.close();
            socket.close();
		} 
		catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
		System.out.println(CONNECTION_CLOSED);
	}
}