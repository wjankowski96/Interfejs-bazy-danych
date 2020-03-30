package oop;

public class Aktor extends Artysta {
    public Aktor(String imie, String nazwisko, String dzielo)
    {
        super(imie, nazwisko, dzielo);
    }

    protected void DziedzinaSztuki()
    {
        System.out.println("Moja dziedzina sztuki to film");
    }

    protected void WazneDzielo()
    {
        System.out.println("Moje wazne dzielo to "+this.getDzielo());
    }
}
