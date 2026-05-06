import java.util.*;
import java.io.*;

public class SudokuEngine
{
	public static void main(String[] args)
	{
		String fileName = "boards/very-fast-solve.sdk";
		SudokuBoard board = new SudokuBoard(fileName);
		board.solve();
		System.out.println(board);
	}
}