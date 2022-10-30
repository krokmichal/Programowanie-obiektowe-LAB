import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Wiek());
        System.out.println(Imie());
        Obliczenia();
        System.out.println(czyParzysta(17));
        System.out.println(CzyPodzielna(15));
        System.out.println(Szescian(3));
        System.out.println(Pierwiastek(4));
        System.out.println(trojkat());
    }

    public static int Wiek()
    {
        return 25;
    }

    public static String Imie()
    {
        return "Michal";
    }

    public static void Obliczenia()
    {
        System.out.println("Podaj dwie liczby: ");
        int a=getInt();
        int b=getInt();

        System.out.println("Suma: "+(a+b));
        System.out.println("Roznica: "+(a-b));
        System.out.println("Iloczyn: "+(a*b));
    }

    public static int getInt()
    {
        return new Scanner(System.in).nextInt();
    }

    public static boolean czyParzysta(int c)
    {
        System.out.println("Czy liczba "+c+" jest parzysta?");
        if (c%2==0)
            return true;
        else
            return false;
    }

    public static boolean CzyPodzielna(int d)
    {
        System.out.println("Czy liczba "+d+" jest podzielna przez 3 i 5?");
        if (d%3==0&&d%5==0)
            return true;
        else
            return false;
    }

    public static double Szescian(double e)
    {
        System.out.println("Liczba "+e+" do potęgi 3 wynosi: ");
        return Math.pow(e,3);
    }

    public static double Pierwiastek(double f)
    {
        System.out.println("Pierwiastek z "+f+" wynosi: ");
        double sqrt;
        sqrt = Math.sqrt(f);
        return sqrt;
    }

    public static boolean trojkat()
    {
        System.out.println("Podaj początek i koniec przedziału, z jakiego wylosuje liczby i sprawdzę czy da się z nich zbudować trójkąt. Program zwróci ''true'' jeśli można zbudować trójkąt ");
        int a=getInt();
        int b=getInt();
        Random rand = new Random();
        int x = rand.nextInt(b - a + 1) + a;
        int y = rand.nextInt(b - a + 1) + a;
        int z = rand.nextInt(b - a + 1) + a;
        System.out.println("Wylosowane liczby to :"+x+", "+y+" oraz "+z+". Czy da się z nich zbudować trójkąt?");
        if (x+y>z&&x+z>y&&z+y>x)
            return true;
        else return false;


    }
}