package com.example.cliente.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ReservationDTO {
    private Long idReserva;
    private String reservationDate;

    private String otherField;
}
