package com.amazom.repository;

import com.amazom.entity.byDate.SalesAndTrafficByDate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SalesAndTrafficByDateRepo   extends MongoRepository<SalesAndTrafficByDate, String> {
    SalesAndTrafficByDate findByDate(String date);
    List<SalesAndTrafficByDate> findByDateBetween(String startDate, String endDate);
}
