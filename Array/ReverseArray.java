import java.util.Scanner;

public class ReverseArray {
    public static void main(String as[]){
        Scanner sc = new Scanner(System.in);

        // array declaration
        int[] arr = new int[5];
        
        // take input for java
        System.out.print("Enter 5 elements in java : ");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        // reverse array
        int last = arr.length-1;
        int first = 0;

        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

        // print
        System.out.print("Reverse Array : ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
