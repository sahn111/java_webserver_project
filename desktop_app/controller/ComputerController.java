package com.example.demo.controller;

import com.example.demo.entity.Computer;
import com.example.demo.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComputerController {
    @Autowired
    ComputerService computerService;

    @PostMapping("/savecomputer")
    public Computer saveComputer(@RequestBody Computer co)
    {
        return computerService.saveComputer(co);
    }

    @GetMapping("/getcomputer/{prod_id}")
    public Computer getComputer(@PathVariable String prod_id)
    {
        return computerService.getComputer(prod_id);
    }

    @GetMapping("/getallcomputers")
    public List<Computer> getAllComputers(){return computerService.getAllComputers();}

    @GetMapping("/getallcomputersbybrand/{name}")
    public List<Computer> getAllComputersByBrand(@PathVariable String name){return computerService.getAllComputersByBrand(name);}

    @GetMapping("/getallcomputersbyscreensizeandbrand/{screen_size}/{name}")
    public List<Computer> getComputerByScreenSizeANDBrand(@PathVariable String screen_size, @PathVariable String name){ return  computerService.getComputerByScreenSizeANDBrand(screen_size,name);}
}
