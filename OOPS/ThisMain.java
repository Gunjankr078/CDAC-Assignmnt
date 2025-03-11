
public class ThisMain {

	public static void main(String[] args) {
		
//	
//		ThisArgument a1 = new ThisArgument("pal",50000,7415);
//			    a1.Display();
//		ThisArgument a2 = new ThisArgument("gun",60000,9754);
//				a2.Display();
		
		ThisKeyword s1 = new ThisKeyword();
		ThisKeyword s2 = new ThisKeyword();
		ThisKeyword s3 = new ThisKeyword();
		s1.Display();
		s2.Display();
		s3.Display();
		
		ThisKeyword.DisplayTotal();
		
		
	}

}
