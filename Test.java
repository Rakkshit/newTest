public class Test
{
   public static void main(String args[])
   {
      System.out.println("Sup fam?");
      printer("Aaight");
      System.out.print(divide(11,2));
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
      return a/(float)b;
   }
}