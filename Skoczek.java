package oop;

public class Skoczek extends Sportowiec { //implements IIpoliglota, IInstagramer

    private int obserwujacy;
    private String jezyki;

    public Skoczek(String imie, String nazwisko, String dzielo)
    {
        super(imie, nazwisko, dzielo);
    }

    public Skoczek(String imie, String nazwisko, String dzielo, int obserwujacy)
    {
        super(imie, nazwisko, dzielo);
        this.obserwujacy=obserwujacy;
    }

    public Skoczek(String imie, String nazwisko, String dzielo, String jezyki)
    {
        super(imie, nazwisko, dzielo);
        this.jezyki=jezyki;
    }

    @Override
    protected void NazwaSportu()
    {
        System.out.println("Moj sport to skoski narciarskie");
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
        System.out.println("Liczba obserwujacych na Instagramie to "+this.jezyki);
    }
}


