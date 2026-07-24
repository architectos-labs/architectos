package com.architectureoslabs.engine.rules;


/**
 * Represents the result of an architecture rule evaluation.
 */
public class RuleResult {


    private final String ruleName;


    private final String severity;


    private final boolean violated;


    private final String message;



    public RuleResult(
            String ruleName,
            String severity,
            boolean violated,
            String message
    ) {

        this.ruleName = ruleName;
        this.severity = severity;
        this.violated = violated;
        this.message = message;

    }



    public String getRuleName() {

        return ruleName;

    }



    public String getSeverity() {

        return severity;

    }



    public boolean isViolated() {

        return violated;

    }



    public String getMessage() {

        return message;

    }


}
