 public class MyThread extends Thread {

	 String name;
	 
	 public MyThread(String name){
	       this.name = name;

	 }
	 
	 
    public void run(){

       System.out.println("MyThread running");
       System.out.println(name + ": Say my name first!");

    }
  }