package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
	SellerDao sellerDao=DaoFactory.createSellerDao();
	System.out.println("===Test 1: seller finById===");
	Seller seller=sellerDao.finfById(3);
	System.out.println(seller);
	
	System.out.println("\n===Test 1: seller findByDepartment===");
	Department department = new Department(2,null);
	List<Seller> list= sellerDao.findByDepartment(department);
	for (Seller seller2 : list) {
		System.out.println(seller2);
	}
	System.out.println("\n===Test 1: seller findAll===");
	 list= sellerDao.findAll();
	for (Seller seller2 : list) {
		System.out.println(seller2);
	}
		System.out.println("\n===Test 1: seller insert===");
Seller newSeller= new Seller(null,"greg","greg@gmail.com",new Date(),4000.0,department);
	sellerDao.insert(newSeller);
	System.out.println("Inserted!new id= " + newSeller.getId());
	}
	}


