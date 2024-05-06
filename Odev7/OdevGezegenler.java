import java.util.Arrays;

public class OdevGezegenler {

    public enum gezegenlerDizisi  {
        MERKUR, VENUS,  DUNYA, MARS, JUPITER, SATURN, URANUS, NEPTUN
    }


    public static void siralama (){

        int i=1;
        for (gezegenlerDizisi gezegen : gezegenlerDizisi.values()){

            System.out.println(gezegen+" gezegeninin Gunese olan siralamasi : "+ i);
            i++;

        }
    }
    public static void guneseUzaklik (){

        int r = 10;
        for (gezegenlerDizisi gezegen : gezegenlerDizisi.values()){

            System.out.println(gezegen+" gezegeninin Gunese olan uzakligi : "+ r +" km");
            r = r+10;

        }
    }
    public static void yaricap () {

        for (gezegenlerDizisi gezegen : gezegenlerDizisi.values()) {

            switch (gezegen) {

                case MERKUR:
                    System.out.println("Merkurun yaricapi : " + 45 + " km");
                    break;

                case VENUS:
                    System.out.println("Venusun yaricapi : " + 65 + " km");
                    break;

                case DUNYA:
                    System.out.println("Dunyanin yaricapi : " + 60 + " km");
                    break;

                case MARS:
                    System.out.println("Marsin yaricapi : " + 40 + " km");
                    break;

                case JUPITER:
                    System.out.println("Jupiterin yaricapi : " + 155 + " km");
                    break;

                case SATURN:
                    System.out.println("Saturnun yaricapi : " + 25 + " km");
                    break;

                case URANUS:
                    System.out.println("Uranusun yaricapi : " + 125 + " km");
                    break;

                case NEPTUN:
                    System.out.println("Neptunun yaricapi : " + 75 + " km");
                    break;

            }
        }
    }
    public static void donmeSuresi () {

        for (gezegenlerDizisi gezegen : gezegenlerDizisi.values()) {

            switch (gezegen) {

                case MERKUR:
                    System.out.println("Merkurun donme suresi : " + 45 + " saat");
                    break;

                case VENUS:
                    System.out.println("Venusun donme suresi : " + 65 + " saat");
                    break;

                case DUNYA:
                    System.out.println("Dunyanin donme suresi : " + 60 + " saat");
                    break;

                case MARS:
                    System.out.println("Marsin donme suresi : " + 40 + " saat");
                    break;

                case JUPITER:
                    System.out.println("Jupiterin donme suresi : " + 155 + " saat");
                    break;

                case SATURN:
                    System.out.println("Saturnun donme suresi : " + 25 + " saat");
                    break;

                case URANUS:
                    System.out.println("Uranusun donme suresi : " + 125 + " saat");
                    break;

                case NEPTUN:
                    System.out.println("Neptunun donme suresi : " + 75 + " saat");
                    break;

            }
        }
    }

    public static void main (String[]args){

        System.out.println("***********************************************");
        System.out.println("***********************************************");
        siralama();
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        guneseUzaklik();
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        yaricap();
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        donmeSuresi();
        System.out.println("***********************************************");
        System.out.println("***********************************************");

    }
}
