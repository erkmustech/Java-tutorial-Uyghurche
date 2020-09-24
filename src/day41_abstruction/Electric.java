package day41_abstruction;

public interface Electric {
	
	public static final boolean HAS_BAT=true;
	boolean hs=false; // public final static
	
	public abstract void charge();
	void charge2();// public abstract auto
	
	public default void readTopics() {
		
	}
	public static void years() {
		
	}

}
