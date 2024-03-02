package com.amazom.entity.report;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReportOptions {
    private String dateGranularity;
    private String asinGranularity;
}
