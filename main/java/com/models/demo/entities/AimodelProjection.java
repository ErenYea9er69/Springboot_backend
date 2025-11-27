package com.models.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "modelSummary", types = { Aimodel.class })
public interface AimodelProjection {
    String getName();
    String getVersion();
    Float getAccuracy();
}