package com.amazom.entity.byDate;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SalesAndTrafficByDate {
    @Id
    private String date;
    private SalesByDate salesByDate;
    private TrafficByDate trafficByDate;
}
