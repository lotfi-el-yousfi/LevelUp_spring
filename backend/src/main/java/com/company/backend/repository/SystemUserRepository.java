package com.company.backend.repository;

import com.company.backend.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
  public interface SystemUserRepository extends JpaRepository<SystemUser, Integer> {
  }
