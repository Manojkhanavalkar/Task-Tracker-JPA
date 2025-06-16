package com.tracker.task.task_tracker;

import com.tracker.task.task_tracker.enitities.*;
import com.tracker.task.task_tracker.repositories.CertificateRepo;
import com.tracker.task.task_tracker.repositories.IpAddressRepo;
import com.tracker.task.task_tracker.repositories.StudentRepo;
import com.tracker.task.task_tracker.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

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

		Category category=new Category();
		category.setCategory_name("Electronics");
		Product product=new Product();







	}
}
