// Isogram code
public class Main{
    public static void main(String args[]){
        String s = "Geek";
        System.out.println(isoGram(s));
        
    }
    public static boolean isoGram(String s){
        String str = s.toLowerCase();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
// output false e is repeating two times
