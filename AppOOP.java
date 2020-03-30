package oop;

import java.util.ArrayList;
import java.util.List;

public class AppOOP
{
    static void printInformacjeArtysta(Artysta element)
    {
        element.ImieNazwisko();
        element.DziedzinaSztuki();
        element.WazneDzielo();
    }

    static void printInformacjeSportowiec(Sportowiec element) 
    {
        element.ImieNazwisko();
        element.NazwaSportu();
        element.Osiagniecia();
    }

    private static void printInformacjeNaukowcy(Naukowiec element) 
    {
        element.ImieNazwisko();
        element.NazwaDyscyplinyNaukowej();
        element.ZdobyteOsiagniecie();
    }

    private static void printInformacjeInstagram(IInstagramer element) 
    {
        element.LiczbaObserwujacych();
    }
    
    private static void printInformacjePoligloci(IPoliglota element) {
        element.ZnajomoscJezykow();
    }

    public static void main(String[] args) {
        List<Artysta> artysci = new ArrayList<Artysta>();
            artysci.add(new Piosenkarz("Phil","Collins","In the air tonight")); 
            artysci.add(new Aktor("Al","Pacino","Ojciec chrzestny")); 
            artysci.add(new Piosenkarz("Freddy","Mercury","The Show Must Go On")); 
            artysci.add(new Pisarka("J.K.","Rowling","Harry Potter"));

        List<Sportowiec> sportowcy = new ArrayList<Sportowiec>();
            sportowcy.add(new Pilkarz("Robert","Lewandowski","Mistrzostwo Niemiec"));
            sportowcy.add(new Skoczek("Kamil","Stoch","Mistrzostwo Olimpijskie"));
            sportowcy.add(new Lekkoatletka("Anita","Wlodarczyk","Mistrzostwo Olimpijskie"));

        List<Naukowiec> naukowcy = new ArrayList<Naukowiec>();
            naukowcy.add(new Matematyk("Stanislaw","Ulam","Metody numeryczne"));
            naukowcy.add(new Elektrotechnik("Nikola","Tesla","Silnik indukcyjny"));
        
        List<IInstagramer> instagramerzy = new ArrayList<IInstagramer>();
            instagramerzy.add(new Piosenkarz("Phil", "Collins", "In the air tonight", 398000));
            instagramerzy.add(new Pilkarz("Robert", "Lewandowski", "Mistrzostwo Niemiec", 16800000));
            instagramerzy.add(new Skoczek("Kamil","Stoch","Mistrzostwo Olimpijskie", 320000));
            instagramerzy.add(new Lekkoatletka("Anita","Wlodarczyk","Mistrzostwo Olimpijskie",30100));

        List<IPoliglota> poligloci = new ArrayList<IPoliglota>();
        poligloci.add(new Pilkarz("Robert","Lewandowski","Mistrzostwo Niemiec","polski, niemiecki"));
        poligloci.add(new Matematyk("Stanislaw","Ulam","Metody numeryczne","polski, angielski, niemiecki"));
        poligloci.add(new Elektrotechnik("Nikola","Tesla","Silnik indukcyjny","serbski, chorwacki, niemiecki, angielski"));
        
       
    for (Artysta element : artysci)
    {
        printInformacjeArtysta(element);
    }

    for (Sportowiec element : sportowcy)
    {
        printInformacjeSportowiec(element);
    }

    for (Naukowiec element : naukowcy)
    {
        printInformacjeNaukowcy(element);
    }

    for (IInstagramer element : instagramerzy)
    {
        printInformacjeInstagram(element);
    }

    for (IPoliglota element : poligloci)
    {
        printInformacjePoligloci(element);
    }

    }

    
    
    
}