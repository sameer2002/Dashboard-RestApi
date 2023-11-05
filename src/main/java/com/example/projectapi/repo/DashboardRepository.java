package com.example.projectapi.repo;

import com.example.projectapi.entity.dashboard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DashboardRepository extends MongoRepository<dashboard,Long> {

}
