package com.tracker.task.task_tracker.repositories;

import com.tracker.task.task_tracker.enitities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders,Integer> {
}
