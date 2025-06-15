package com.tracker.task.task_tracker.services;

import com.tracker.task.task_tracker.enitities.Task;
import com.tracker.task.task_tracker.enitities.TaskStatus;
import com.tracker.task.task_tracker.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public void saveTask(Task task) {


        //logic likhne ke liye
        task.setStatus(TaskStatus.IN_PROGRESS);
        task.setCreatedAt(task.getCreatedAt().minusDays(4));


        Task savedTask = taskRepository.save(task);
        System.out.println("Task save with id:" + savedTask.getId());
    }
    //update task

    //get all task
    public List<Task> getAll(){
        List<Task> tasks=taskRepository.findAll();
        return  tasks;
    }
    //get task by id

    public Task getById(long id){
        Task tsk=taskRepository.findById(id).
                orElseThrow(()-> new RuntimeException("Tasks not found with id:"+id));
        return tsk;
    }
    //delete task by id

    public void deleteById(long id){
        Task tsk=taskRepository.findById(id).get();
        taskRepository.delete(tsk);
    }
    //get all task by status
    public List<Task> getByStatus(TaskStatus status){
        List<Task> tasks=taskRepository.findByStatus(status);
        return tasks;

    }

    //get by created date
    public List<Task> getByCreatedDate(LocalDateTime createdAt){
        List<Task> task=taskRepository.findByCreatedAt(createdAt);
        return task;
    }

    //search tasks
    public List<Task> searchByTitle(String titleKeyword){
        List<Task> tasks=taskRepository.findByTitleContainingIgnoreCase(titleKeyword);
        return tasks;
    }

    public List<Task> getByCreatedDateBetween(LocalDateTime start,LocalDateTime end){
        List<Task> tasks=taskRepository.findByCreatedAtBetween(start,end);
        return tasks;
    }
}
