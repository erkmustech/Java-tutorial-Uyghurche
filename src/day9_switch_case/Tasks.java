package day9_switch_case;

public class Tasks {

	public static void main(String[] args) {
		/*
		 *Task-37
Write a program that lets user to enter apple,dell,acer laptop models If it is apple show “Apple-no virus”
If it is dell show “Tough one”
If it is acer show “Not recommended”
Else “do not buy that one!”
		 */
		
		String lep="apple1";
		
		switch(lep){
			case"apple":
				System.out.println("apple no virus");
				break;
			case "HP":
				System.out.println("tough lep");
				break;
			case "ace":
				System.out.println("don't recommand");
				break;
			case "other":
				System.out.println("dont'buy");
				break;
				
			default:
				System.out.println("invalid input ");
		}
		
		
		
	}

}
