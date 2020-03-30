package oop;

public abstract class Naukowiec implements IPoliglota {
    private String imie;
    private String nazwisko;
    private String najwiekszeOsiagniecie;

    public Naukowiec(String imie, String nazwisko, String najwiekszeOsiagniecie)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.najwiekszeOsiagniecie=najwiekszeOsiagniecie;
        
    }

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }
    public String getSukces()
    {
        return najwiekszeOsiagniecie;
    }

    public void ImieNazwisko()
    {
        System.out.println("Nazywam się "+this.getImie()+" "+this.getNazwisko());
    }

    public abstract void ZnajomoscJezykow();
    protected abstract void NazwaDyscyplinyNaukowej();
    protected abstract void ZdobyteOsiagniecie();
}

