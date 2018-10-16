public class ThreadAllThreads extends Thread {
//	10
   public static void main(String[] args) {
	   ThreadAllThreads t1 = new ThreadAllThreads();
      t1.setName("thread1");
      t1.start();
      ThreadGroup currentGroup = 
      Thread.currentThread().getThreadGroup();
      int noThreads = currentGroup.activeCount();
      Thread[] lstThreads = new Thread[noThreads];
      currentGroup.enumerate(lstThreads);
      for (int i = 0; i < noThreads; i++)
      System.out.println("Thread: " + i + " = " + lstThreads[i].getName());
   }
}