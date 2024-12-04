// finding the first occurence in a string

public class Main{
    public static void main(String args[]){
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
        
    }
    public static int strStr(String haystack,String needle){
        int m = haystack.length();
        int n = needle.length();
        
        for(int i=0;i<m-n+1;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

//output  0
