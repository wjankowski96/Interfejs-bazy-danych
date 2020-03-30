package oop;

public class Elektrotechnik extends Naukowiec{
    private String jezyki;

    public Elektrotechnik(String imie, String nazwisko, String najwiekszeOsiagniecie)
    {
        super(imie, nazwisko, najwiekszeOsiagniecie);
    }

    public Elektrotechnik(String imie, String nazwisko, String najwiekszeOsiagniecie, String jezyki)
    {
        super(imie, nazwisko, najwiekszeOsiagniecie);
        this.jezyki=jezyki;
        
    }

    @Override
    protected void NazwaDyscyplinyNaukowej()
    {
        System.out.println("Moja nauka to Elektrotechnika");
    }

    @Override
    protected void ZdobyteOsiagniecie()
    {
        System.out.println("Moje wazne osiagniecie to "+this.getSukces());
    }

    @Override
    public void ZnajomoscJezykow()
    {
        System.out.println("Liczba znanych jezykow: "+this.jezyki);
    }

}