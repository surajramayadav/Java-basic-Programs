public class stringreverse {
    public static void main(String[] args) {
        String str="tata",res="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            res=res+str.charAt(i);
        }
        System.out.println(res);
    }
}
