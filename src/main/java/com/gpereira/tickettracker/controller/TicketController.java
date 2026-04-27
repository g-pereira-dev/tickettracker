package com.gpereira.tickettracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @GetMapping
    public String statusCheck() {
        return "TicketTracker API is online! Support system operating.";
    }
}