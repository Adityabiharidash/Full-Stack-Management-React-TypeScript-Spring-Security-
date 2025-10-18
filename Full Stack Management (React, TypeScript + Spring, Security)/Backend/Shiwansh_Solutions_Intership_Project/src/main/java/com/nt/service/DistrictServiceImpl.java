package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.District;
import com.nt.repository.IDistrictRepository;

@Service
public class DistrictServiceImpl implements IDistrictService {

    @Autowired
    private IDistrictRepository repo;

    @Override
    public District addDistrict(District d) {
        return repo.save(d);
    }

    @Override
    public List<District> getAllDistricts() {
        return repo.findAll();
    }
}
