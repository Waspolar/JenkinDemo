 public class MyThread extends Thread {

	 String name;
	 
	 public MyThread(String name){
	       this.name = name;

	 }
	 
	 
    public void run(){

        System.out.println(Thread.currentThread().getName() + " is running...");    
       System.out.println(name + ": Say my name first!");

    }
  }