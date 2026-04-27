package com.gpereira.tickettracker.controller;

import com.gpereira.tickettracker.model.Ticket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @GetMapping
    public List<Ticket> getAllTickets() {
        Ticket ticket1 = new Ticket(1L, "VPN Connection Failed", "User cannot connect to the corporate network.", "Open");
        Ticket ticket2 = new Ticket(2L, "Monitor Flickering", "HR desk 12 monitor has a loose connection.", "In Progress");

        return List.of(ticket1, ticket2);
    }
}