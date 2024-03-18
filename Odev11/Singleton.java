
    // Ensure a class only has one instance, and provide a global point of access to it.

    public class Singleton {

        private static Singleton singleton = new Singleton();

        private static int count;
        private String name;

        private Singleton() {
            count++;
            name = "Singleton" + count;
        }

        public static Singleton getInstance() {
            return singleton;
        }

        public void printName() {
            System.out.println(name);
        }
}
