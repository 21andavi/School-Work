import java.util.*;
public class evenodd{  
	public static void main(String args[]){
		Scanner newScanner = new Scanner(System.in);
		int a[]= new int[10];  
		for(int count = 0; count < 10; count++){
			System.out.println("Enter INteger");
			int Integer1 = newScanner.nextInt();
			a[count] = Integer1;
		}
		System.out.println("Odd Numbers:");  
		for(int i = 0; i < 10; i++){  
			if(a[i]%2!=0){  
				System.out.println(a[i]);  
			}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<10;i++){  
			if(a[i]%2==0){  
			System.out.println(a[i]);  
			}  
		} 
		System.out.println("Negative Numbers");
		for(int i = 0; i < 10; i++){
			if(a[i] < 0){
				System.out.print(a[i]);
			}
		}
	}
}  
