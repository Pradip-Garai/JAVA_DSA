import java.util.Scanner;

public class ReverseString{
     public static String reverseString(String s) {
        
        // check String is empty or not 
        if(s.length()==0)
          return s;
          
          
        // create an new String using String builder
        StringBuilder st = new StringBuilder(s);
        
        int len = st.length()-1;
        
        int first = 0;
        int last = len;
        
        while(first<last){
            char temp = st.charAt(first);
            st.setCharAt(first, st.charAt(last)); 
            st.setCharAt(last, temp);

            first++;
            last--;
        }
        
        return st.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        System.out.println("Reverse String : "+reverseString(s));

        sc.close();
    }
}