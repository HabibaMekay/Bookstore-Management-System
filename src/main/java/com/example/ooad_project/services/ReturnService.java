package com.example.ooad_project.services;

import com.example.ooad_project.entities.Return;
import com.example.ooad_project.repositories.ReturnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnService {

    @Autowired
    private ReturnRepository returnRepository;

    public List<Return> getAllReturns() {
        return returnRepository.findAll();
    }

    public Return getReturnById(int id) {
        return returnRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Return not found with id: " + id));
    }

    public void saveReturn(Return returnEntity) {
        returnRepository.save(returnEntity);
    }

    public void deleteReturnById(int id) {
        returnRepository.deleteById(id);
    }

    public void processReturn(int id) {
        Return returnEntity = getReturnById(id);
        returnEntity.process();
        returnRepository.save(returnEntity);
    }
}
