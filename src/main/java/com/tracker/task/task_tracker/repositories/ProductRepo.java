package com.tracker.task.task_tracker.repositories;

import com.tracker.task.task_tracker.enitities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
