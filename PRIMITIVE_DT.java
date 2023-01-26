public class PRIMITIVE_DT {
	public static void main(String[] args) {
		int x = 5;
		 int y = 7;
		 System.out.println(" X is : " + x);
		 System.out.println(" Y is : " + y);
		 
			 byte b = 10;
			 System.out.println("B is :"+ b);
			 
			  int i = b;//Implicit Type casting or Widening or Up-Casting
			  System.out.println("I is :"+ i);
			  
			  byte b2 =  (byte)129;//Explicit Type casting or Narrowing or down-Casting
			  System.out.println("B is :"+ b2);
			  
			  byte b3 =  (byte)128;//Explicit Type casting or Narrowing or down-Casting
			  System.out.println("B is :"+ b3);
				
			 
			  byte b4 =  (byte)256;//Explicit Type casting or Narrowing or down-Casting
			  System.out.println("B is :"+ b4);
			  float f =(float) 5.5;
			  float f2 = 5.5f;
			  char ch = 'a';
			  System.out.println(ch);
			  
			  char c = 'a';
			   int xa = c;
			    System.out.println("Value of xa :" +xa);
			    System.out.println((int)('a'));
			    System.out.println((int)('A'));
			    
			    // We will require 'A'-> 0, 'Z' -> 25
			    char c3 ='g';
			    int g = c3-'a';
			    System.out.println("G is : " + g);
			  
			    
			  int z = x +y;
				// +,-> operator
			  //x,y-> operands
			  
			  // INcrement and Decrement Operators
			  int m =5;
			   int n = m++;
			    System.out.println(" M is : "+ m+ ", N is: " + n);
			   
			    int p =5;
				   int q = ++p;
				    System.out.println(" P is : "+ p+ ", Q is: " + q);
				  
				    // we want to create objects out of variable x
				     Integer x1 =new Integer(x);
				     System.out.println(x1);
			  
			 
	}

}
