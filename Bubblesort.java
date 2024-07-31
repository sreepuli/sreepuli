import java.util.Arrays;
import java.util.Scanner;
public class Bubblesort{
	public static int bubblesort(int[]arr){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return 0;
	}
public static void main(String[] args){
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elemnts");
		int n= input.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter "+n + "elements");
			for(i=0;i<n;i++)
				arr[i]=input.nextInt();
		System.out.println("original array");
			for(i=0;i<n;i++)
			System.out.printf("%4d",arr[i]);
		int result = bubblesort(arr);
		System.out.println("\nsorted list");
			for(i=0;i<n;i++)
				System.out.printf("%4d",arr[i]);
	}
		
}
