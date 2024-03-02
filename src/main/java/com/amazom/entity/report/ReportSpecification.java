package com.amazom.entity.report;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReportSpecification {
    @Id
    private String id;
    private String reportType;
    private ReportOptions reportOptions;
    private LocalDate dataStartTime;
    private LocalDate dataEndTime;
    private List<String> marketplaceIds;
}

