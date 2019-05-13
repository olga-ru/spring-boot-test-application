package com.example.demo.services;

import com.example.demo.entities.Company;
import com.example.demo.helpers.Utils;
import org.springframework.stereotype.Service;


@Service
public class CompanyService {

    public boolean isCompanyInvalid(Company company){
        return Utils.isEmpty(company.getBs()) || Utils.isEmpty(company.getCatchPhrase())
            || Utils.isEmpty(company.getName());
    }
}