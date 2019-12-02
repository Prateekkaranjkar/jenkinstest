package dao;
import pojo.*;
import static utils.HibernateUtils.getSf;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Department;
import pojo.Employee;

public class DepartmentDaoImpl implements IDeptartmentDao {
public	String createNewDept(Department d)
{
	String mesg="adding dept fail";
	Session hs= getSf().getCurrentSession();
Transaction tx=hs.beginTransaction();
try
{
	hs.save(d);
	tx.commit();
	mesg="sucess";
}catch(HibernateException e) {
	if(tx!=null)
		tx.rollback();
	throw e;
}
return mesg;
}


public String hireEmp(int deptId,Employee e)
{
	
	Department d=null;
	String mesg="adding emp fail";
	Session hs= getSf().getCurrentSession();
	Transaction tx=hs.beginTransaction();
	
	
	try
	{
		d=hs.get(Department.class,deptId);
		d.addEmp(e);
		hs.save(d);
		tx.commit();
		mesg="sucess";
	}catch(HibernateException e1) {
		if(tx!=null)
		tx.rollback();
		throw e1;
	}
return mesg;
}
}
