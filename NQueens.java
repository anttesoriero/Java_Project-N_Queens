/*
 * Purpose: Design and Analysis of Algorithms Assignment 1
 * Status: Complete and thoroughly tested/Incomplete/ Barely started
 * Last update: 02/04/19
 * Submitted:  02/06/19
 * Comment: Both problems and driver included
 * @author: Anthony Tesoriero
 * @version: 2019.02.04
 */

import java.util.Scanner;

public class NQueens 
{
	// Array of queen positions
	private int[] queens;
	// Number of computations
	int compCount;
	// True is solution found
	boolean solution;
	// Number of solutions
	int solnCount;
	
	public NQueens(int n)
	{
		queens = new int[n];
		compCount = 0;
		solution = false;
		solnCount = 0;
	}

	public String test()
	{
		queens[0] = 1;
		queens[1] = 3;
		queens[2] = 0;
		queens[3] = 2;
		print(queens);
		return "1";
	}
	
	public int problem1() 
	{
		int compCount = 0;
		boolean solution = true;
		int solnCount = 0;
		
		for(int i = 0; i < queens.length; i++)
		{
			for(int j = 0; j < queens.length; j++)
			{
				
			}
		}
		
		
		
		
		
		System.out.println("A visual solution for a " + queens.length + "-dimensional board is:");
		
		return compCount;
	}

	public int problem2()
	{
		int solnCount = 0;
		boolean solution = true;
		int compCount = 0;
		System.out.println("Visual solution #" + solnCount + "for a " + queens.length + "-dimensional board is:");
		print(queens);
		
		return compCount;
	}
	
	public static void print(int[] queens) 
	{
		for (int i = 0; i < queens.length; i++) 
		{
			for (int j = 0; j < queens.length; j++) 
			{
				if (queens[i] == j) 
					System.out.print("Q ");
				else           
					System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println();
	}
	
	// Driver
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Problem 1 or 2? ");
		int prob = sc.nextInt();
		System.out.print("Please enter board size: ");
		NQueens queens = new NQueens(sc.nextInt());
		
		switch(prob)
		{
			case 1:
				System.out.println("Number of array entry comparisons performed: " + queens.problem1());
				break;
			
			case 2:
				System.out.println("Total number of array entry comparisons performed: " + queens.problem2());
				break;
			case 3:
				System.out.println("Total number of array entry comparisons performed: " + queens.test());
				break;
			default:
				System.out.println("Invalid Input");
		}
		
		sc.close();

	}

}
