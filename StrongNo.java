public class StrongNo {
    static int fact(int digit){
        int result=1;
        while(digit>1){
            result*=digit;
            digit--;
        }
        return result;
    }
    public static void main(String[] args) {
        int num=145;
        int cpy=num;
        int sum=0;
        while(cpy!=0){
            int digit=cpy%10;
            sum+=fact(digit);
            cpy/=10;
        }
        System.out.println(num==sum?"Strong No.":"Not a Strong No.");
    }
}
