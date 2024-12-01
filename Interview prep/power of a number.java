// power of the number
public class Main{
    public static void main(String args[]){
        int base = 2;
        int exp = 3;
        System.out.println(power(base,exp));
        
    }
    public static int power(int base,int exp){
        int result =1;
        for(int i=0;i<exp;i++){
            result*=base;
        }
        return result;
    }
}
// output
// 8
