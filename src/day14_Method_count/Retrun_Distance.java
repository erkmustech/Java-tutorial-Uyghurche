package day14_Method_count;

public class Retrun_Distance {

	public static void main(String[] args) {
		
		double dis=dis(120,5);
		System.out.println(dis);
		if(dis>500) {
			System.out.println("you spend  gas ok");
		}else if(dis<500 && dis>400) {
			System.out.println("you spend too much gas");
		}else {
			System.out.println("change vehical");
		}
		
		
	}

	private static double dis(int speed, int hour) {
		double dis=speed*hour;
		return dis;
	}

}
