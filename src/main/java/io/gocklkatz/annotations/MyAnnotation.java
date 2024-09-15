package io.gocklkatz.annotations;

import java.nio.file.Path;
import java.time.LocalDate;

public class MyAnnotation {

    @CurrentDateResource
    public LocalDate now;

    @ListOfFilesResource("/")
    Path[] files;

    /*
    @UrlResource("http://tutego.de/javabuch/aufgaben/bond.txt")
    String testFile1;

    @UrlResource(value = "http://tutego.de/javabuch/aufgaben/bond.txt",
                 trim = true,
                 upperLowerCase = UpperLowerCase.UPPER)
    public String getTestFile2;

    @UrlResource(value = "http://tutego.de/javabuch/aufgaben/bond.txt",
                 converter = {
                         RemoveNoWordCharactersConverter.class,
                         SortConverter.class
                 })
    public String getTestFile3;
     */

    public static void main(String[] args) {

    }
}
