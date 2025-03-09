package com.company.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

//    private final TicketService ticketService;
//
//    public TicketController(TicketService ticketService) {
//        this.ticketService = ticketService;
//    }

    @GetMapping
    public String test() {
        return "test is ok";
    }



//    @GetMapping
//    public List<Ticket> getAllTickets() {
//        return ticketService.getAllTickets();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Ticket> getTicketById(@PathVariable int id) {
//        return ticketService.getTicketById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public ResponseEntity<Ticket> addTicket(@Valid @RequestBody Ticket ticket) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(ticketService.addTicket(ticket));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Ticket> updateTicket(@PathVariable int id, @Valid @RequestBody Ticket ticket) {
//        return ticketService.updateTicket(id, ticket)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteTicket(@PathVariable int id) {
//        return ticketService.deleteTicket(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
//    }
}
