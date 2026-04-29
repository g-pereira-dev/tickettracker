package com.gpereira.tickettracker.service;

import com.gpereira.tickettracker.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    private List<Ticket> tickets = new ArrayList<>();

    public TicketService() {

        tickets.add(new Ticket(1L, "VPN connection issue", "User cannot connect from home", "OPEN"));
        tickets.add(new Ticket(2L, "Blue screen on HR laptop", "System crashes after login", "IN_PROGRESS"));
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
}