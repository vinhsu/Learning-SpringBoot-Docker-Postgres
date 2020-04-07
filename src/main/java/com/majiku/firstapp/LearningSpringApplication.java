package com.majiku.firstapp;

import com.majiku.firstapp.data.entity.Guest;
import com.majiku.firstapp.data.entity.Reservation;
import com.majiku.firstapp.data.entity.Room;
import com.majiku.firstapp.data.repository.GuestRepository;
import com.majiku.firstapp.data.repository.ReservationRepository;
import com.majiku.firstapp.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringApplication.class, args);
    }

}
