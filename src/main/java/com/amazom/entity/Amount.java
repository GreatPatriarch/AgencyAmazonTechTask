package com.amazom.entity;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Amount {
    private double amount;
    private String currencyCode;
}
