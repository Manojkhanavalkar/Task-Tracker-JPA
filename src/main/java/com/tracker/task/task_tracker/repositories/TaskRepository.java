package com.tracker.task.task_tracker.repositories;

import com.tracker.task.task_tracker.enitities.Task;
import com.tracker.task.task_tracker.enitities.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    //save
    //findAll
    //findById
    //delete


    List<Task> findByTitle(String title);

    List<Task> findByStatus(TaskStatus status);

    List<Task> findByCreatedAt(LocalDateTime localDateTime);

    List<Task> findByCreatedAtBetween(LocalDateTime start,LocalDateTime end);

    List<Task> findByTitleAndStatus(String title,String status);

    List<Task> findByTitleContainingIgnoreCase(String titleKeyword);
}
