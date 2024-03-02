package com.amazom.entity;

import com.amazom.entity.byAcin.SalesAndTrafficByAsin;
import com.amazom.entity.byDate.SalesAndTrafficByDate;
import com.amazom.entity.report.ReportSpecification;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class MyData {
    public ReportSpecification reportSpecification;
    public List<SalesAndTrafficByAsin> salesAndTrafficByAsin;
    public List<SalesAndTrafficByDate> salesAndTrafficByDate;
}
