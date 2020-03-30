package oop;

public abstract class Sportowiec implements IInstagramer, IPoliglota{

    private String imie;
    private String nazwisko;
    private String najwiekszySukces;

    public Sportowiec(String imie, String nazwisko, String najwiekszySukces)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.najwiekszySukces=najwiekszySukces;
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
        return najwiekszySukces;
    }

    public void ImieNazwisko()
    {
        System.out.println("Nazywam się "+this.getImie()+" "+this.getNazwisko());
    }

    public abstract void ZnajomoscJezykow();
    public abstract void LiczbaObserwujacych();
    protected abstract void NazwaSportu();
    protected abstract void Osiagniecia();
}
