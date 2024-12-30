package com.example.ooad_project.controllers;

import com.example.ooad_project.entities.Return;
import com.example.ooad_project.repositories.ReturnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/returns")
public class ReturnController {

    @Autowired
    private ReturnRepository returnRepository;

    @PostMapping
    public Return createReturn(@RequestBody Return returnTransaction) {
        return returnRepository.save(returnTransaction);
    }

    @GetMapping("/{id}")
    public Return getReturnById(@PathVariable int id) {
        return returnRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Return updateReturn(@PathVariable int id, @RequestBody Return returnDetails) {
        Return returnTransaction = returnRepository.findById(id).orElse(null);
        if (returnTransaction != null) {
            return returnRepository.save(returnTransaction);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteReturn(@PathVariable int id) {
        returnRepository.deleteById(id);
    }
}
