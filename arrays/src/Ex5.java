
import java.io.*;  
  
public class Ex5  
{  
   public static void main ( String[] args )    
   {  
      int[][] data = { {3, 2, 5},  
                     {1, 4, 4, 8, 13},  
                     {9, 1, 0, 2},  
                     {0, 2, 6, 3, -1, -8} };  
      
    // declare and initialize the max and the min  
      int max;  
      int min;  
      int count = 1;
      
    //    
      for ( int row=0; row < data.length; row++)  
      {  
         max = data[row][0];  
         min = data[row][0];  
           
         for ( int col=0; col < data[row].length; col++)   
         {  
            if(data[row][col] > max)  
               max = data[row][col];  
            else if(data[row][col] < min)  
               min = data[row][col];  
         }  
       
        	 	System.out.println( "row " + count + " maximum " + max ); 
        	 	count++;
         
         
      }        
   }  
}  
