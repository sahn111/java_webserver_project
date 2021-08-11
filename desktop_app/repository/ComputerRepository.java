package com.example.demo.repository;


import com.example.demo.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, String> {
    @Query("SELECT c FROM Computer c WHERE c.prod_id LIKE %?1%")
    public List<Computer> getComputerById(String prod_id);

    @Query("SELECT c FROM Computer c")
    public List<Computer> getAllComputers();

    @Query("SELECT p FROM Computer p,Brand b WHERE b.name LIKE %?1% and b.name LIKE p.brand.name")
    public List<Computer> getAllComputersByBrand(String name);

    @Query("SELECT c FROM Computer c,Brand b  WHERE c.screen_size LIKE %?1% AND b.name LIKE %?2% AND c.brand.name LIKE b.name")
    public List<Computer> getComputerByScreenSizeANDBrand(String screen_size, String name);
}
