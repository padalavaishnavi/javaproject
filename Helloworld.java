package mypackage;

public class Helloworld {
	public void mymethod() {
    	System.out.println("myMethod");
    }
    public void mymethod1() {
    	System.out.println("myMethod1");
    }
    public void mymethod2() {
    	System.out.println("myMethod2");
    }
    
    public static void main(String[] args) {
		Helloworld h = new Helloworld();
		h.mymethod();
		h.mymethod1();
		h.mymethod2();
		System.out.println("Hello World!!");
	}

}
