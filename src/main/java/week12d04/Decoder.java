package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Decoder {
public void decode (Path path) throws IOException {
    byte[] bytes = Files.readAllBytes(path);
    for (byte b: bytes) {
        char c = (char) (b + 10);
        System.out.print(c);
    }
}

    public static void main(String[] args) throws IOException {
        new Decoder().decode(Path.of("secret.dat"));
    }
}
