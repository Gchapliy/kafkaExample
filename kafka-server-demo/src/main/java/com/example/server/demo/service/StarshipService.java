package com.example.server.demo.service;

import com.example.server.demo.dto.StarshipDto;

public interface StarshipService {

    StarshipDto save(StarshipDto dto);

    void send(StarshipDto dto);

    void consume(StarshipDto dto);
}
