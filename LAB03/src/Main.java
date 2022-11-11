import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        studenci();
        dodatnieIUjemne();
        ciag();
        losowanie();
        //palindrom();
    }

    public static void studenci() {
        System.out.println("Podaj liczbę studentów: ");
        int n = getInt();
        int i = 1;
        double punkty = 0;
        double sumaPunktow = 0;
        while (i <= n)
        {
            System.out.println("Podaj liczbę punktów dla studenta nr. " + i);
            punkty = getDouble();
            sumaPunktow = sumaPunktow+punkty;
            i++;
        }
        double srednia = sumaPunktow / n;
        System.out.println("Średnia liczba punktów w grupie wynosi "+srednia);
    }

    public static void dodatnieIUjemne()
    {
        System.out.println("Podaj 10 liczb - dodatnich lub ujemnych: ");
        int dodatnia=0;
        int ujemna=0;
        int sumadodatnich=0;
        int sumaujemnych=0;
        for (int i=0; i<=9; i++)
        {
            int liczba=getInt();
            if (liczba>=0)
            {
                dodatnia=dodatnia+1;
                sumadodatnich=sumadodatnich+liczba;
            }
            else
            {
                ujemna=ujemna+1;
                sumaujemnych=sumaujemnych+liczba;
            }
        }
        System.out.println("Wpisano "+dodatnia+" dodatnich liczb. Ich suma wynosi "+sumadodatnich);
        System.out.println("Wpisano "+ujemna+" ujemnych liczb. Ich suma wynosi "+sumaujemnych);
    }

    public static void ciag()
    {
        System.out.println("Podaj ilosc wyrazów ciągu n: ");
        int n=getInt();
        int sumaparzystych=0;
        for (int i=1; i<=n; i++)
        {
            if (i%2==0)
            {
                sumaparzystych=sumaparzystych+i;
            }
        }
        System.out.println("Suma liczb parzystych w tym ciągu wynosi "+sumaparzystych);
    }

    public static void losowanie()
    {
        System.out.println("Podaj ile liczb chcesz wylosować z przedziału (-10,45): ");
        int n=getInt();
        int sumaparzystych=0;
        for (int i=1; i<=n; i++)
        {
            Random rand = new Random();
            int a=rand.nextInt(56)-10;
            System.out.println("Wylosowana liczba: "+a);
            if (a%2==0)
            {
                sumaparzystych=sumaparzystych+i;
            }
        }
        System.out.println("Suma wylosowanych liczb parzystych wynosi "+sumaparzystych);
    }

    public static void palindrom()
    {
        System.out.println("Wpisz wyraz, by sprawdzić, czy jest on palindromem: ");
        System.out.println("Ile liter/cyfr ma twój wyraz?");
        int n = getInt();
        System.out.println("Podaj wyraz: ");
        String a=getString();
        int i=1;
        while (i<=n)
        {
            if (i==n)
        }

    }


    public static int getInt()
    {
        return new Scanner(System.in).nextInt();
    }

    public static String getString()
    {
        return new Scanner(System.in).next();
    }

    public static double getDouble()
    {
        return new Scanner(System.in).nextInt();
    }

}