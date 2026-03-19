package Pass;

interface waterbottleinterface{
	String colour="blue";
	void full();
	void pourout();
	
}
public class interfaceexample implements waterbottleinterface {
	 public static void main(String[] args) {
		 System.out.println("slow");
	 }
		 
		 public void full() {
			 System.out.println("It is filled");
		 }
		 public void pourout() {
			 System.out.println("pourout");
		 }
	 
}
