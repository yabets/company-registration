package com.yb.customer_registration;

import com.yb.customer_registration.domain.Company;
import com.yb.customer_registration.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @Slf4j
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping(path = {"/", "/company"})
    public List<Company> getAllCompanies() {
        return companyService.findAll();
    }

    @PostMapping( "/company")
    public List<Company> addCompany(@RequestBody Company request) {
        Company company = companyService.save(request.getName(), request.getSize());
        log.info("Company created :: {}", company);
        return getAllCompanies();
    }
}
