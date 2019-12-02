package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.DepartmentDaoImpl;
import pojo.Department;
import pojo.Employee;

public class HireEmp {
	public static void main(String[] args)
	{try(Scanner sc =new Scanner(System.in);SessionFactory sf=getSf())
		{
		System.out.println("Hibernate created.....");
		System.out.println("Enter dept id ");
		
		System.out.println("enter employee dtls");
		 Employee e1=new Employee(sc.next(),sc.nextDouble());
		
		DepartmentDaoImpl dao=new DepartmentDaoImpl();
		System.out.println(dao.hireEmp(sc.nextInt(),e1));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
