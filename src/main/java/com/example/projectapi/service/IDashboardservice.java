package com.example.projectapi.service;

import com.example.projectapi.entity.dashboard;

import java.util.List;

public interface IDashboardservice {
    String saveDashData(dashboard dashboarddata);
    List<dashboard> getAllData();
    dashboard getDataById(Long id);

    String deleteDataById(Long id);

}
