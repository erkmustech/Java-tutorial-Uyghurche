package day26_array;

public class Task93 {

	public static void main(String[] args) {
		/*
		 “As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a burst of
		  light that had ricocheted from his temple, and saw, with that quick smile with which we greet a rainbow
		   or a rose, a blindingly white parallelogram of sky being unloaded from the van—a dresser with mirrors 
		   across which, as across a cinema screen, passed a flawlessly clear reflection of boughs sliding and 
		   swaying not arboreally, but with a human vacillation, produced by the nature of those who were carrying 
		   this sky, these boughs, this gliding façade.”
		 */
		
		String ls="As he crossed toward the pharmacy at the corner he involuntarily turned his head because "
				+ "of a burst of light that had ricocheted from his temple, and saw, with that quick smile with "
				+ "which we greet a rainbow or a rose, a freedom blindingly white parallelogram of sky being unloaded "
				+ "from the van—a dresser with mirrors across which, as across a cinema screen, passed a flawlessly "
				+ "clear reflection of boughs sliding and swaying not arboreally, but with a human vacillation, "
				+ "produced by the nature of those who were carrying this war sky, these boughs, this gliding façade.";
		
	    System.out.println("this sentence is consist of " +ls.split(" ").length+" words");
	    
	    String[] sensitive_words={"temple","mosque","church","muslim","chirsitian","war","freedom","liberty","party",
	    		"human_right","democracy","woman'sright","uighurs"};
	    int count=0;
	    System.out.println("no ---   sensitive words");
	    
	    for(int i=0;i<sensitive_words.length;i++) {
	    if(ls.contains(sensitive_words[i])) {
	    	System.out.println(i+" \t "+sensitive_words[i]);
	        count++;
	    }

         }
	    System.out.println("this sentence contain "+count+" sensitive words");

   }
}
