// LCM of any numbers
class LCM{
    int gcd1(int a ,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    
    int gcd2(int... num){
        int gcd = num[0];
        for(int i=1;i<num.length;i++){
            gcd = gcd1(gcd,num[i]);
        }
        return gcd;
    }
    int lcm1(int a,int b){
        if(a==0 || b==0){
            return 0;
        }
        return a*b/gcd1(a,b);
    }
    
    void lcm2(int... num){
        int lcm = num[0];
        for(int i=1;i<num.length;i++){
            lcm = lcm1(lcm,num[i]);
        }
        System.out.println(lcm);
        
    }
}
public class Main{
    public static void main(String args[]){
        LCM l = new LCM();
        l.lcm2(5,10,20,25);
        l.lcm2(1,2);
    }
}
//output
100
2
