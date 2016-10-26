package chinesechess;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Config {
	//ChessBoard Info
	public static final int ChessBoardHeight = 10;
	public static final int ChessBoardWidth = 10;
	public static final int ChessSize = 10; //2*Radius, for chinese chess
	
	public static final Paint PlayerChessColor = Color.RED;
	public static final Paint ComputerChessColor = Color.BLACK;
	public static final Paint BackgroundColor = Color.WHITE;
	public static final Paint ChessColor = Color.BURLYWOOD;
	
	//Role Info
	public static final int Player = 1;
	public static final int Computer = -1;
	
	//Chess Board Info
	public static final int PutByPlayer = 1;
	public static final int PutByComputer = -1;
	public static final int NoChess = 0;
	
	//Victory Info
	public static final int PlayerWin = 1;
	public static final int ComputerWin = -1;
	public static final int NoOneWin = 0;
}
