package ru.astondevs.orderservice.kafka;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import ru.astondevs.kafkastartermvn.listener.Listener;
import ru.astondevs.orderservice.kafka.dto.RestaurantValidateDto;

import java.util.Collection;

@Getter
@Component
@RequiredArgsConstructor
public class RestaurantListener implements Listener<String> {

    private final Class<RestaurantValidateDto> type = RestaurantValidateDto.class;

    @Override
    @SneakyThrows
    public void receive(Collection<String> data) {
        data.forEach(d -> System.out.printf("RECEIVE MESSAGE %s", d));
    }
}
