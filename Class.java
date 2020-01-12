public class Class
{
   private int x, y;

   public Class (int xValue, int yValue)
   {
     x = xValue;
     y = yValue;
   }            
   public void m1()
   {
     x = 30;
     System.out.print((y + 1) + " ");
   }
   public void m2()
   {
     m1();
     System.out.print(x + " ");
   }
}
