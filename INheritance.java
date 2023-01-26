
class A{
	int a,b;
	public void show() {
		System.out.println("Hello!");
	}
}
interface E{
	public void eat();
}
interface F extends E{
	public void sleep();
}

class B extends A {
	int c,d;
	public void write() {
		System.out.println("Writing");
	}
}
class C extends B{
	int d,e;
	public void speak() {
		System.out.println("Speaking!");
	}
}

public class INheritance {

	public static void main(String[] args) {
		
  B b = new B();
     b.show();
	}

}

