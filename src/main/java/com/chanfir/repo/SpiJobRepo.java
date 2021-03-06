package com.chanfir.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


import com.chanfir.entity.SpiJob;


public interface SpiJobRepo extends CrudRepository<SpiJob, String>{
    
    @Query("SELECT c FROM SpiJob c")
    public List<SpiJob> findAlljobs();
    
    @Query("SELECT c FROM SpiJob c WHERE LOWER(c.name) LIKE LOWER(:name)")
    public List<SpiJob> findByName(@Param("name") String name);


    @Transactional
    @Modifying
    @Query("delete from SpiJob c where c.id =:#{#id}")
    void delete(@Param("id") int id);

//    @Transactional
    @Modifying
    @Query("update SpiJob c set c.name =:#{#job.name} , c.description=:#{#job.description} where c.id=:#{#job.id}")
	public  void update(@Param ("job") SpiJob job);
    
//    public void run();
    
   
	
    
}
