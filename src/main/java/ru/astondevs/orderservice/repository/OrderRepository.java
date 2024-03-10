package ru.astondevs.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.astondevs.orderservice.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
