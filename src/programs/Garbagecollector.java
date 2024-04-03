package programs;

public class Garbagecollector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// create object for garbagecollector
		
		Garbagecollector t1=new Garbagecollector();
		Garbagecollector t2=new Garbagecollector();
		
		// Nullifying the reference variable
		t1=null;
		// request JVM for running Garbage collector
		System.gc();// gc(); method is used to invoke the garbage collector for cleaning process
		
		// Nullifying the reference variable
		t2=null;
		// request JVM for running for Garbage Collector
		Runtime.getRuntime().gc();
		
		

	}
	public void finalize(){// this finalize method is used to performe the cleanup process and it is invoked each time before object is garbage collected
		System.out.println("Garbage collector called");
		System.out.println("Object is Garbage Collected" + this); //object = programs.Garbagecollector@2efa250b  programs.Garbagecollector@203ddea4
	}

}
