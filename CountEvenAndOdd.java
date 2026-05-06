public class CountEvenAndOdd{
    static void countEvenOdd(int range,int even,int odd){
        if(range==0){
            System.out.println("Even no:"+even+" and odd no :"+odd);
            return;
        }
        if(range%2==0) even++;
        else odd++;
        countEvenOdd(range-1,even,odd);

    }
    static int[] countEvenOdd2(int range){
        if(range==0){
            int result[]=new int[2];
            return result;
        }
        int result[]=countEvenOdd2(range-1);
        if(range%2==0) result[0]+=1;
        else result[1]+=1;
        return result;
    }
    public static void main(String[] args) {
        int range=10;
        countEvenOdd(range,0,0);
        int arr[]=countEvenOdd2(10);
        System.out.println("Even:"+arr[0]);
        System.out.println("Odd:"+arr[1]);
    }
}