package day44_errorHandling_exception;

public class CheckVSuncheck {

	public static void main(String[] args){
		
		try {
			Thread.sleep(3000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
