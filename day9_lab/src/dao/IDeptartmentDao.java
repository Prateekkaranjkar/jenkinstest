package dao;

import pojo.*;

public interface IDeptartmentDao {
String createNewDept(Department d);
String hireEmp(int deptId,Employee e);
}
