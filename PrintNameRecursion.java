public class PrintNameRecursion {
    static void printName(int num){
        if(num==0) return;
        System.out.println("Tripti agrawal");
        printName(num-1);
    }
    public static void main(String[] args) {
        printName(5);
    }
}
