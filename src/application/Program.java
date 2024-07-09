package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Matheus", "matheus@gmail.com", new Date(), 5140.00, obj);
		System.out.println(obj);
		System.out.println(seller);
	}

}
