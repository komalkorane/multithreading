package com.deadlock;

public class SyncThread implements Runnable {

	  private Object obj1;
	   private Object obj2;
	   public SyncThread(Object o1, Object o2){
	      this.obj1=o1;
	      this.obj2=o2;
	   }
	   
	   public void run() {
	      String name = Thread.currentThread().getClass().getSimpleName();
	    		  System.out.println(name + " acquiring lock on " + obj1);
	      synchronized (obj1) {
	         System.out.println(name + " acquired lock on " + obj1);
	         work();
	      }
	      System.out.println(name + " released lock on " + obj1);
	      System.out.println(name + " acquiring lock on " + obj2);
	      synchronized (obj2) {
	         System.out.println(name + " acquired lock on " + obj2);
	         work();
	      }
	      System.out.println(name + " released lock on " + obj2);
	      System.out.println(name + " finished execution.");
	   }
	   private void work() {
		      try {
		         Thread.sleep(5000);
		      } catch (InterruptedException ie) {
		         ie.printStackTrace();
		      }
		   }
	
	
	
}
