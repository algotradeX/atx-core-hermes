package com.atx.core.hermes.config;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.config.EventProcessingConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AxonConfig {

    @Autowired
    public void configure(EventProcessingConfigurer configurer) {
        configurer.usingTrackingEventProcessors();
    }

}
