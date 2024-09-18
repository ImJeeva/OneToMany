package OneToMany;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customerdetails")
public class CustDetails {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "salary")
	private String salary;
	
	@OneToOne(mappedBy = "cid",cascade = CascadeType.ALL)
	private Customer cid;
	
	public CustDetails() {
		
	}
	public CustDetails(int id, String email, String salary) {
		super();
		this.id = id;
		this.email = email;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public Customer getCid() {
		return cid;
	}
	public void setCid(Customer cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return id + ", " + email + ", " + salary;
	}
	
	
	
	

}
