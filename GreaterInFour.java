public class GreaterInFour {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=150;
        int d=30;
        if(a>b){
            if(a>c){
                if(a>d) System.out.println("A is greater");
                else System.out.println("D is greater");
            }
            else{
                if(c>d) System.out.println("C is greater");
                else System.out.println("D is greater");
            }
        }
        else{
            if(b>c){
                if(b>d) System.out.println("B is greater");
                else System.out.println("D is greater");
            }
            else{
                if(c>d) System.out.println("C is greater");
                else System.out.println("D is greater");
            }
        }
    }
}
