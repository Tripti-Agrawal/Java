public class EvenAndOddFindOut {
    public static void main(String[] args) {
        int n=12;

        //Approach1
        if(n%2==0) System.out.println("even");
        else System.out.println("odd");

        //Approach2
        if((n^1)==n+1) System.out.println("even");
        else System.out.println("odd");

        //Approach3
        if((n&1)==0) System.out.println("even");
        else System.out.println("odd");

        //Approach4
        if((n|1)>n) System.out.println("even");
        else System.out.println("odd");

    }
}
