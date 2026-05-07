public class PalindromeRecursion {
    static void palindrome(int num,int rev,int cpy){
        if(num==0){
            System.out.println((rev==cpy)?"Palindrome":"Not a palindrome");
            return;
        }
        int lastDigit=num%10;
        rev=rev*10+lastDigit;
        palindrome(num/10, rev, cpy);
    }
    public static void main(String[] args) {
        int num=151;
        int cpy=num;
        palindrome(num,0,cpy);
    }
}
