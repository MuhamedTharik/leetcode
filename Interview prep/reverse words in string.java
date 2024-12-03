// reversing the words in string with single space

public class Main{
    public static void main(String args[]){
        String s = "My name is Muhamed Tharik";
        System.out.println(reverseString(s));
        
    }
    public static String reverseString(String s){
        String[] str = s.split("\\s+");
        String res="";
        for(int i=str.length-1;i>=0;i--){
            res+=str[i]+" ";
        }
        return res.trim();
    }
}
// output
//Tharik Muhamed is name My
