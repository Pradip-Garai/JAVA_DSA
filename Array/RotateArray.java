import java.util.Scanner;

public class  RotateArray{

    public static void main(String as[]){
        Scanner sc = new Scanner(System.in);

        //array 
        int[] arr = {1,2,3,4,5};

        //take user input 
        System.out.print("Enter Number of Rotation : ");
        int n = sc.nextInt();

        while(n!=0){
            
            int temp = arr[arr.length-1];
            for(int i=arr.length-2; i>=0; i--){
                arr[i+1] = arr[i];
            }
            arr[0]=temp;
            n--;
        }

        // after rotation display result 
        System.out.print("After Rotation : ");
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}