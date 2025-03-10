public class PalindromeChecker {

    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean checkPalindrom() {
        for(int i=0;i<text.length()/2;i++) {
            if(text.charAt(i) != text.charAt(text.length()-i-1)) return false;
        }
        return true;
    }

    void displayResult() {
        if(checkPalindrom()) System.out.println("The word "+ text + " is a Palindrome");
        else System.out.println("The word "+ text + " is not a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("Hello");
        PalindromeChecker p2 = new PalindromeChecker("helloolleh");

        p1.displayResult();
        p2.displayResult();
    }
}

// The word Hello is not a Palindrome
// The word helloolleh is a Palindrome
