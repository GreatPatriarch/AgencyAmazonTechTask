package com.amazom.repository;

import com.amazom.entity.byAcin.SalesAndTrafficByAsin;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SalesAndTrafficByAsinRepo extends MongoRepository<SalesAndTrafficByAsin, String> {
    SalesAndTrafficByAsin findByParentAsin(String asin);
}
