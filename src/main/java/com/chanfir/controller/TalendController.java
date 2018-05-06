
package com.chanfir.controller;

import com.chanfir.entity.SpiJob;
import com.chanfir.services.TalendService;
import com.chanfir.dto.SearchData;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/job")
public class TalendController {
    
    @Autowired	
    private TalendService service;
    
    @RequestMapping(method = RequestMethod.POST)
    public SpiJob insert(@RequestBody SpiJob job) {
        return service.insert(job);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public SpiJob findById(@PathVariable String id) {
        return service.findById(id);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/{j}")
    public boolean deleteById(@PathVariable ("j") int j) {
        return service.delete(j);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<SpiJob> findAll() {
        return service.findAll();
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/search")
    public List<SpiJob> findByName(@RequestBody SearchData searchData) {
        return service.findByName(searchData.getSearchKey());
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/update")
    public boolean update(@RequestBody SpiJob job) {
        return service.update(job);
    }
    
}
