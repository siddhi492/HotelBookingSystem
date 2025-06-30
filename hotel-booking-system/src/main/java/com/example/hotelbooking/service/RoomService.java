package com.example.hotelbooking.service;

import com.example.hotelbooking.model.Room;
import com.example.hotelbooking.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAvailableRooms() {
        return roomRepository.findByAvailableTrue();
    }
}
