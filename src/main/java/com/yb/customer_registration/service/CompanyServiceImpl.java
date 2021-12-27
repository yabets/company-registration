package com.yb.customer_registration.service;

import com.yb.customer_registration.domain.Company;
import com.yb.customer_registration.domain.Size;
import com.yb.customer_registration.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company findById(Long companyId) {
        return null;
    }

    @Override
    public Company save(String name, Size size) {
        Company company = new Company(name, size);
        return companyRepository.save(company);
    }

    @Override
    public void delete(Long companyId) {

    }

    @Override
    public Company update(Company request, Long companyId) {
        return null;
    }
}
