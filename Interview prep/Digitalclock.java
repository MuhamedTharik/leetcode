// Digital clock using java 
// here we are using blush to delete the variable and sleep to hold the screen for the some time
public class Main{
    public static void main(String args[]) throws InterruptedException{
        int h = 8;
        int m = 38;
        int s = 0;
        
        while(true){
            System.out.printf("\r %02d:%02d:%02d",h,m,s);
            System.out.flush();
            Thread.sleep(1000);
            s+=1;
            
            if(s==60){
                m+=1;
                
            } else if(m == 60){
                h+=1;
                m+=1;
                
            } else if(h == 12){
                h=0;
                m=0;
                s=0;
            }
        }
        
    }
}
