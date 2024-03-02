package com.amazom.entity.byAcin;

import com.amazom.entity.Amount;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SalesByAsin {
    private int unitsOrdered;
    private int unitsOrderedB2B;
    private Amount orderedProductSales;
    private Amount orderedProductSalesB2B;
    private int totalOrderItems;
    private int totalOrderItemsB2B;
}