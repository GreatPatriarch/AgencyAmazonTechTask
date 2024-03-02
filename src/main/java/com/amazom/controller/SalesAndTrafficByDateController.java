package com.amazom.controller;

import com.amazom.entity.byDate.SalesAndTrafficByDate;
import com.amazom.service.SalesAndTrafficByDateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/date-stats")
@RequiredArgsConstructor
public class SalesAndTrafficByDateController {
    private final SalesAndTrafficByDateService dateService;

    @GetMapping("/all")
    public List<SalesAndTrafficByDate> getStatisticsForAllDates() {
        return dateService.displayStatisticsForAllDates();
    }

    @GetMapping("/date")
    public SalesAndTrafficByDate getStatisticsForDate(@RequestParam String date) {
        return dateService.displayStatisticsForDate(date);
    }

    @GetMapping("/range")
    public List<SalesAndTrafficByDate> getStatisticsForDateRange(@RequestParam String startDate, @RequestParam String endDate) {
        return dateService.displayStatisticsForDateRange(startDate, endDate);
    }

}
