package com.architectureoslabs.engine.parser;


import com.architectureoslabs.engine.model.SoftwareComponent;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;



/**
 * Tests Java source parsing behavior.
 */
public class JavaSourceParserTest {



    @Test
    void shouldExtractClassNameFromJavaSource() {


        JavaSourceParser parser =
                new JavaSourceParser();



        String sourceCode = """

                public class PaymentService {

                }

                """;



        SoftwareComponent component =
                parser.parse(sourceCode);



        assertNotNull(component);



        assertEquals(
                "PaymentService",
                component.getName()
        );



        assertEquals(
                "class",
                component.getType()
        );

    }

}
