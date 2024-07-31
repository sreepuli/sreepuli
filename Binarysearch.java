import java.util.Arrays;
import java.util.Scanner;
public class Binarysearch{
	public static int binarysearch(int[]arr,int left ,int right,int key){
		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]==key)
				return mid;
			if(arr[mid]>key)
				return binarysearch(arr,left,mid-1,key);
			else
				return binarysearch(arr,mid+1,right,key);
		}
		return -1;
			
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("enter the number of elements");
		int n = input.nextInt();
		int[] arr =new int[n];
		System.out.println("enter "+n+"sorted elements");
		 for(i=0;i<n;i++)
		 	arr[i] = input.nextInt();
		 System.out.println("enter the element to sort");
		 int key =  input.nextInt();
		 int result = binarysearch(arr,0,arr.length-1,key);
		 if(result==-1)
			System.out.println("key is not found");
		else
			System.out.println("key is found at index: "+result);
	}
}
