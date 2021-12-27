package com.yb.customer_registration.service;

import com.yb.customer_registration.domain.Company;
import com.yb.customer_registration.domain.Size;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();

    Company findById(Long companyId);

    Company save(String name, Size size);

    void delete(Long companyId);

    Company update(Company request, Long companyId);

}
