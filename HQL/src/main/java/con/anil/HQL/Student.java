package con.anil.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	private int roll_no;
	@Id
	private int id;
	private String name;
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", id=" + id + ", name=" + name + "]";
	}
	
	
}
