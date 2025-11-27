package com.models.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.models.demo.entities.Aimodel;
import com.models.demo.entities.OpenState;
import com.models.demo.repos.AimodelsRepository;
import com.models.demo.repos.OpenStateRepository;

@SpringBootTest
class AimodelsApplicationTests {

    @Autowired
    private AimodelsRepository aimodelsRepository;
    
    @Autowired
    private OpenStateRepository openStateRepository;
    
 
    

    
    @Test
    public void testCreateAimodel() {
        Aimodel prod = new Aimodel("LLaMA 4", "4.0", new Date(), "llama4@example.com", 96.1f);
        aimodelsRepository.save(prod);
    }
    
    @Test
    public void testFindAimodel() {
        Aimodel p = aimodelsRepository.findById(2L).get();
        System.out.println(p);
    }
    
    @Test
    public void testUpdateAimodel() {
        Aimodel p = aimodelsRepository.findById(2L).get();
        p.setAccuracy(95.0f);
        aimodelsRepository.save(p);
    }
    
    @Test
    public void testDeleteAimodel() {
        aimodelsRepository.deleteById(4L);
    }

    @Test
    public void testListerTousAimodel() {
        List<Aimodel> prods = aimodelsRepository.findAll();
        for (Aimodel p : prods) {
            System.out.println(p);
        }
    }
    
    @Test
    public void testFindByNomAimodel() {
        List<Aimodel> prods = aimodelsRepository.findByName("Grok 3");
        for (Aimodel p : prods) {
            System.out.println(p);
        }
    }
    
    @Test
    public void findByNomVersion() {
        List<Aimodel> prods = aimodelsRepository.findByNomVersion("Grok 3", "3.0");
        for (Aimodel p : prods) {
            System.out.println(p);
        }
    }
    
    @Test
    public void testfindByCategorie() {
        OpenState cat = new OpenState();
        cat.setIdstate(1L);
        List<Aimodel> prods = aimodelsRepository.findByOpenState(cat);
        for (Aimodel p : prods) {
            System.out.println(p);
        }
    }
    
    @Test
    public void findByCategorieIdCat()
    {
        List<Aimodel> prods = aimodelsRepository.findByOpenstateIdstate(1L);  // Changed here
        for (Aimodel p : prods)
        {
            System.out.println(p);
        }
    }
    
    @Test
    public void testfindByOrderByNomProduitAsc()
    {
    List<Aimodel> prods =aimodelsRepository.findByOrderByNameAsc();
    for (Aimodel p : prods)
    {
    System.out.println(p);
    }
    }
    
    @Test
    public void testTrierAimodelsNomsAccuracy() {
        List<Aimodel> aimodels = aimodelsRepository.findByOrderByNameAscAccuracyDesc();
        for (Aimodel a : aimodels) {
            System.out.println(a);
        }
    }
}