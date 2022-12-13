import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        losowanie(); // zad 1
        coDrugi(); // zad 2
        tablicaStringow(); // zad 3
        odwroconeSlowa(); // zad 4
        sortowanie(); // zad 5
        silniaLiczb(); // zad 6
        dwieTablice(); // zad 7
    }

    public static void losowanie()
    {
        System.out.println("Podaj pierwszą i ostatnią liczbę przedziału, z którego program wylosuje 3 liczby");
        int a=getInt();
        int b=getInt();
        int[] tablica=new int[3];
        int suma = 0;
        double srednia = 0;
        for (int i=0; i<3; i++)
        {
            Random rand=new Random();
            int los = rand.nextInt(b - a + 1) + a;
            tablica[i]=los;
            suma = suma+tablica[i];
        }
        for (int x : tablica) System.out.println(x);
        srednia = suma/tablica.length;
        System.out.println("Suma wylosowanych liczb: "+suma);
        System.out.println("Średnia z wylosowanych liczb: "+srednia);
    }

    public static void sumaAndSrednia()
    {

    }

    public static void coDrugi()
    {
        int[] tab1 = {10,11,12,13,14,15};
        int[] tab2 = {16,17,18,19,20,21,22};
        int wys = 0;
        System.out.println("Liczby z pierwszej tablicy: ");
        for (int i=0; i<=tab1.length-1; i=i+2)
        {
            System.out.println(tab1[i]);
        }
        System.out.println("Liczby z drugiej tablicy: ");
        for (int i=0; i<=tab2.length-1; i=i+2)
        {
            System.out.println(tab2[i]);
        }


    }

    public static void tablicaStringow()
    {
        String litery[];
        litery = new String [] {"a","b","c","d","e"};
        for (int i = 0; i < litery.length; i++)
        {
            litery[i] = litery[i].toUpperCase();
        }
        for (String x : litery)
        {
            System.out.println(x);
        }
    }

    public static void odwroconeSlowa()
    {
        String tablica [];
        tablica = new String [5];
        System.out.println("Podaj pięć słów oddzielonych klawiszem 'Enter': ");
        for (int i=0; i<=4; i++)
        {
            tablica [i] = getString();
        }

        for (int i=tablica.length-1; i>=0; i--)
        {
            String str = tablica[i];
            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb);
        }
    }

    public static void sortowanie()
    {
        System.out.println("Podaj 8 losowych liczb:");
        int liczby[];
        int najwieksza = 0;
        int schowek = 0;
        liczby = new int [8];
        for (int i=0; i<liczby.length-1; i++)
        {
            liczby[i] = getInt();
        }
        int n = 0;
        while (n<liczby.length-1) {
            for (int i = 1; i < liczby.length - 1; i++)
            {
                {
                    if (liczby[i - 1] > liczby[i]) {
                        schowek = liczby[i];
                        liczby[i] = liczby[i - 1];
                        liczby[i - 1] = schowek;
                    }
                }
            }
            n++;
        }
        for (int x : liczby)
        {
            System.out.println(x);
        }
    }

    public static void silniaLiczb()
    {
        System.out.println("Podaj 5 losowych liczb:");
        int tablica[];
        tablica = new int[6];
        int n = 0;
        int silnia = 1;
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = getInt();
        }
        while (n < tablica.length) {
            silnia = 1;
            for (int i = 1; i <= tablica[n]; i++) {
                silnia = silnia * i;
            }
            System.out.println("Silnia liczby " + tablica[n] + " jest równa: " + silnia);
            n++;
        }
    }

    public static void dwieTablice()
    {
        String tab1 [];
        tab1 = new String [] {"jeden","dwa","trzy","cztery","piec","szesc"};
        String tab2 [];
        tab2 = new String [] {"jeden","dwa","trzy","cztery","piec","szesc"};

        for (int i=0; i<=tab1.length-1; i++)
        {
            if (tab1[i] == tab2[i])
            {
                System.out.println("Element nr. "+(i+1)+" w tablicy pierwszej jest taki sam element nr. "+(i+1)+" w tablicy drugiej");
            }
            else System.out.println("Element nr. "+(i+1)+" w tablicy pierwszej jest INNY niż element nr. "+(i+1)+ " w tablicy drugiej");
        }

    }

    public static String getString()
    {
        return new Scanner(System.in).nextLine();
    }
    public static int getInt()
    {
        return new Scanner(System.in).nextInt();
    }

    public static double getDouble()
    {
        return new Scanner(System.in).nextDouble();
    }
}