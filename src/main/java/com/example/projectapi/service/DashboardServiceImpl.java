package com.example.projectapi.service;


import com.example.projectapi.entity.dashboard;
import com.example.projectapi.repo.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DashboardServiceImpl implements IDashboardservice {

    @Autowired
    DashboardRepository DashRepo;
    @Override
    public String saveDashData(dashboard dashboarddata) {

        return null;
    }

    @Override
    public List<dashboard> getAllData() {
        return DashRepo.findAll();
    }

    @Override
    public dashboard getDataById(Long id) {
        return null;
    }

    @Override
    public String deleteDataById(Long id) {
        return null;
    }
}
