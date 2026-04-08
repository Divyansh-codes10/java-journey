import java.util.Scanner;

class LongestWordChecker {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String st = in.nextLine();
        
        // Add a space at the end to ensure the last word is considered
        st = st + ' ';
        
        char ch;
        int p = st.length(), max = 0, wordLength = 0;

        for (int i = 0; i < p; i++) 
        {
            ch = st.charAt(i);
            if (ch == ' ') 
            {
                if (wordLength > max) 
                {
                    max = wordLength;
                }
                wordLength = 0; // Reset for the next word
            } 
            else
            {
                wordLength++;
            }
        }

        System.out.println("Length of longest word is: " + max);
    }
}
