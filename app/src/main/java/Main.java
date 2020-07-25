public final class Main {

    public static void main(final String... args) throws Exception {
        while (!Thread.interrupted()) {
            System.out.println("Hello");
            Thread.sleep(3000);
        }
    }
}
