package com.tracker.task.task_tracker.repositories;

import com.tracker.task.task_tracker.enitities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
