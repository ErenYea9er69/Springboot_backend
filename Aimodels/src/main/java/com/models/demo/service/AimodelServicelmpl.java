package com.models.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.models.demo.entities.Aimodel;
import com.models.demo.entities.OpenState;
import com.models.demo.repos.AimodelsRepository;

@Service
public class AimodelServicelmpl implements Aimodelservice {
    
    @Autowired
    AimodelsRepository aimodelRepository;

    // CRUD methods remain unchanged
    @Override
    public Aimodel saveAimodel(Aimodel p) {
        return aimodelRepository.save(p);
    }

    @Override
    public Aimodel updateAimodel(Aimodel p) {
        return aimodelRepository.save(p);
    }

    @Override
    public void deleteAimodel(Aimodel p) {
        aimodelRepository.delete(p);        
    }

    @Override
    public void deleteAimodelById(Long id) {
        aimodelRepository.deleteById(id);        
    }

    @Override
    public Aimodel getAimodel(Long id) {
        return aimodelRepository.findById(id).get();
    }

    @Override
    public List<Aimodel> getAllAimodel() {
        return aimodelRepository.findAll();
    }
    
    // Search implementations - CORRECTED
    @Override
    public List<Aimodel> findByName(String name) {
        return aimodelRepository.findByName(name);
    }
    
    @Override
    public List<Aimodel> findByNameContains(String name) {
        return aimodelRepository.findByNameContaining(name); // FIXED: Was returning null
    }
    
    @Override
    public List<Aimodel> findByNameAndAccuracy(String name, Float accuracy) {
        return aimodelRepository.findByNameContainingAndAccuracy(name, accuracy); // FIXED: Wrong repository method
    }
    
    @Override
    public List<Aimodel> findByOpenState(OpenState openState) {
        return aimodelRepository.findByOpenState(openState);
    }
    
    @Override
    public List<Aimodel> findByOpenStateId(Long id) {
        return aimodelRepository.findByOpenstateIdstate(id);
    }
    
    // Sorting implementations - CORRECTED
    @Override
    public List<Aimodel> findByOrderByNameAsc() {
        return aimodelRepository.findByOrderByNameAsc();
    }
    
    @Override
    public List<Aimodel> sortAimodelsByNameAccuracy() { // ADDED MISSING IMPLEMENTATION
        return aimodelRepository.findByOrderByNameAscAccuracyDesc();
    }
}