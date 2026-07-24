package com.architectureoslabs.engine;


import com.architectureoslabs.engine.analyzer.RepositoryAnalyzer;
import com.architectureoslabs.engine.model.ArchitectureGraph;
import com.architectureoslabs.engine.rules.ArchitectureRuleEngine;
import com.architectureoslabs.engine.rules.CircularDependencyRule;
import com.architectureoslabs.engine.rules.RuleResult;



public class ArchitectOSApplication {


    public static void main(String[] args) {


        RepositoryAnalyzer analyzer =
                new RepositoryAnalyzer();



        String sourceCode = """

                import com.company.user.UserService;

                public class PaymentService {

                }

                """;



        ArchitectureGraph graph =
                analyzer.analyze(
                        sourceCode
                );



        ArchitectureRuleEngine engine =
                new ArchitectureRuleEngine();



        engine.registerRule(
                new CircularDependencyRule()
        );



        System.out.println(
                "ArchitectOS Report"
        );



        for (RuleResult result :
                engine.analyze(graph)) {


            System.out.println(
                    "Rule: "
                            + result.getRuleName()
            );


            System.out.println(
                    "Severity: "
                            + result.getSeverity()
            );


            System.out.println(
                    "Status: "
                            + (result.isViolated()
                            ? "FAILED"
                            : "PASSED")
            );


            System.out.println(
                    "Message: "
                            + result.getMessage()
            );

        }

    }

}
