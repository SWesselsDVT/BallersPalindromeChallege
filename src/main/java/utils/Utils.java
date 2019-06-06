package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {
    public static List<String> readFileToList(String fileName) {
        List<String> strings = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            strings = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
}
