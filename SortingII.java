import java.util.Scanner;

public class SortingII {

    public static void qSort(int [] arr, int low, int high){
        if(low<high){
            int pIndex = partition(arr,low,high);
            qSort(arr, low, pIndex-1);
            qSort(arr,pIndex+1,high);
        }
    }

    public static int partition(int [] arr, int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<= high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
             }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }

    public static void quickSort(int [] arr, int n){
        qSort(arr,0,n-1);
        System.out.println("After Insertion sort:");
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
        quickSort(arr, n);
        sc.close();
    }
}
