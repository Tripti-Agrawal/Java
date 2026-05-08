public class PowerOfANoRec {
    static void computePower(int num,int pow,int res){
        if (pow==0) {
            System.out.println(res);
            return;
        }
        computePower(num, pow-1, res*num);
    }
    static int computePower2(int num,int pow){
        if(pow==1) return num;
        int res=computePower2(num, pow-1);
        return res*num;
    }
    public static void main(String[] args) {
        computePower(2,5,1);
        int ans=computePower2(2, 5);
        System.out.println(ans);
    }
}
