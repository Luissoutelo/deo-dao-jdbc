package application;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
	DepartmentDao departmentDao= DaoFactory.createDeartmentDao();
Department dep= departmentDao.finfById(1);
System.out.println(dep);

System.out.println("\n=== TEST 2: findAll =======");
List<Department> list = departmentDao.findAll();
Comparator<Department> x=(e1,e2) -> e1.getId().compareTo(e2.getId());
list.sort(x);
for (Department d : list) {
	
	System.out.println(d);
}
System.out.println("\n=== TEST 3: insert =======");
Department newDepartment = new Department(null, "Music");
departmentDao.insert(newDepartment);
System.out.println("Inserted! New id: " + newDepartment.getId());

System.out.println("\n=== TEST 4: update =======");
Department dep2 = departmentDao.finfById(1);
dep2.setName("fe");
departmentDao.update(dep2);
System.out.println("Update completed");
System.out.print("Enter id for delete test: ");
int id = sc.nextInt();
departmentDao.deleteById(id);
System.out.println("Delete completed");

sc.close();
}
}