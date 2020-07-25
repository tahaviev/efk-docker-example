import java.util.Map;
import org.apache.logging.log4j.CloseableThreadContext;
import org.apache.logging.log4j.LogManager;

public final class Main {

    public static void main(final String... args) throws Exception {
        final var metadata = Map.of("key1", "value1", "key2", "value2");
        try (var context = CloseableThreadContext.putAll(metadata)) {
            while (!Thread.interrupted()) {
                LogManager.getLogger().info("hello");
                Thread.sleep(3000);
            }
        }
    }
}
