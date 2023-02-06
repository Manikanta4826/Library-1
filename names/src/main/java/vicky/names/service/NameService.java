package vicky.names.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import vicky.names.Repository.NameRepository;
import vicky.names.entity.NameEntity;

import java.util.List;
@Service


public class NameService {
    @Autowired

    private NameRepository NameRepo;

    public NameEntity save(NameEntity details) {
        return NameRepo.save(details);
    }


    public List<NameEntity> findAll() {
        return NameRepo.findAll();
    }


    public void delete(String id) {
        NameRepo.deleteById(id);

    }


    public Object getDetailsById(String id) {
        return NameRepo.findById(id);
    }


}

