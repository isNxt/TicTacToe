package server;

import javax.swing.WindowConstants;

public class TicTacToeServerTest {

	public static void main(String[] args) {
		TicTacToeServer application = new TicTacToeServer();
		application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		application.execute();
	}
}
