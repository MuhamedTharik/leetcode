// fibonacci series
public class Main{
    public static void main(String args[]){
        int num=10;
        fibo(num);
        
    }
    public static void fibo(int num){
        int a=0,b=1;
        for(int i=1;i<=num;i++){
            System.out.print(a+" ");
            int temp = a+b;
            b = a;
            a =temp;
        }
    }
}
//output 0 1 1 2 3 5 8 13 21 34 
