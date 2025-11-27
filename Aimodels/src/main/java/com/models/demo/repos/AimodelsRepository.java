package com.models.demo.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.models.demo.entities.Aimodel;
import com.models.demo.entities.OpenState;

@RepositoryRestResource(path = "rest")
public interface AimodelsRepository extends JpaRepository<Aimodel, Long> {
    
    List<Aimodel> findByName(String name);
    
    @Query("select p from Aimodel p where p.name like %:nom% and p.version = :version")
    List<Aimodel> findByNomVersion(@Param("nom") String nom, @Param("version") String version);
    
    @Query("select p from Aimodel p where p.openstate = ?1")
    List<Aimodel> findByOpenState(OpenState openState);
    
    List<Aimodel> findByOpenstateIdstate(Long idstate);
    List<Aimodel> findByOrderByNameAsc();
    List<Aimodel> findByOrderByNameAscAccuracyDesc();
    List<Aimodel> findByNameContaining(String name);
    List<Aimodel> findByNameContainingAndAccuracy(String name, Float accuracy);
}