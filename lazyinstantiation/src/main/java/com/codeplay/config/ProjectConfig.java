package com.codeplay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.codeplay.beans.speakers.BoseSpeakers;
import com.codeplay.beans.speakers.SonySpeakers;
import com.codeplay.beans.tyres.BridgeStoneTyres;
import com.codeplay.beans.tyres.MichelinTyres;
import com.codeplay.interfaces.Speaker;
import com.codeplay.interfaces.Tyres;

@Configuration
@ComponentScan(basePackages = "com.codeplay.beans")
public class ProjectConfig {

    @Bean
    public Speaker speakers1() {
        Speaker sonySpeakers = new SonySpeakers();
        return sonySpeakers;
    }

    @Primary
    @Bean
    public Speaker speakers2() {
        Speaker boseSpeakers = new BoseSpeakers();
        return boseSpeakers;
    }

    @Bean
    public Tyres tyres1() {
        Tyres bridgeStoneTyres = new BridgeStoneTyres();
        return bridgeStoneTyres;
    }

    @Primary
    @Bean
    public Tyres tyres2() {
        Tyres michelinTyres = new MichelinTyres();
        return michelinTyres;
    }

}

/**
 * Different ways to ComponenetScan :
 * 
 * @ComponentScan(basePackages = {"com.codeplay.beans",
 *                             "com.codeplay.implementations"})
 * 
 * @ComponentScan(basePackageClasses = {com.codeplay.beans.Vehicle.class,
 *                                   com.codeplay.beans.Person.class})
 */