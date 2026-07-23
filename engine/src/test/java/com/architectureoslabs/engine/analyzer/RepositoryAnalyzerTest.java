package com.architectureoslabs.engine.analyzer;


import com.architectureoslabs.engine.model.SoftwareComponent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests for RepositoryAnalyzer.
 */
public class RepositoryAnalyzerTest {


    @Test
    void shouldAnalyzeRepository() {


        RepositoryAnalyzer analyzer =
                new RepositoryAnalyzer();


        SoftwareComponent component =
                analyzer.analyze(
                        "test-repository"
                );


        assertNotNull(component);

        assertEquals(
                "test-repository",
                component.getName()
        );


        assertEquals(
                "repository",
                component.getType()
        );
    }

}
