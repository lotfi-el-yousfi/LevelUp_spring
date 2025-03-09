package com.company.backend.service;

import com.company.backend.entity.Ticket;
import com.company.backend.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Optional<Ticket> getTicketById(int id) {
        return ticketRepository.findById(id);
    }

    public Ticket addTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

//    public Optional<Ticket> updateTicket(int id, Ticket newTicket) {
//        return ticketRepository.findById(id).map(existingTicket -> {
//            existingTicket.setName(newTicket.getName());
//
//            return ticketRepository.save(existingTicket);
//        });
//    }

    public boolean deleteTicket(int id) {
        if (ticketRepository.existsById(id)) {
            ticketRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
