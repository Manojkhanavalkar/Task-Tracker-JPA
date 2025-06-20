package com.tracker.task.task_tracker;

import com.tracker.task.task_tracker.enitities.*;
import com.tracker.task.task_tracker.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskTrackerApplication implements CommandLineRunner {

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private CertificateRepo certificateRepo;

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private IpAddressRepo ipAddressRepo;

	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private  OrdersRepo ordersRepo;

	@Autowired
	private CustomerRepo customerRepo;

	public static void main(String[] args) {
		SpringApplication.run(TaskTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student=new Student();
//		student.setName("Disha Manoj Khanavalkar");
//		student.setEmail("DishaMK@gmail.com");
//
//
//		Certificate certificate=new Certificate();
//		certificate.setTitle("Java Certification");
//		certificate.setDescription("This is java certification");
//		certificate.setIssueDate(LocalDate.now());
//
//		Student savedStudent=studentRepo.save(student);
//		System.out.println("student saved success");
//
//		savedStudent.setCertificate(certificate);
//		certificate.setStudent(savedStudent);
//
//		certificateRepo.save(certificate);
//		System.out.println("certificate is also saved");

//		Student student=studentRepo.findById(3).get();
//		System.out.println("Student name is "+student.getName());
//
//		Certificate certificate=student.getCertificate();
//		System.out.println("Certificate details: "+certificate.getTitle());

//		Certificate certificate=certificateRepo.findByTitleLike("%Java%");
//		System.out.println("certificate is : "+certificate.getTitle());
//
//		Student student=certificate.getStudent();
//		System.out.println("Student info "+student.getName());

//		User user=new User();
//		user.setName("Raju");
//		IpAddress ipAddress=new IpAddress();
//		ipAddress.setIpAddressLoc("Pune");
//
//		IpAddress ipAddress1=ipAddressRepo.save(ipAddress);
//		System.out.println("Ip address  saved");
//		user.setIpAddress(ipAddress1);
//		userRepo.save(user);
//		System.out.println("User saved!! with ipaddress");

//		Category category=new Category();
//		category.setCategory_name("Electronics");
//		List<Product> products=new ArrayList<>();
//		Product product1=new Product();
//		product1.setName("LG fridge");
//		product1.setPrice(20000);
//		product1.setCategory(category);
//
//		Product product2=new Product();
//		product2.setName("LG Oven");
//		product2.setPrice(10000);
//		product2.setCategory(category);
//
//		products.add(product1);
//		products.add(product2);
//
//		category.setProduct(products);
//		categoryRepo.save(category);

		Customer customer1=new Customer();
		customer1.setName("Disha Khanavalkar");
		customer1.setAddress("Chinchwad");

		Customer customer2=new Customer();
		customer2.setName("Manoj Khanavalkar");
		customer2.setAddress("Manik colony");

		Customer customer3=new Customer();
		customer3.setName("Pratima Khanavalkar");
		customer3.setAddress("Chinchwad");

		Customer customer4=new Customer();
		customer4.setName("Sadanand Khanavalkar");
		customer4.setAddress("Satara");

		Orders order1=new Orders();
		order1.setDescription("This is the best massager");
		order1.setStatus(OrderStatus.PROCESSING);

		Orders order2=new Orders();
		order2.setDescription("This is a kanda chopper");
		order2.setStatus(OrderStatus.PENDING);

		order1.addCustomer(customer1);
		order2.addCustomer(customer2);

		ordersRepo.save(order1);
		ordersRepo.save(order2);

	}
}
