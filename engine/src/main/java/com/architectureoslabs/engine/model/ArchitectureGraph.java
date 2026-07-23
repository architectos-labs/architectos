package com.architectureoslabs.engine.model;


import java.util.ArrayList;
import java.util.List;


/**
 * Represents the architecture graph of a software system.
 *
 * Nodes:
 *  Software components
 *
 * Edges:
 *  Dependencies between components
 */
public class ArchitectureGraph {


    private final List<SoftwareComponent> components;


    private final List<Dependency> dependencies;



    public ArchitectureGraph() {

        this.components =
                new ArrayList<>();


        this.dependencies =
                new ArrayList<>();

    }



    public void addComponent(
            SoftwareComponent component
    ) {

        components.add(component);

    }



    public void addDependency(
            Dependency dependency
    ) {

        dependencies.add(dependency);

    }



    public List<SoftwareComponent> getComponents() {

        return components;

    }



    public List<Dependency> getDependencies() {

        return dependencies;

    }

}
