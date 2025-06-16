package com.tracker.task.task_tracker.repositories;

import com.tracker.task.task_tracker.enitities.IpAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IpAddressRepo extends JpaRepository<IpAddress,Integer> {
}
