/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chanfir.services;

import com.chanfir.controller.TalendController;
import com.chanfir.entity.Candidate;
import com.chanfir.entity.SpiJob;
import com.chanfir.repo.SpiJobRepo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service(value="talendservice")
@Transactional
public class TalendService {
	
	

    @Autowired
    private SpiJobRepo repo;

    public SpiJob insert(SpiJob job) {
        return repo.save(job);
        
    }

    public SpiJob findById(String id) {
        return repo.findOne(id);
    }

    public List<SpiJob> findAll() {
        return repo.findAlljobs();
    }

    public List<SpiJob> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }

    public boolean delete(int j) {
        repo.delete(j);
        return true;
    }

	
}
