package com.amazom.service;

import com.amazom.entity.byDate.SalesAndTrafficByDate;
import com.amazom.repository.SalesAndTrafficByDateRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "statsForDateCache")
public class SalesAndTrafficByDateService {
    private final SalesAndTrafficByDateRepo dateRepo;
    @Cacheable
    public List<SalesAndTrafficByDate> displayStatisticsForAllDates() {
        return dateRepo.findAll();
    }
    @Cacheable(key = "#date")
    public SalesAndTrafficByDate displayStatisticsForDate( String date) {
        return dateRepo.findByDate(date);
    }
    @Cacheable(key = "#startDate.concat('-').concat(#endDate)")
    public List<SalesAndTrafficByDate> displayStatisticsForDateRange(String startDate,  String endDate) {
        return dateRepo.findByDateBetween(startDate, endDate);
    }
}
