package com.architectureoslabs.engine.analyzer;

import com.architectureoslabs.engine.model.ArchitectureGraph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests RepositoryAnalyzer behavior.
 */
public class RepositoryAnalyzerTest {

    @Test
    void shouldBuildArchitectureGraph() {

        RepositoryAnalyzer analyzer =
                new RepositoryAnalyzer();

        String sourceCode = """

                import com.company.repository.PaymentRepository;
                import com.company.user.UserService;

                public class PaymentService {

                }

                """;

        ArchitectureGraph graph =
                analyzer.analyze(sourceCode);

        assertNotNull(graph);

        assertEquals(
                1,
                graph.getComponents().size()
        );

        assertEquals(
                2,
                graph.getDependencies().size()
        );

        assertEquals(
                "PaymentService",
                graph.getComponents()
                        .get(0)
                        .getName()
        );
    }

}
