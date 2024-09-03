import java.util.Scanner;

public class LargestElementArray {

    public static int largestElement (int [] arr, int n) {
        int largest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int [] arr = new int [50] ; 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = largestElement(arr, n);
        System.out.println(largest);
        sc.close();
    }
     
}