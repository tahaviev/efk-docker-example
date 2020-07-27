import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public final class Main {

    public static void main(final String... args) throws Exception {
        final var log = Files.createDirectories(Path.of("logs")).resolve("log.txt");
        while (!Thread.interrupted()) {
            Files.writeString(log, "hello\n", StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            Thread.sleep(3000);
        }
    }
}
