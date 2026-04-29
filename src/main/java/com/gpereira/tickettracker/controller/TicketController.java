package com.gpereira.tickettracker.controller;

import com.gpereira.tickettracker.model.Ticket;
import com.gpereira.tickettracker.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }
    @PostMapping
    public String createTicket(@RequestBody Ticket ticket) {
        ticketService.addTicket(ticket);
        return "Ticket created successfully!";
    }
}