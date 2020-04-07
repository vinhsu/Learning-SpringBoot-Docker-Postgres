package com.majiku.firstapp.api;

import com.majiku.firstapp.data.entity.Guest;
import com.majiku.firstapp.data.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/guests")
public class GuestRestController {
    private final GuestRepository guestRepository;

    @Autowired
    public GuestRestController(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @GetMapping
    public Iterable<Guest> getGuests() {
        return guestRepository.findAll();
    }
}
