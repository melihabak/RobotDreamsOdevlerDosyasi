public class Ekip1 extends Departman {

    public Ekip1(Personel teamLead) {
        super(teamLead);
    }


    @Override
    public Personel getTeamLead() {
        return super.getTeamLead();
    }

    @Override
    public void setTeamLead(Personel teamLead) {
        super.setTeamLead(teamLead);
    }

    @Override
    public void degistirTeamLead(Personel newTeamLead) {
        super.degistirTeamLead(newTeamLead);
    }

    @Override
    public void eklePersonel(Personel personel) {
        personelListesi.add(personel);
    }

    @Override
    public void cikarPersonel(Personel personel) {
        personelListesi.remove(personel);
    }

    @Override
    public void degistirPersonel() {
        super.degistirPersonel();
    }

    @Override
    public void ekleGorev(String gorevAdi) {
        gorevListesi.add(gorevAdi);
    }

    @Override
    public void cikarGorev(String gorevAdi) {
        super.cikarGorev(gorevAdi);
    }

    @Override
    public boolean gorevBittiMi(String gorevAdi) {
        return super.gorevBittiMi(gorevAdi);
    }
}
