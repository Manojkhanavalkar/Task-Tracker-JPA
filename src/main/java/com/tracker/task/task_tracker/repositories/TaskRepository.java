package com.tracker.task.task_tracker.repositories;

import com.tracker.task.task_tracker.enitities.Task;
import com.tracker.task.task_tracker.enitities.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    //save
    //findAll
    //findById
    //delete


    // custom finder methods/ custom methods

    List<Task> findByTitle(String title);

    List<Task> findByStatus(TaskStatus status);

    List<Task> findByCreatedAt(LocalDateTime localDateTime);

    List<Task> findByCreatedAtBetween(LocalDateTime start,LocalDateTime end);

    List<Task> findByTitleAndStatus(String title,String status);

    List<Task> findByTitleContainingIgnoreCase(String titleKeyword);


    //Query  methods -- custom query

    @Query("SELECT t FROM Task t")//JPQL /hql
    List<Task> getAllTask1();

    @Query("SELECT t FROM Task t WHERE t.id=?1 and t.status=?2")
    Task getByIdAndStatus(long id,TaskStatus status);

    @NativeQuery("select * from jpa_tasks")
    List<Task> getAllTask2();

}
