public class FlipDigit {
    public static void main(String[] args) {
        int num=32145;
        int pos=0;
        int sum=0;
        while(num!=0){
            int lastDigit=num%10;
            pos++;
            int pow=(int)Math.pow(10,lastDigit-1);
            sum+=pos*pow;
            num/=10;
        }
        System.out.println(sum);
    }
}
