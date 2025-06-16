package com.tracker.task.task_tracker.repositories;

import com.tracker.task.task_tracker.enitities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
