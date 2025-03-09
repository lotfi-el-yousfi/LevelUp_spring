package com.company.backend.repository;

import com.company.backend.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
  public interface TicketRepository extends JpaRepository<Ticket, Integer> {
  }
