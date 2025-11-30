import java.util.Scanner;

public class binarySearch{

    public int binarysearch(int[] arr,int target){

        int fast = 0;
        int last = arr.length-1;

        // loop
        while(fast<=last){
           int mid = (fast+last)/2;

           if(arr[mid]==target)
            return mid;
           else if(arr[mid]>target)
             last = mid-1;
            else 
                fast = mid+1;
        }

        return -1;
    }
    public static void main(String as[]){
        Scanner sc = new Scanner(System.in);
        binarySearch obj = new binarySearch();

        // array
        int[] arr = {2,6,10,18,21,100,110,200};

        // take user input
        System.out.print("Enter Element you want to search : ");
        int target = sc.nextInt();

        // function calling for binarySearch
        int index = obj.binarysearch(arr,target);
        if(index!=-1)
            System.out.println(target+" found at index "+index);
        else
            System.out.println(target+" not found!!!");


        sc.close();
    }
}