package com.example.demo.controller;
import com.example.demo.service.RefereeService;
import org.springframework.beans.factory.annotation.Autowired;

public class RefereeController{

    // this is an example of a field injection
    @Autowired
    private RefereeService refereeService;

    @GetMapping
    public List<EmployeeReferee> getAllEmployessReferee() {
        return refereeService.getAllEmployeeReferees();
    }

}