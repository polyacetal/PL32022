class XYVectorCalc
{
   static double in(XYVector a, XYVector b)
   {
       double kotae;
       kotae = a.x*b.x + a.y*b.y;
       return(kotae);
   }
   static void puls(XYVector a, XYVector b, XYVector c)
   {
      c.x = a.x + b.x; 
      c.y = a.y + b.y; 
   }
   static void minu(XYVector a, XYVector b, XYVector c)
   {
      c.x = a.x - b.x; 
      c.y = a.y - b.y; 
   }
}