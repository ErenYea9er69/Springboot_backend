package com.models.demo.service;

import java.util.List;
import com.models.demo.entities.Aimodel;
import com.models.demo.entities.OpenState;

public interface Aimodelservice {
    // Existing methods
    Aimodel saveAimodel(Aimodel p);
    Aimodel updateAimodel(Aimodel p);
    void deleteAimodel(Aimodel p);
    void deleteAimodelById(Long id);
    Aimodel getAimodel(Long id);
    List<Aimodel> getAllAimodel();
    
    // Search methods
    List<Aimodel> findByName(String name);
    List<Aimodel> findByNameContains(String name);
    List<Aimodel> findByNameAndAccuracy(String name, Float accuracy);
    List<Aimodel> findByOpenState(OpenState openState);
    List<Aimodel> findByOpenStateId(Long id);
    
    // Sorting methods - CORRECTED
    List<Aimodel> findByOrderByNameAsc();
    List<Aimodel> sortAimodelsByNameAccuracy(); // THIS WAS MISSING
}