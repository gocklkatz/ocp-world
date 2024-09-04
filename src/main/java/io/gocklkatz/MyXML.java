package io.gocklkatz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MyXML {
    
    public static void main(String[] args) throws IOException {
        Path path = Path.of("test.xml");
        List<String> strings = Files.readAllLines(path);
        for(String s : strings) {
            System.out.println(s);
        }

        // Load test.xml with DOM parser

        // Load test.xml with SAX parser

        // Get <fl:elem1> from test.xml
    }
}
