import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {

        String s1 = "geeks";
        String s2 = "kseeg";
        
          
        // convert both string to char array for sorting 
        char[] arr = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arr2);
        
        
        String str = new String(arr);
        String str2 = new String(arr2);
        
        // now check if both string are same or not 
        if(str.equals(str2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
