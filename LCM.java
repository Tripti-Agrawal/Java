public class LCM {
    public static void main(String[] args) {
        int a=12;
        int b=24;
        int aCopy=a;
        int bCopy=b;
        while(a!=b){
            if(a>b) a-=b;
            else b-=a;
        }
        int lcm=(aCopy*bCopy)/b;
        System.out.println(lcm);
    }
}
