import java.util.Arrays;

public class Names {

    String sorgulananAd;
    static String[] names = {"AI", "Matlab",
            "Scikit", "TensorFlow",
            "OpenCV", "DeepLearning",
            "NLP", "NeuralNetworks",
            "Regression", "Sklakfsfllaf",
            "safajhnjsn"};
    public static void adSorgula (){

        Arrays
                .stream(names) // same as Stream.of(names)
                .filter(x -> x.startsWith("S")) //names dizisinden bas harfi buyuk olan ogeleri sec
                .sorted() // secilen ogeleri sirala
                .forEach(System.out::println); // secilen ogeleri yazdir.

    }

    public static void main(String[] args) {

        adSorgula();

    }
}
