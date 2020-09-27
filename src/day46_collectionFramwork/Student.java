package day46_collectionFramwork;

public class Student implements Comparable<Student>{
		
	private int id;
	private String name;
	
	public Student(int id, String name) { 
		
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student another) {
		if(this.id>another.id) {
			return 1;
		}else if( this.id<another.id){
			return -1;
			
		}else {
			return 0;
		}
	}
	
	
}
