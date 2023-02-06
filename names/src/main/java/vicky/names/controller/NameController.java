package vicky.names.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vicky.names.entity.NameEntity;
import vicky.names.service.NameService;

import java.util.List;
@Controller
@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("Names")


public class NameController {
    @Autowired
    private NameService nameservice;

    @PostMapping("/")
    public NameEntity addDetails(@RequestBody NameEntity details) {
        return this.nameservice.save(details);
    }

    @PutMapping("/{id}")
    public NameEntity updateDetails(@RequestBody NameEntity details) {
        return this.nameservice.save(details);
    }

    @DeleteMapping("/{id}")
    public void deleteDetails(@PathVariable("id") String id) {
        this.nameservice.delete(id);
    }

    @GetMapping("/{id}")
    public Object getDetails(@PathVariable("id") String id ) {
        return this.nameservice.getDetailsById(id);
    }


    @GetMapping("/")
    public List<NameEntity> getDetails() {
        return this.nameservice.findAll();
    }


}


