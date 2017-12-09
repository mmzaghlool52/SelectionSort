import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(int ar[] , int n){
		for (int i = 0; i < n-1 ; i++)
		{
			int min = i;
			for (int j = i+1; j < n ; j++)
				if (ar[j] < ar[min]) 
					min = j;
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integars number :");
		int n = input.nextInt();
		int x[] = new int[n];
		System.out.print("Enter the numbers to sort :");
		for (int i=0 ; i < n ; i++)
			x[i]= input.nextInt();
		selectionSort(x , n);
		for (int i=0 ; i<n ; i++)
			System.out.println(x[i]);
	}
}
