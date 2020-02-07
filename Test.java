public class Test
{
   public static void main(String args[])
   {
      System.out.println("Sup fam?");
      printer("Aaight");
      System.out.print(divide(11,0));
   }
   
   public static void printer(String s)
   {
      printerCeption(s);
   }
   
   public static void printerCeption(String s)
   {
      System.out.println(s);
   }
   
   public static float divide(int a, int b)
   {
      if(b!=0)
      {
         return a/(float)b;
      }
      else
      {
         return -1;  
      }
   }
}