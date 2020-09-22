package day39_finalKey;

public class ParentTest {

	public static void main(String[] args) {
			
		Child s=new Child();
		Parent p=new Parent();
		
		System.out.println("value of the x before inc"+s.x);
		
		s.inc();
		
		System.out.println("value of the x after inc "+s.x);
		
		System.out.println("valueof the x from parent :"+p.x);
		p.inc();
		System.out.println("value of the x after inc from parent class "+ p.x);
	}

}
