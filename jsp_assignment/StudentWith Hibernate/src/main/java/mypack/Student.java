package mypack;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="studentid",nullable=false)		
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	int studentId;
	String Name;
	String Address;
	String Login;
	String Email;
	String Password;
	
	public String getName() {
		return Name;
	}
	
	@Column(name="name")
	public void setName(String name) {
		Name = name;
	}
	
	@Column(name="address")
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	@Column(name="login")
	public String getLogin() {
		return Login;
	}
	
	public void setLogin(String login) {
		Login = login;
	}
	
	@Column(name="email")
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	@Column(name="password")
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", Name=" + Name + ", Address=" + Address + ", Login=" + Login
				+ ", Email=" + Email + ", Password=" + Password + "]";
	}
	
	

}
