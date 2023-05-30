package com.example.cliente.rabbitmq;

import com.example.cliente.DTO.ReservationDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationListener {
    @RabbitListener(queues = "email")
    public void receiveReservation(String reservationJson) {
        // Convert JSON to ReservationDTO
        ReservationDTO reservationDTO = convertJsonToReservationDTO(reservationJson);

        // Process the received reservationDTO
        // Implement your logic to handle the received reservation message
        System.out.println("Feliz dia, su mascota ya esta lista. Detalles de la reserva: " + reservationDTO);
    }

    private ReservationDTO convertJsonToReservationDTO(String reservationJson) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(reservationJson, ReservationDTO.class);
    }
}
