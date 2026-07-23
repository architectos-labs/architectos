# ADR-001: Selection of Analysis Engine Language

## Status

Accepted


## Date

July 2026


## Context

ArchitectOS requires a core analysis engine capable of understanding software systems, extracting structural relationships, and performing static architecture analysis.

The initial target ecosystems are:

- Java
- Kotlin
- Spring Boot


The analysis engine must support:

- Source code parsing
- Dependency extraction
- Large repository analysis
- Extensible architecture rules


## Decision

The initial ArchitectOS analysis engine will be implemented using Java.


## Reasons

### JVM Ecosystem Alignment

Java and Kotlin applications represent a significant portion of enterprise software systems.

The JVM ecosystem provides mature tooling for:

- Source analysis
- Bytecode inspection
- Dependency analysis


### Enterprise Adoption

Many large-scale systems are built using:

- Java
- Kotlin
- Spring Framework


Building on the JVM ecosystem allows ArchitectOS to provide immediate value to enterprise developers.


### Long-Term Extensibility

A Java-based core allows future support for:

- Kotlin analysis
- JVM bytecode analysis
- Enterprise application analysis


## Alternatives Considered

## Python

Advantages:

- Strong parsing ecosystem
- Rapid development

Reasons Not Selected:

- Less alignment with enterprise JVM systems
- Additional complexity for JVM-specific analysis


## Node.js

Advantages:

- Developer-friendly ecosystem
- Strong tooling community

Reasons Not Selected:

- Less mature ecosystem for JVM application analysis


## Consequences

Positive:

- Strong JVM ecosystem support
- Better enterprise alignment
- Easier Kotlin support


Tradeoffs:

- JVM dependency
- Higher initial complexity


## Future Considerations

The architecture will keep language-specific analysis modules isolated.

Future analyzers may support:

- Node.js
- Python
- Go
- Android applications
