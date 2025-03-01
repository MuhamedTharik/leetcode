//printing all the divisors of a Number
public class Main{
    public static void main(String args[]){
        int num = 56;
        for(int i=1;i<=num;i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
    }
}
