import java.util.ArrayList;

abstract class Departman {

    private Personel teamLead ;
    ArrayList<Personel> personelListesi = new ArrayList<>();
    ArrayList<String> gorevListesi = new ArrayList<>();

    public Departman(Personel teamLead) {
        this.teamLead = teamLead;
    }

    public Personel getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Personel teamLead) {
        this.teamLead = teamLead;
    }

    public void degistirTeamLead(Personel newTeamLead){

        setTeamLead(newTeamLead);

    }
    public void eklePersonel(Personel personel){

        personelListesi.add(personel);

    }
    public void cikarPersonel(Personel personel){

        personelListesi.remove(personel);

    }
    public void degistirPersonel(){

    }
    public void ekleGorev(String gorevAdi){

        gorevListesi.add(gorevAdi);

    }
    public void cikarGorev(String gorevAdi){

        gorevListesi.remove(gorevAdi);

    }
    public boolean gorevBittiMi(String gorevAdi){
        boolean sonuc = false;
        for (String gorev : gorevListesi){

            if (gorev==gorevAdi){
                return false;
            }
        }
        return true;

    }


}



