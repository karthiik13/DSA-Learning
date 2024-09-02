import java.util.Scanner;

public class secondLargestElement {

    public static int second_LargestElement(int arr[],int n){
        int largest = arr[0];
        int sLargest = -1;
        for(int i=0; i<n;i++){
            if(arr[i]>largest){
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i]< largest && arr[i]>sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int [] arr = new int [50] ; 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sLargestElement = second_LargestElement(arr, n);
        System.out.println(sLargestElement);
        sc.close();
    }
}