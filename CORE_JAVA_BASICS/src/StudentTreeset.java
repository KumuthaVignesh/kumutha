
public class StudentTreeset implements Comparable<StudentTreeset>{
	int id;
	String name;
	int age;

	StudentTreeset(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int compareTo(StudentTreeset b)
	{
		 if(id>b.id){  
		        return 1;  
		    }else if(id<b.id){  
		        return -1;  
		    }else{  
		    return 0;  
		    }  
		}
	}

