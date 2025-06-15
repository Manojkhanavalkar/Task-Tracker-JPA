package com.tracker.task.task_tracker;

import com.tracker.task.task_tracker.enitities.Certificate;
import com.tracker.task.task_tracker.enitities.Student;
import com.tracker.task.task_tracker.repositories.CertificateRepo;
import com.tracker.task.task_tracker.repositories.StudentRepo;
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

		Certificate certificate=certificateRepo.findByTitleLike("%Java%");
		System.out.println("certificate is : "+certificate.getTitle());

		Student student=certificate.getStudent();
		System.out.println("Student info "+student.getName());
	}
}
