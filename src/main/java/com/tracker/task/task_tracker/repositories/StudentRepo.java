package com.tracker.task.task_tracker.repositories;

import com.tracker.task.task_tracker.enitities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
