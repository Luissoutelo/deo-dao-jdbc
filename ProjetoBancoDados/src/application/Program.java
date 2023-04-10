package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	Department obj= new Department(1,"books");
	
	System.out.println(obj);

	Seller seller= new Seller(21,"bob","bob@gmail.com",LocalDate.parse("2010-11-12"),3000.0,obj);
	
	System.out.println(seller);
	}

}
