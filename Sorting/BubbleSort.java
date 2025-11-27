package Sorting;
import java.util.Scanner;

public class BubbleSort{
    public static void main(String as[]){
        Scanner sc = new Scanner(System.in);

        //array 
        int[] arr = {9,7,0,1,8,4,100,-1};


        // bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // print sorted array
        System.out.print("Sorted Array : ");
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}