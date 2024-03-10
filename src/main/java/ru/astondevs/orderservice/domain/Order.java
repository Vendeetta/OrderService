package ru.astondevs.orderservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Order {

    @Id
    private Long id;
    private Long restaurantId;
    private Long customerId;
    private Status status;
    private LocalDateTime createTime;
}
