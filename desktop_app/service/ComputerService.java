package com.example.demo.service;

import com.example.demo.entity.Computer;
import com.example.demo.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {
    @Autowired
    ComputerRepository computerRepository;

    public Computer saveComputer(Computer c){
        return computerRepository.save(c);
    }

    public Computer getComputer(String prod_id){
        return computerRepository.findById(prod_id).orElse(null);
    }

    public List<Computer> getAllComputers(){return computerRepository.getAllComputers();}

    public List<Computer> getAllComputersByBrand(String name){return computerRepository.getAllComputersByBrand(name);}

   public List<Computer> getComputerByScreenSizeANDBrand(String screen_size, String name){return computerRepository.getComputerByScreenSizeANDBrand(screen_size,name);}
}
