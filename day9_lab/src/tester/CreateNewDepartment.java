package tester;
import org.hibernate.*;

import dao.DepartmentDaoImpl;
import pojo.Department;
import pojo.Employee;

import static utils.HibernateUtils.*;

import java.util.Scanner;
public class CreateNewDepartment {
public static void main(String[] args)
{try(Scanner sc =new Scanner(System.in);SessionFactory sf=getSf())
	{
	System.out.println("Hibernate created.....");
	System.out.println("Enter dept details name and loaction");
	
	Department d1=new Department(sc.next(),sc.next());
	for(int i=0;i<3;i++)
	{
		System.out.println("enter employee dtls");
		d1.addEmp(new Employee(sc.next(),sc.nextDouble()));
	}
	DepartmentDaoImpl dao=new DepartmentDaoImpl();
	System.out.println(dao.createNewDept(d1));
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
