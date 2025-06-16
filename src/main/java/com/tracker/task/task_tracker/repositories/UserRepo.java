package com.tracker.task.task_tracker.repositories;

import com.tracker.task.task_tracker.enitities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
