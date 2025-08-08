package Gio;

public class Bird {
      public void sing() {
    	  System.out.println("Twee twee twee");
    	  
      }
      public void fly() {
    	  System.out.printf ("Fly low");
    	  
      }
      public static void main(String[] args) {
    	  Bird b=new Bird();
    	  b.sing();
    	  b.fly();
      }

}
