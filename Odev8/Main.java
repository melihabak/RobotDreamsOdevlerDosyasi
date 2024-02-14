public class Main {
    public static void main(String[] args) {


        //Personel Olusturma

        Personel personel1 = new Erkek("Tuna","Unsal",1997);
        Personel personel2 = new Erkek("Ahmet","Abak",1989);
        Personel personel3 = new Erkek("Melih","Abak",1945);
        Personel personel4 = new Kadin("Ayse","Yilmaz",1956);
        Personel personel5 = new Kadin("Fatma","Ozturk",1964);
        Personel personel6 = new Kadin("Zeynep","Basaran",1984);
        Personel personel7 = new Kadin("Ecrin","Basaramayan",1910);



        //Ekipleri olusturma

        Ekip1 mobil = new Ekip1(personel1);
        Ekip2 backend = new Ekip2(personel4);


        //Takim liderleri bilgileri
        System.out.println("Mobil Ekibi Takim Lideri : "+mobil.getTeamLead().getAd()+" "+mobil.getTeamLead().getSoyad());
        System.out.println("Backend Ekibin Takim Lideri : "+backend.getTeamLead().getAd()+" "+backend.getTeamLead().getSoyad());

        System.out.println("***************************************");
        System.out.println("***************************************");


        //Personelleri ekiplere ekleme

        mobil.eklePersonel(personel7); //Birinci Metod
        mobil.personelListesi.add(personel1); //Ikinci Metod
        mobil.personelListesi.add(personel2);
        mobil.personelListesi.add(personel3);
        backend.personelListesi.add(personel4);
        backend.personelListesi.add(personel5);
        backend.personelListesi.add(personel6);


        //Ilk duzenlemeler sonrasi ekiplerdeki kisileri gorme

        System.out.println("Mobil Ekipteki Tum Personeller");
        System.out.println("Takim Lideri : "+mobil.getTeamLead().getAd()+" "+mobil.getTeamLead().getSoyad());
        for (Personel personel : mobil.personelListesi){
            System.out.println("Ekip Uyesi : "+personel.getAd()+" "+personel.getSoyad());
        }
        System.out.println("***************************************");
        System.out.println("Backend Ekipteki Tum Personeller");
        System.out.println("Takim Lideri : "+backend.getTeamLead().getAd()+" "+backend.getTeamLead().getSoyad());
        for (Personel personel : backend.personelListesi){
            System.out.println("Ekip Uyesi : "+personel.getAd()+" "+personel.getSoyad());
        }

        System.out.println("***************************************");
        System.out.println("***************************************");

        //Personelleri ekiplerden Cikarma

        mobil.cikarPersonel(personel7);

        System.out.println("***************************************");
        System.out.println("***************************************");


        //TeamLead Degistirme

        mobil.degistirTeamLead(personel2);
        backend.degistirTeamLead(personel6);


        //TeamLead degisimi sonrasi ekiplerdeki kisileri gorme

        System.out.println("Mobil Ekipteki Tum Personeller");
        System.out.println("Takim Lideri : "+mobil.getTeamLead().getAd()+" "+mobil.getTeamLead().getSoyad());
        for (Personel personel : mobil.personelListesi){
            System.out.println("Ekip Uyesi : "+personel.getAd()+" "+personel.getSoyad());
        }
        System.out.println("***************************************");
        System.out.println("Backend Ekipteki Tum Personeller");
        System.out.println("Takim Lideri : "+backend.getTeamLead().getAd()+" "+backend.getTeamLead().getSoyad());
        for (Personel personel : backend.personelListesi){
            System.out.println("Ekip Uyesi : "+personel.getAd()+" "+personel.getSoyad());

        }
        System.out.println("***************************************");
        System.out.println("***************************************");

        // Ekiplere gorevler ekleme

        mobil.ekleGorev("mobilgorev1");//Birinci metod
        mobil.ekleGorev("mobilgorev2");
        mobil.gorevListesi.add("mobilgorev3");//Ikinci metod
        mobil.gorevListesi.add("mobilgorev4");
        backend.ekleGorev("backendgorev1");//Birinci metod
        backend.ekleGorev("backendgorev2");
        backend.gorevListesi.add("backendgorev3");//Ikinci metod

        // Atanan gorevleri gorme

        System.out.println("Mobil Gorevler");
        for (String gorev : mobil.gorevListesi){
            System.out.println(gorev);
        }
        System.out.println("***************************************");
        System.out.println("Backend Gorevler");
        for (String gorev : backend.gorevListesi){
            System.out.println(gorev);
        }

        System.out.println("***************************************");
        System.out.println("***************************************");


        // Atanan gorevlerin bitip bitmediginin kontrolu

        System.out.println("Belirtilen gorev bitti mi ? : "+mobil.gorevBittiMi(mobil.gorevListesi.get(3)));

        System.out.println("***************************************");
        System.out.println("***************************************");


        // Gorev cikarma

        mobil.cikarGorev("mobilgorev4");

        //Gorev cikarma sonrasi gorevleri gorme

        System.out.println("Mobil Gorevler");
        for (String gorev : mobil.gorevListesi){
            System.out.println(gorev);
        }
        System.out.println("***************************************");
        System.out.println("Backend Gorevler");
        for (String gorev : backend.gorevListesi){
            System.out.println(gorev);

        }
    }
}
