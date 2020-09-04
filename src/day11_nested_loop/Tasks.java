package day11_nested_loop;

public class Tasks {

	public static void main(String[] args) {
		int x=0;
		
		for(long y=0,z=4;x<5 && y<10;x++,y++) {
			System.out.print(y+" ");
		}
		System.out.println("x = "+x);
		
		System.out.println("----47----");
		for(int i=0;i<7;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----48----");
		
		for(int m=0;m<=7;m++) {
			for(int n=0; n<m;n++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("-------49------");
		for(int h=7;h>0;h--) {
			for(int g=0;g<h;g++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------50------");
		for(int u=0;u<10;u++) {
			for(int y=10;y>u;y--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.print("" );
		
		System.out.println("-------51------");
		
		
	}
	

}
