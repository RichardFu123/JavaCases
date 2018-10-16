public class ThreadInterrupt extends Thread { 
//	07
    public void run() 
    { 
        try 
        { 
            sleep(50000); 
        } 
        catch (InterruptedException e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    } 
    public static void main(String[] args) throws Exception 
    { 
        Thread thread = new ThreadInterrupt(); 
        thread.start(); 
        System.out.println("input any thing to interrupt"); 
        System.in.read(); 
        thread.interrupt(); 
        thread.join(); 
        System.out.println("thread interrupted"); 
    } 
}