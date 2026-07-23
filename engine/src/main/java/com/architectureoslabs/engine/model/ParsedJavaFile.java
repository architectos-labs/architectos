package com.architectureoslabs.engine.model;

import java.util.List;


/**
 * Represents the result of parsing a Java source file.
 */
public class ParsedJavaFile {


    private final SoftwareComponent component;


    private final List<Dependency> dependencies;



    public ParsedJavaFile(
            SoftwareComponent component,
            List<Dependency> dependencies
    ) {

        this.component = component;
        this.dependencies = dependencies;

    }



    public SoftwareComponent getComponent() {

        return component;

    }



    public List<Dependency> getDependencies() {

        return dependencies;

    }

}
