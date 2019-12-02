package com.bridgelabz.fellowshipprogram.logical;

public class Tictactoe {
	public static final int X=1,O=-1;
	public final int Empty=0;
	public int player=X;
	public boolean isEmpty=false;
	int board[][]=new int[3][3];
	
	public void position(int n)
	{
		if(n<=0 || n>=10)
		{
			System.out.println("Enter valid position");
		}
		if(n>0 || n<10)
		{
			switch(n)
			{
			 case 1:
				 board[0][0]=player;
				 break;
			 case 2:
				 board[0][1]=player;
				 break;
			 case 3:
				 board[0][2]=player;
				 break;
			 case 4:
				 board[1][0]=player;
				 break;
			 case 5:
				 board[1][1]=player;
				 break;
			 case 6:
				 board[1][2]=player;
				 break;
			 case 7:
				 board[2][0]=player;
				 break;
			 case 8:
				 board[2][1]=player;
				 break;
			 case 9:
				 board[2][2]=player;
				 break;
			}
			player=-player;
		}
	}
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		isEmpty=false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				switch(board[i][j])
				{
				case X:
					sb.append("X");
					break;
				case O:
					sb.append("O");
					break;
				case Empty:
					sb.append(" ");
					isEmpty=true;
					break;
				}
				if(j<2) 
				{
					sb.append("|");
				}
				if(i<2)
				{
					sb.append("\n--------\n");
				}
			}
		}
	}

	public static void main(String[] args) {
		

	}

}
