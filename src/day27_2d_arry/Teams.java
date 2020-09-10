package day27_2d_arry;

public class Teams {

	public static void main(String[] args) {
		String[][] teams=new String[2][4];
		
		teams[0][0]="Max";
		teams[0][1]="Min";
		teams[0][2]="Jon";
		teams[0][3]="Tony";
		
		teams[1][0]="Dod";
		teams[1][1]="BOB";
		teams[1][2]="gig";
		teams[1][3]="Son";
		
		System.out.println("first palyer of the first team :");
		System.out.println(teams[0][0]);
		
		System.out.println("number of the rows : "+teams.length);
		System.out.println("people in the first team : "+teams[0].length);
		
	}
	

}
