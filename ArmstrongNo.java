public class ArmstrongNo {
    public static void main(String[] args) {
        int num=100;
        int cpy=num;
        int sum=0;
        int count=0;
        while(cpy!=0){
            count++;
            cpy/=10;
        }
        cpy=num;
        while(cpy!=0){
            int lastDigit=cpy%10;
            sum+=(int)Math.pow(lastDigit,count);
            cpy/=10;
        }
        System.out.println(num==sum?"Armstrong No.":"Not an Armstrong No.");
    }
}
