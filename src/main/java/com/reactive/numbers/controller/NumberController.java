package com.reactive.numbers.controller;


import com.reactive.numbers.model.Number;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class NumberController {

    @GetMapping(value = "/api/numbers", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Number> getNumbers() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(i -> new Number(i.intValue()))
                .take(100000); // Limit the sequence to 10 numbers
    }
}
