package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("\n\n=== TEST 1: seller FindById =====");
		Seller seller  = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("\n\n=== TEST 2: seller FindByDepartment =====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n\n=== TEST 3: seller FindAll =====");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n\n=== TEST 4: seller insert =====");
		Seller newseller = new Seller(null, "Matheus", "Math@gmail.com", new Date(), 5000.0, dep);
		sellerDao.insert(newseller);
		System.out.println("Inserted! New Id = " + newseller.getId());
		System.out.println(newseller);
	}

}
