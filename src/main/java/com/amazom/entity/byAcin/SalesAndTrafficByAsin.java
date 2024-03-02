package com.amazom.entity.byAcin;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SalesAndTrafficByAsin {
    @Id
    private String parentAsin;
    private SalesByAsin salesByAsin;
    private TrafficByAsin trafficByAsin;
}
