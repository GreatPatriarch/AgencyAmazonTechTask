package com.amazom.databaseinit;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class DatabaseInitializer {
    private final DatabaseInitializerService service;

    @PostConstruct
    public void initDatabase() throws IOException {
            service.init("test_report.json");
    }
}
