import java.io.*;
import java.util.*;
public class array {
	public static void main(String[] args) {
		int[][] data =  {{3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}};

		int longestRow = 0;
		for ( int row=0; row < data.length; row++)
		{
			if ( data[row].length > longestRow )
			{
				longestRow = data[row].length;
            }
		}
		
		int columnSums[] = new int[longestRow];
		
		for ( int i = 0; i < data.length; i++ )
		{
		        for (int j = 0; j < data[i].length; j++)
		        {
		                columnSums[j] +=data[i][j];
		        }
		}
		System.out.println("The sums of each column are: ");

		for (int i = 0; i < columnSums.length; i++) {
		        System.out.println("Column " + i + ": " + columnSums[i]);
		   }
	}
}
