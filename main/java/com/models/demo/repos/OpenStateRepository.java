package com.models.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.models.demo.entities.OpenState;

public interface OpenStateRepository extends JpaRepository<OpenState, Long> {
}