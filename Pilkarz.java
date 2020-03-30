package oop;

public class Pilkarz extends Sportowiec { //implements IIpoliglota, IInstagramer

    private int obserwujacy;
    private String jezyki;

    public Pilkarz(String imie, String nazwisko, String dzielo)
    {
        super(imie, nazwisko, dzielo);
    }

    public Pilkarz(String imie, String nazwisko, String dzielo, int obserwujacy)
    {
        super(imie, nazwisko, dzielo);
        this.obserwujacy=obserwujacy;
    }

    public Pilkarz(String imie, String nazwisko, String dzielo, String jezyki)
    {
        super(imie, nazwisko, dzielo);
        this.jezyki=jezyki;
    }
    @Override
    protected void NazwaSportu()
    {
        System.out.println("Moj sport to piłka nozna");
    }

    @Override
    protected void Osiagniecia()
    {
        System.out.println("Moje wazne osiagniecie to "+this.getSukces());
    }

    @Override
    public void LiczbaObserwujacych()
    {
        System.out.println("Liczba obserwujacych na Instagramie to "+this.obserwujacy);
    }

    @Override
    public void ZnajomoscJezykow()
    {
        System.out.println("Liczba znanych jezykow to "+this.jezyki);
    }

}


