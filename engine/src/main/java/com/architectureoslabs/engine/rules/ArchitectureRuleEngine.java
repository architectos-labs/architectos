package com.architectureoslabs.engine.rules;


import com.architectureoslabs.engine.model.ArchitectureGraph;

import java.util.ArrayList;
import java.util.List;


/**
 * Executes architecture validation rules.
 */
public class ArchitectureRuleEngine {


    private final List<ArchitectureRule> rules;



    public ArchitectureRuleEngine() {

        this.rules =
                new ArrayList<>();

    }



    /**
     * Register a new architecture rule.
     *
     * @param rule architecture rule
     */
    public void registerRule(
            ArchitectureRule rule
    ) {

        rules.add(rule);

    }



    /**
     * Execute all registered rules.
     *
     * @param graph architecture graph
     * @return rule results
     */
    public List<RuleResult> analyze(
            ArchitectureGraph graph
    ) {


        List<RuleResult> results =
                new ArrayList<>();



        for (ArchitectureRule rule : rules) {


            results.add(
                    rule.evaluate(graph)
            );

        }


        return results;

    }

}
