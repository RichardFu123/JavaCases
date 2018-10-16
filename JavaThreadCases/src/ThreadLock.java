import java.util.Date;
 
public class ThreadLock {
//	04
   public static String obj1 = "obj1";
   public static String obj2 = "obj2";
   public static void main(String[] args) {
      LockA la = new LockA();
      new Thread(la).start();
      LockB lb = new LockB();
      new Thread(lb).start();
   }
}
class LockA implements Runnable{
   public void run() {
      try {
         System.out.println(new Date().toString() + " LockA start");
         while(true){
            synchronized (ThreadLock.obj1) {
               System.out.println(new Date().toString() + " LockA lock obj1");
               Thread.sleep(3000);
               synchronized (ThreadLock.obj2) {
                  System.out.println(new Date().toString() + " LockA lock obj2");
                  Thread.sleep(60 * 1000);
               }
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
class LockB implements Runnable{
   public void run() {
      try {
         System.out.println(new Date().toString() + " LockB start");
         while(true){
            synchronized (ThreadLock.obj2) {
               System.out.println(new Date().toString() + " LockB lock obj2");
               Thread.sleep(3000);
               synchronized (ThreadLock.obj1) {
                  System.out.println(new Date().toString() + " LockB lock obj1");
                  Thread.sleep(60 * 1000);
               }
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}