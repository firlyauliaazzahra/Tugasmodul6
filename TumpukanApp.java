public class TumpukanApp {
   public static void main (String [] args) {
       Tumpukan tumpukan=new Tumpukan(10);
       tumpukan.push(50);
       tumpukan.baca();
       tumpukan.push(100);
       tumpukan.baca();
       tumpukan.pop(100);
       tumpukan.baca();
       long nilail=tumpukan.pop();
       System.out.println("nilai = "+nilail);
       System.out.println(" ");
       tumpukan.push(60);
       tumpukan.baca();
       tumpukan.push(80);
       tumpukan.baca();
       tumpukan.pop(80);
       tumpukan.baca();
       long nilai2 =tumpukan.pop();
       System.out.print("nilai2 = "+nilai2);
       System.out.println(" ");
       long nilai 3 =tumpukan.pop();
       System.out.println("nilai3 ="+nilai3);
       System.out.println(" ");
       tumpukan.baca();
       
   }
}
      
       
   

