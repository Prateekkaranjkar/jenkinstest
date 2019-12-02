package pojo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Entity
@Table(name="dac_dept")
public class Department extends AbstractEntity{
	@Column(length=20,unique=true)
private String name;
	@Column(length=20)
private String location;
@OneToMany(mappedBy="dept",cascade=CascadeType.ALL)
private List<Employee> emps=new ArrayList<>();
@Override
public String toString() {
	return "Department [name=" + name + ", location=" + location + ", getId()=" + getId() + "]";
}
public void addEmp(Employee e)
{
	emps.add(e);
	System.out.println(e.getDept());
	e.setDept(this);
}
public void removeEmp(Employee e)
{
	emps.remove(e);
	System.out.println(e.getDept());
	e.setDept(null);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}


public List<Employee> getEmps() {
	return emps;
}
public void setEmps(List<Employee> emps) {
	this.emps = emps;
}
public Department() {
	System.out.println("Dept_constr");
	
}
public Department(String name, String location) {
	
	this.name = name;
	this.location = location;
}

}
