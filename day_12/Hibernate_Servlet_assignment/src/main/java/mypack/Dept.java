package mypack;
import jakarta.persistence.*;
@Entity
@Table(name = "Dept")
public class Dept 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	public int getId() 
	{
		return id;
	}
	
	int id;
	String location;
	String deptName;
	
	@Column(name="Loc")
	public String getLoaction() {
		return location;
	}
	
	public void setLoaction(String location) {
		this.location = location;
	}
	
	@Column(name="DeptName")
	public String getDeptName() {
		return deptName;
	}
	
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", loaction=" + location + ", deptName=" + deptName + "]";
	}
	
	

}
