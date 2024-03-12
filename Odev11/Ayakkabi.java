public class Ayakkabi {

    // Separate the construction of a complex object from its representation so that the same construction process can create different representations.

    private String marka;
    private int numara;
    private boolean bagcikVar;

    private Ayakkabi(AyakkabiBuilder ayakkabiBuilder) {
        marka = ayakkabiBuilder.marka;
        numara = ayakkabiBuilder.numara;
        bagcikVar = ayakkabiBuilder.bagcikVar;

    }

    public String getMarka() {
        return marka;
    }

    public int getNumara() {
        return numara;
    }

    public boolean isBagcikVar() {
        return bagcikVar;
    }

    public static class AyakkabiBuilder {

        private String marka;
        private int numara;
        private boolean bagcikVar;

        public AyakkabiBuilder(String marka) {
            this.marka = marka;
        }

        public AyakkabiBuilder setNumara(int numara) {
            this.numara = numara;
            return this;
        }

        public AyakkabiBuilder setBagcikVar(boolean bagcikVar) {
            this.bagcikVar = bagcikVar;
            return this;
        }

        public Ayakkabi build() {
            return new Ayakkabi(this);
        }
    }
}

    class Main{

        public static void main(String[] args) {

            Ayakkabi ayakkabi1 = new Ayakkabi.AyakkabiBuilder("Nike").build();
            Ayakkabi ayakkabi2 = new Ayakkabi.AyakkabiBuilder("Adidas").setNumara(42).setBagcikVar(true).build();
            System.out.println("Olusturulan birinci ayakkabinin ozellikleri -> Marka:"+ayakkabi1.getMarka()+" - Numara:"+ayakkabi1.getNumara()+" - Bagcik Durumu:"+ayakkabi1.isBagcikVar());
            System.out.println("************************");
            System.out.println("Olusturulan ikinci ayakkabinin ozellikleri -> Marka:"+ayakkabi2.getMarka()+" - Numara:"+ayakkabi2.getNumara()+" - Bagcik Durumu:"+ayakkabi2.isBagcikVar());

        }
    }



