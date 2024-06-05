package app.asset;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
   int emp_id;
   String emp_name;
   int emp_salary;
   @OneToOne
   Asset asset;
   
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int emp_id, String emp_name, int emp_salary, Asset asset) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.emp_salary = emp_salary;
	this.asset = asset;
}

public int getEmp_id() {
	return emp_id;
}

public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

public String getEmp_name() {
	return emp_name;
}

public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}

public int getEmp_salary() {
	return emp_salary;
}

public void setEmp_salary(int emp_salary) {
	this.emp_salary = emp_salary;
}

public Asset getAsset() {
	return asset;
}

public void setAsset(Asset asset) {
	this.asset = asset;
}

   
   
}
