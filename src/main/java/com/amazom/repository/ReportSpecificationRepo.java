package com.amazom.repository;

import com.amazom.entity.report.ReportSpecification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportSpecificationRepo extends MongoRepository<ReportSpecification, String> {
}
