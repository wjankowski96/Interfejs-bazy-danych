package oop;

public class Matematyk extends Naukowiec{
    private String jezyki;

    public Matematyk(String imie, String nazwisko, String najwiekszeOsiagniecie)
    {
        super(imie, nazwisko, najwiekszeOsiagniecie);
    }

    public Matematyk(String imie, String nazwisko, String najwiekszeOsiagniecie, String jezyki)
    {
        super(imie, nazwisko, najwiekszeOsiagniecie);
        this.jezyki=jezyki;
        
    }

    @Override
    protected void NazwaDyscyplinyNaukowej()
    {
        System.out.println("Moja nauka to Matematyka");
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





