package ru.kafkademo.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kafkademo.app.dto.StarshipDto;
import ru.kafkademo.app.service.StarshipService;

@RestController
@RequestMapping("/starship")
@AllArgsConstructor
public class StarshipController {

    private final StarshipService service;

    @PostMapping
    public void send(@RequestBody StarshipDto dto) {
        service.send(dto);
    }

    @GetMapping("/test")
    public void testSend() {
        StarshipDto dto = new StarshipDto();
        dto.setName("testName");
        dto.setModel("testModel");
        service.send(dto);
    }

}

