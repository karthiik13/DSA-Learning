import java.util.Scanner;

public class checkIfArraySorted {

    public static boolean checkIfSorted(int arr[],int n){
        boolean ifSorted = true;
        for(int i=1;i<n;i++){
            if (arr[i-1]>arr[i]){
                ifSorted = false;
            }
        }
        return ifSorted;
    }

    public static void main(String[] args) {
      int [] arr = new int [50] ; 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted: "+ checkIfSorted(arr,n));
        sc.close();  
    }
}
