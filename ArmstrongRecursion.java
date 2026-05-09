public class ArmstrongRecursion {
    static int countDigit(int num){
        if(num==0) return 0;
        int count=countDigit(num/10);
        return count+1;
    }
    static void computeArmstrong(int num,int sum,int cpy,int count){
        if(num==0){
            if(cpy==sum) System.out.println("Armstrong");
            else System.out.println("Not an Armstrong");
            return;
        }
        int lastDigit=num%10;
        int res=(int)Math.pow(lastDigit,count);
        sum+=res;
        computeArmstrong(num/10, sum, cpy, count);
    }
    public static void main(String[] args) {
        int num=153;
        int count=countDigit(num);
        computeArmstrong(num, 0, num, count);
    }
}
