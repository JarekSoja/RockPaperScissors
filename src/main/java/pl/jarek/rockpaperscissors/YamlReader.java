package pl.jarek.rockpaperscissors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

public class YamlReader {

    public static Cheater reader() {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            return mapper.readValue(new File("C:\\Users\\Jarek\\IdeaProjects\\rockpaperscissors\\src\\main\\resources\\config.txt"), Cheater.class);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}