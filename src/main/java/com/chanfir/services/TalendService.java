package com.chanfir.services;



//import com.chanfir.dto.UploadJob;
import com.chanfir.entity.SpiJob;
import com.chanfir.repo.SpiJobRepo;



import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;
import java.util.List;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Service(value="talendservice")
@Transactional
public class TalendService {
	
	Logger log = LoggerFactory.getLogger(this.getClass().getName());
	private Path rootLocation = Paths.get("upload-dir");

    @Autowired
    private SpiJobRepo repo;
//    @Autowired
//    private UploadJob uploadjob ;

    public SpiJob insert(SpiJob job) {
    	
    	
//                MultipartFile file = job.file;
//                
//                filesystemstorageservice.store(file);
     
    	
    	job.setJobPath("test path");
    	
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

	public boolean update(SpiJob job) {
		repo.update(job);
		System.out.println("job id returned from front is"+job.getId());
		System.out.println("job name returned from front is"+job.getName());
		System.out.println("job description returned from front is"+job.getDescription());
		return true;

		
	}

	public void store(MultipartFile file) {
		try {
			String rootPath = System.getProperty("user.home");
	    	
	    	java.io.File dir = new File(rootPath + File.separator + "server");
			if (!dir.exists())
				dir.mkdirs();
			
			Files.copy(file.getInputStream(), Paths.get(rootPath+File.separator+"server").resolve(file.getOriginalFilename()));
		} catch (Exception e) {
			throw new RuntimeException("FAIL!");
		}
	}
	
}
