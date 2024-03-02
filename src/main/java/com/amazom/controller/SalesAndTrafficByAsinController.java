package com.amazom.controller;

import com.amazom.entity.byAcin.SalesAndTrafficByAsin;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.amazom.service.SalesAndTrafficByAsinService;

import java.util.List;

@RestController
@RequestMapping("/api/asin-stats")
@RequiredArgsConstructor
public class SalesAndTrafficByAsinController {
    private final SalesAndTrafficByAsinService asinService;

    @GetMapping("/single")
    public SalesAndTrafficByAsin getStaticForAsin(@RequestParam String asin) {
        return asinService.displayStatisticsForAsin(asin);
    }

    @GetMapping("/all")
    public List<SalesAndTrafficByAsin> getStaticForAllAsin() {
        return asinService.displayStatisticsForAllAsin();
    }

    @GetMapping("/list")
    public List<SalesAndTrafficByAsin> getStaticForListAsin(@RequestParam List<String> asins) {
        return asinService.displayStatisticsForListAsin(asins);
    }

}
