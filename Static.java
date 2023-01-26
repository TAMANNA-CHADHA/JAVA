class Studunt{
	int rollNo;
	String name;
	static int count =0;
	Studunt(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}
		static void showCount() {
		System.out.println(count);
	}
}

public class Static {
	public static void main(String[] args) {
	
		Studunt s1 = new Studunt(1, "Ram");
		// System.out.println(s1.count);
		 

			
		 Studunt s2 = new Studunt(2, "sham");
		// System.out.println(s2.count);

			
		 Studunt s3 = new Studunt(3, "Aman");
		// System.out.println(s3.count);
		 System.out.println(Studunt.count);

			
	
		 
	}

}
