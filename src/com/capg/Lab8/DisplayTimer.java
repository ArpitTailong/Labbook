package com.capg.Lab8;

import java.util.Date;

public class DisplayTimer {
   public static void main(String[] args) {
	   
      Task t1= new Task();
      Thread t= new Thread(t1);
     
      t.start();
   }
}
class Task implements Runnable {
	
   @Override
   public void run() {
	   for(int i=0;i<5;i++) {
			      try {
			    	  Date d= new Date();
			    	  System.out.println(d);
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	   }
   }
}