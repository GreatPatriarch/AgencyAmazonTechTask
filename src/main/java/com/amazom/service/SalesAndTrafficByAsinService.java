package com.amazom.service;

import com.amazom.entity.byAcin.SalesAndTrafficByAsin;
import com.amazom.repository.SalesAndTrafficByAsinRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "statsForAsinCache")
public class SalesAndTrafficByAsinService {
    private final SalesAndTrafficByAsinRepo asinRepo;
    @Cacheable
    public List<SalesAndTrafficByAsin> displayStatisticsForAllAsin() {
        return asinRepo.findAll();
    }
    @Cacheable(key = "#asin")
    public SalesAndTrafficByAsin displayStatisticsForAsin(String asin) {
        return asinRepo.findByParentAsin(asin);
    }
    @Cacheable
    public List<SalesAndTrafficByAsin> displayStatisticsForListAsin( List<String> asins) {
        List<SalesAndTrafficByAsin> result = new ArrayList<>();
        for(String asin : asins){
            var stat = asinRepo.findByParentAsin(asin);
            if (stat != null) result.add(stat);
        }
        return  result;
    }
}
