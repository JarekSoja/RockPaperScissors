package pl.jarek.rockpaperscissors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

public class YamlReader {

    public Cheater reader() {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("file/test.xml").getFile());
            return mapper.readValue(file, Cheater.class);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

