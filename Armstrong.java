public class Armstrong {
  public static void main(String[] args) {
      int num=270,rev=0,temp=270,sum=0;
      while(num !=0){
          rev=num%10;
          num=num/10;
          sum=sum+rev*rev*rev;
      }
      if(temp==sum)
      {
          System.out.println("armstrong number");
      }
      else{
        System.out.println("not armstrong number");
      }

  }  
}
