package day1;


public class Wombat implements Runnable {
		   private int i;
		   public synchronized void run() { 
			   if (i%5 != 0) { 
				   i++; 
			   }     
		   
		   for(int x=0; x<5; x++, i++) 
		{
		if (x > 1) 
			Thread.yield(); 
		}
	     System.out.print(i + " "); 
	     }
	     public static void main(String[] args) {
	    	 Wombat n = new Wombat();
	    	 for(int x=100; x>0; --x) {
	    		 new Thread(n).start();
	    		 }
	    	 } 
	     }




/* output:
5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100 105 110 115 120 125 130 135 140 145 150 155 160 165 170 175 180 185 190 195 200 205 210 215 220 225 230 235 240 245 250 255 260 265 270 275 280 285 290 295 300 305 310 315 320 325 330 335 340 345 350 355 360 365 370 375 380 385 390 395 400 405 410 415 420 425 430 435 440 445 450 455 460 465 470 475 480 485 490 495 500 
*/