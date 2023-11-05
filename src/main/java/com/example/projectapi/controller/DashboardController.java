package com.example.projectapi.controller;

import com.example.projectapi.entity.dashboard;

import com.example.projectapi.service.IDashboardservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Dashboard/")
public class DashboardController {
    @Autowired
   IDashboardservice iDashboardservice;

    @GetMapping("/get")
    public ResponseEntity<List<dashboard>> readDashboardData(){
       return  new ResponseEntity<List<dashboard>>(iDashboardservice.getAllData(), HttpStatus.OK);
    }
}
