package FinalProject;

import java.util.Random;
import java.util.Scanner;
public class FinalProject {
	
	public static int[][] piece1(int [][] gameboard)//Here we're creating the first piece
		{
		boolean completed = false; //We need to create a boolean to prove that the road is not completed. In that case, the first piece will enter in the gameboard
		for (int i = 9; i > 0; i--) 
			{
			for (int j = 0; j < 8; j++) 
				{
				if((gameboard[i][j] == 0)&&(gameboard[i-1][j]== 0)&&(gameboard[i-2][j]== 0)) //To put piece1 on the gameboard, it has to check that there are three free spaces in the vertical position. 
					{
					gameboard[i][j] = 1;
					gameboard[i-1][j] = 1;
					gameboard[i-2][j] = 1;
					completed = true;
					if (completed) 
						{
						break;
						}
					}
				}
			if (completed) 
				{
				break;
				}
			}
		return gameboard;
		
		}
	
	public static int[][] piece2(int [][] gameboard)
		{
		boolean completed = false;
		for (int i = 9; i > 0; i--) 
			{
			for (int j = 0; j < 6; j++) 
				{
				if((gameboard[i][j] == 0)&&(gameboard[i-1][j]== 0)&&(gameboard[i][j+1]== 0)&&(gameboard[i][j+2]== 0)) // If the spaces to place the second piece are free then it places piece2 and then it returns the gameboard with the new piece added.
					{
					gameboard[i-1][j] = 1;
					gameboard[i][j] = 1;
					gameboard[i][j+1] = 1;
					gameboard[i][j+2] = 1;
					completed = true;
					if (completed) 
						{
						break;
						}
					}
				
				}
			if (completed) 
				{
				break;
				}
			}
		return gameboard;
		
		}
	
	public static int[][] piece3(int [][] gameboard)
		{
		boolean completed = false;
		for (int i = 9; i > 0; i--) 
			{
			for (int j = 0; j < 6; j++) 
				{
				if((gameboard[i][j] == 0)&&(gameboard[i-1][j+2]== 0)&&(gameboard[i][j+1]== 0)&&(gameboard[i][j+2]== 0)) // If the spaces to place the third piece are free then it places piece3 and then it returns the gameboard with the new piece added.
					{
					gameboard[i][j] = 1;
					gameboard[i][j+1] = 1;
					gameboard[i][j+2] = 1;
					gameboard[i-1][j+2] = 1;
					completed = true;
					if (completed) 
						{
						break;
						}
					}
				
				}
			if (completed) 
				{
				break;
				}
			}
		return gameboard;
		
		}
	
	public static int[][] piece4(int [][] gameboard) //If the spaces to place the fourth piece are free then it places piece4 and then it returns the gameboard with the new piece added.
		{
		boolean completed = false;
		for (int i = 9; i > 0; i--) 
			{
			for (int j = 0; j < 6; j++) 
				{
				if((gameboard[i][j] == 0)&&(gameboard[i-1][j+1]== 0)&&(gameboard[i][j+1]== 0)&&(gameboard[i][j+2]== 0)) 
					{
					gameboard[i][j] = 1;
					gameboard[i][j+1] = 1;
					gameboard[i][j+2] = 1;
					gameboard[i-1][j+1] = 1;
					completed = true;
					if (completed) 
						{
						break;
						}
					}
				
				}
			if (completed) 
				{
				break;
				}
			}
		return gameboard;
		
		}
		
	public static int[][] piece5(int [][] gameboard)
		{
		boolean completed = false;
		for (int i = 9; i > 0; i--) 
			{
			for (int j = 0; j < 6; j++) 
				{
				if((gameboard[i][j] == 0)&&(gameboard[i-1][j+2]== 0)&&(gameboard[i][j+1]== 0)&&(gameboard[i-1][j+1]== 0)) //If the spaces to place the fifth piece are free then it places piece5 and then it returns the gameboard with the new piece added.
					{
					gameboard[i][j] = 1;
					gameboard[i-1][j+2] = 1;
					gameboard[i][j+1] = 1;
					gameboard[i-1][j+1] = 1;
					completed = true;
					if (completed) 
						{
						break;
						}
					}
				
				}
			if (completed) 
				{
				break;
				}
			}
		return gameboard;
		
		}
	
	public static int[][] piece6(int [][] gameboard)
		{
		boolean completed = false;
		for (int i = 9; i > 0; i--) 
			{
			for (int j = 0; j < 6; j++) 
				{
				if((gameboard[i-1][j] == 0)&&(gameboard[i-1][j+1]== 0)&&(gameboard[i][j+1]== 0)&&(gameboard[i][j+2]== 0)) //If the spaces to place the sixth piece are free then it places piece6 and then it returns the gameboard with the new piece added.
					{
					gameboard[i-1][j] = 1;
					gameboard[i-1][j+1] = 1;
					gameboard[i][j+1] = 1;
					gameboard[i][j+2] = 1;
					completed = true;
					if (completed) 
						{
						break;
						}
					}
				
				}
			if (completed) 
				{
				break;
				}
			}
		return gameboard;
		}
	
	public static int[][] bajarfilas(int[][] gameboard) 
		{
		int [][]gameboardcopy = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
		boolean [] completerow = new boolean [10];
		int contador = 9;
		
		for (int i = 0; i < gameboard.length; i++) 
			{
			completerow[i] = true;
			for (int j = 0; j < gameboard[i].length; j++) 
				{
				if (gameboard[i][j] == 0) 
					{
					completerow[i] = false;
					break;
					}
				}
			}
		
		for (int i = 9; i > 0; i--) 
			{
			if (completerow[i] == false)
				{
				gameboardcopy [contador] = gameboard [i];
				contador--;
				}
			}
		
		return gameboardcopy;
		}
	
	public static boolean endgame(int [][] gameboard)
		{
		boolean endgame = false;
		for (int i = 0; i < 8; i++) 
			{
			if (gameboard[2][i] != 0) 
				{
				endgame = true;
				break;
				}
			}
		return endgame;
		}
	
	public static int [][] pieces(int number, int [][] gameboard)
		{
		int [][] result = new int [10][8];
		if (number == 1) 
			{
			result = piece1(gameboard);
			}
		else if (number == 2) 
			{
			result = piece2(gameboard);
			}
		else if (number == 3) 
			{
			result = piece3(gameboard);
			}
		else if (number == 4) 
			{
			result = piece4(gameboard);
			}
		else if (number == 5) 
			{
			result = piece5(gameboard);
			}
		else if (number == 6) 
			{
			result = piece6(gameboard);
			}
		return result;
		}
	
	public static void nextpiece(int number)
		{
		int [][] result = new int [8][8];
		if (number == 1) 
			{
			System.out.println("*");
			System.out.println("*");
			System.out.println("*");
			}
		else if (number == 2) 
			{
			System.out.println("");
			System.out.println("*");
			System.out.println("*   *   *");
			}
		else if (number == 3) 
			{
			System.out.println("");
			System.out.println("        *");
			System.out.println("*   *   *");
			}
		else if (number == 4) 
			{
			System.out.println("");
			System.out.println("    *    ");
			System.out.println("*   *   *");
			}
		else if (number == 5) 
			{
			System.out.println("");
			System.out.println("    *  *");
			System.out.println("*   *   ");
			}
		else if (number == 6) 
			{
			System.out.println("");
			System.out.println("*   *");
			System.out.println("    *   *");
			}
		System.out.println("");
		
		}
	
		
	public static void main(String[] args) {
	int[][] gameboard = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
	int [][] Piece1 = {{1,0,0},{1,0,0},{1,0,0}};
	int [][] Piece2 = {{0,0,0},{1,0,0},{1,1,1}};
	int [][] Piece3 = {{0,0,0},{0,0,1},{1,1,1}};
	int [][] Piece4 = {{0,0,0},{0,1,0},{1,1,1}};
	int [][] Piece5 = {{0,0,0},{0,1,1},{1,1,0}};
	int [][] Piece6 = {{0,0,0},{1,1,0},{0,1,1}};
	int counter = 0;
	String nextmove;
	Scanner input = new Scanner(System.in);
	
	while (endgame(gameboard) == false) 
		{
		gameboard = bajarfilas(gameboard);
		nextmove = "";
		int random = (int)(Math.random()*6+1);
		if (counter > 0) 
			{
			nextpiece (random);
			}
		gameboard = bajarfilas(gameboard);
		if (counter > 0) 
			{
			gameboard = pieces(random,gameboard);
			}
		for (int i = 2; i < gameboard.length; i++) {
			for (int j = 0; j < 8; j++) {
				if (gameboard[i][j] == 0) 
					{
					System.out.print("_ ");
					}
				else 
					{
					System.out.print("* ");
					}
				
			}System.out.println("");
		}
		System.out.println("Number of pieces = " + counter);
		counter++;
		while (nextmove == "") 
			{
			System.out.println("<Please, press enter>");
			nextmove = input.nextLine();
			}
		if (endgame(gameboard)) 
			{
			System.out.println("GAMEOVER, TRY AGAIN");
			}
		}
	}
		
}