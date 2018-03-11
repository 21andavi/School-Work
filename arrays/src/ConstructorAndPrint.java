
public class ConstructorAndPrint {  
    public static void main ( String[] args )  
    {  
       int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,  
                     105, 106, 105, 103, 104, 103, 105, 106, 107, 106,  
                     105, 105, 104, 104, 103, 102, 102, 101, 100, 102};  
       Weight june = new Weight( values );  
       june.print();  
    }  
    static class Weight  
    {  
       int[] data;  
      
    // Constructor  
       Weight(int[] init)  
       {  
          data = new int[init.length]; 
         
       // Copy values from the   
       // input data to data.  
          for (int j=0; j<data.length; j++)  
          {  
             data[j] = init[j];  
          }  
       }  
      
    //Print  
       void print()  
       {  
          int count = 0;  
          for (int j=0; j<data.length; j++)  
          {  
             System.out.print(data[j] + " ");  
             count++;  
             if (count%7==0) //if i is a multiple of 7  
                System.out.println(); //go to the next line  
          }  
       }   
    }  
 } 