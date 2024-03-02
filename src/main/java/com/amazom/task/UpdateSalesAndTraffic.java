package com.amazom.task;

import com.amazom.databaseinit.DatabaseInitializer;
import com.amazom.repository.SalesAndTrafficByDateRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Caching;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class UpdateSalesAndTraffic {
    private final DatabaseInitializer databaseInitializer;

    @Scheduled(fixedRate =  1000 * 60 * 60)
    @Caching(evict = {
            @CacheEvict(value="statsForAsinCache", allEntries=true),
            @CacheEvict(value="statsForDateCache", allEntries=true),
    })
    public void updateSalesAndTraffic() throws IOException {
            databaseInitializer.initDatabase();
    }
}
