public class ThreadHangUp extends Thread {
//	06
   private int countDown = 5;
   private static int threadCount = 0;
   public ThreadHangUp() {
      super("" + ++threadCount);
      start();
   }
   public String toString() { 
      return "#" + getName() + ": " + countDown;
   }
   public void run() {
      while (true) {
         System.out.println(this);
         if (--countDown == 0)
            return;
         try {
            sleep(100);
         }
         catch (InterruptedException e) {
            throw new RuntimeException(e);
         }
      }
   }
   public static void main(String[] args) 
   throws InterruptedException {
      for (int i = 0; i < 5; i++)
      new ThreadHangUp().join();
      System.out.println("Thread paused");
   }
}