package com.tracker.task.task_tracker.repositories;

import com.tracker.task.task_tracker.enitities.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepo extends JpaRepository<Certificate,Integer> {
    Certificate findByTitleLike(String certificateKeyword);
}
