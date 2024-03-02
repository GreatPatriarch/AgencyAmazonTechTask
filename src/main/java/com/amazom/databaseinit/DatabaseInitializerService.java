package com.amazom.databaseinit;

import com.amazom.entity.MyData;
import com.amazom.entity.byDate.SalesAndTrafficByDate;
import com.amazom.repository.ReportSpecificationRepo;
import com.amazom.repository.SalesAndTrafficByAsinRepo;
import com.amazom.repository.SalesAndTrafficByDateRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


@Service
@RequiredArgsConstructor
class DatabaseInitializerService {

    private final ReportSpecificationRepo reportSpecificationRepository;
    private final SalesAndTrafficByAsinRepo ByAsinRepository;
    private final SalesAndTrafficByDateRepo ByDateRepository;

    public void init(String filename) throws IOException {
        File file = ResourceUtils.getFile("classpath:"+ filename);
        String content = Files.readString(file.toPath());

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        MyData myData = mapper.readValue(content, MyData.class);

        reportSpecificationRepository.save(myData.reportSpecification);
        ByAsinRepository.saveAll(myData.salesAndTrafficByAsin);
        ByDateRepository.saveAll(myData.salesAndTrafficByDate);
    }
}
