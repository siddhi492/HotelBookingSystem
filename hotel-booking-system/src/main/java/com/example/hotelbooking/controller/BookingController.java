package com.example.hotelbooking.controller;

import com.example.hotelbooking.model.Booking;
import com.example.hotelbooking.service.BookingService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;
    private final ObjectMapper objectMapper;

    public BookingController(BookingService bookingService, ObjectMapper objectMapper) {
        this.bookingService = bookingService;
        this.objectMapper = objectMapper;
    }

    @PostMapping
    public ResponseEntity<?> bookRooms(@RequestBody String requestBody) throws JsonMappingException, JsonProcessingException {
        // Check if the request is a single object or an array
        if (requestBody.startsWith("[")) {
            // Multiple bookings
            List<Booking> bookings = objectMapper.readValue(requestBody, objectMapper.getTypeFactory().constructCollectionType(List.class, Booking.class));
            bookings.forEach(bookingService::bookRoom);
            return ResponseEntity.ok(bookings);
        } else {
            // Single booking
            Booking booking = objectMapper.readValue(requestBody, Booking.class);
            bookingService.bookRoom(booking);
            return ResponseEntity.ok(booking);
        }
    }
}
