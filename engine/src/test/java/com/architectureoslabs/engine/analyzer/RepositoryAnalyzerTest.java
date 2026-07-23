package com.architectureoslabs.engine.analyzer;


import com.architectureoslabs.engine.model.ParsedJavaFile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



/**
 * Tests RepositoryAnalyzer behavior.
 */
public class RepositoryAnalyzerTest {


    @Test
    void shouldAnalyzeJavaRepository() {


        RepositoryAnalyzer analyzer =
                new RepositoryAnalyzer();


        String sourceCode = """

                import com.company.repository.PaymentRepository;


                public class PaymentService {

                }

                """;


        ParsedJavaFile result =
                analyzer.analyze(
                        sourceCode
                );


        assertNotNull(result);


        assertEquals(
                "PaymentService",
                result.getComponent()
                        .getName()
        );


        assertEquals(
                1,
                result.getDependencies()
                        .size()
        );

    }

}
