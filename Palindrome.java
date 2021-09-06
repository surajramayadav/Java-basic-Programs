public class Palindrome {
   public static void main(String[] args) {
       int num=151,temp=151,rev=0;
       while(num!=0){
           rev=rev*10+num%10;
           num=num/10;
       }
       System.out.println("palindrome"+rev);
       if(rev==temp)
       {
        System.out.println("palindrome");
       }else{
        System.out.println("not palindrome");
       }
   } 
}
