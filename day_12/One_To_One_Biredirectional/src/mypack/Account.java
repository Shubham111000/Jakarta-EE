package mypack;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="account")
public class Account 
{
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", company=" + company + "]";
	}
	private int id;
	private double balance;
	
	 private Company company;
	 
	 @OneToOne(mappedBy="acc") // all the mapping will be done
	// by "acc" i.e. Account. Foreign key will be created in
	 // company table by the column name "acc_accid"
	 public Company getCompany() 
	 { 
		 return company; 
	 } 
	 public void setCompany(Company company) 
	 { 
		 this.company = company; 
	 }
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="accid")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="balance")
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
