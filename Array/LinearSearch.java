import java.util.Scanner;

public class LinearSearch {
    public static void main(String as[]){
        Scanner sc = new Scanner(System.in);

        //array 
        int[] arr = {9,7,0,1,8,4,100,-1};

        // user input
        System.out.print("Enter data want to search : ");
        int data = sc.nextInt();

        // Linear Search
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
               System.out.println(data+" found at index "+i);
               flag=true;
               break;
            }
        }

        if(flag==false)
            System.out.println(data+" not found!!!");

        sc.close();
    }
}
