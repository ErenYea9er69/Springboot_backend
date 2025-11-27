package com.models.demo.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.models.demo.entities.Aimodel;
import com.models.demo.service.Aimodelservice;

@RestController
@RequestMapping("/ai-models/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class AimodelRESTController {
    
    @Autowired
    Aimodelservice aimodelService;
    
    // GET all AI models
    @RequestMapping(method = RequestMethod.GET)
    public List<Aimodel> getAllAimodels() {
        return aimodelService.getAllAimodel();
    }
    
    // GET AI model by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Aimodel getAimodelById(@PathVariable("id") Long id) {
        return aimodelService.getAimodel(id);
    }
    
    // CREATE AI model
    @RequestMapping(method = RequestMethod.POST)
    public Aimodel createAimodel(@RequestBody Aimodel aimodel) {
        return aimodelService.saveAimodel(aimodel);
    }
    
    // UPDATE AI model
    @RequestMapping(method = RequestMethod.PUT)
    public Aimodel updateAimodel(@RequestBody Aimodel aimodel) {
        return aimodelService.updateAimodel(aimodel);
    }
    
    // DELETE AI model
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteAimodel(@PathVariable("id") Long id) {
        aimodelService.deleteAimodelById(id);
    }
    
    // GET AI models by OpenState ID
    @RequestMapping(value = "/modelsstate/{idState}", method = RequestMethod.GET)
    public List<Aimodel> getAimodelsByStateId(@PathVariable("idState") Long idState) {
        return aimodelService.findByOpenStateId(idState);
    }
}