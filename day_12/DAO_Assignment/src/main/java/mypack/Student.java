package mypack;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Student implements Serializable{
	int rollNo;
	String name;
	String address;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	

	
}
