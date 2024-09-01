
import java.util.*;
public class Sorting {
    static void selection_sort(int arr[], int n) {
        for(int i=0; i<=n-2;i++){
            int min = i;
            for(int j =i; j<= n-1;j++){
                if(arr[min]>arr[j]){
                    min = j; 
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[],int n){
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {

        int [] arr = new int [50] ; 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //selection_sort(arr, n);
        bubbleSort(arr, n);
        sc.close();
    }
}
