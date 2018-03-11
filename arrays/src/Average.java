
 import java.io.* ;  
  
public class Average {  
   public static void main ( String[] args )  
   {  
      int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,  
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,  
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};  
      Weight june = new Weight( values );  
      june.print();  
      System.out.println("Average: "+june.average());  
   }  
   static class Weight  
   {  
      int[] data;  
     
      Weight(int[] init)  
      {  
         data = new int[init.length];   
                 
         for (int j=0; j<data.length; j++)  
         {  
            data[j] = init[j];  
         }  
      }  
     
     
      int average() {  
         int sum = 0;  
         for (int i=0; i<data.length; i++)  
            sum += data[i];  
         return sum/data.length;  
      }  
              
      void print()  
      {  
         int count = 0;  
         for (int j=0; j<data.length; j++)  
         {  
            System.out.print(data[j] + " ");  
            count++;  
            if (count%7==0)   
               System.out.println();   
         }  
         System.out.println();  
      }   
   }  
}  