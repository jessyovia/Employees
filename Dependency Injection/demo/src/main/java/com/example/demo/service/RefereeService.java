package com.example.demo.service;

import com.example.demo.repository.RefereeRepository;

public class RefereeService {
    RefereeRepository refereeRepo;

    // THis an example of consturctor injection
    public RefereeService(RefereeService refereeRepository)
    {
        refereeRepo = refereeRepository;
    }

    public List<EmployeeReferee> getAllemployeeReferees() {
        return listEmployeeReferee.getAllemployees
    }

}
