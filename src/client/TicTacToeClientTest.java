package client;

import javax.swing.WindowConstants;

public class TicTacToeClientTest {

	public static void main(String[] args) {
		TicTacToeClient application; // declare client application

		// Check for command line args
		if (args.length == 0)
			application = new TicTacToeClient("127.0.0.1"); // localhost
		else
			application = new TicTacToeClient(args[0]); // use args

		application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
