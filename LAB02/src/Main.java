import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        rownanie();
        wartoscFunkcji();
        porzadkowanie();
        transport();
        kupnoSamochodu(false,true);
        kalkulator();
    }

    public static void rownanie()
    {
        System.out.println("Podaj 3 dowolne liczby: ");
        double a=getDouble();
        double b=getDouble();
        double c=getDouble();
        System.out.println("Rozwiązuję równanie "+a+"x2+"+b+"x+"+c+"...");
        double b2, ac4;
        b2=Math.pow(b,2);
        ac4=4*a*c;
        double delta=b2-ac4;
        double x0,x1,x2;
        x0=-b/2*a;
        x1=(-b+Math.sqrt(delta))/2*a;
        x2=(-b-Math.sqrt(delta))/2*a;
        if (delta>0)        System.out.println("Rozwiązaniem tego równania są dwa miejsca zerowe: "+x1+" oraz "+x2);
        else if (delta==0)  System.out.println("Rozwiązaniem tego równania jest miejsce zerowe: "+x0);
        else                System.out.println("To równanie nie ma miejsc zerowych");
    }

    public static void wartoscFunkcji()
    {
        System.out.println("Podaj dowolna liczbe rzeczywistą, która będzie argumentem funkcji a, b i c: ");
        double x=getDouble();
        double a,b,c;
        if (x>0) a=2*x;
        else if (x==0) a=0;
        else a=-3*x;

        if (x>=1) b=Math.pow(x,2);
        else b=x;

        if (x>2) c=2+x;
        else if (x==2) c=8;
        else c=x-4;

        System.out.println("a("+x+")="+a+", b("+x+") ="+b+", c("+x+")= "+c);
    }

    public static void porzadkowanie()
    {
        System.out.println("Podaj trzy liczby: ");
        int a=getInt();
        int b=getInt();
        int c=getInt();
        int one = 0;
        int two = 0;
        int three = 0;
        if (a>b&&a>c&&b>c)
        {
            one=a;
            two=b;
            three=c;
        }
        else if (a>b&&a>c&&c>b)
        {
            one=a;
            two=c;
            three=b;
        }
        else if (b>a&&b>c&&a>c)
        {
            one=b;
            two=a;
            three=c;
        }
        else if (b>a&&b>c&&c>a)
        {
            one=b;
            two=c;
            three=a;
        }
        else if (c>a&&c>b&&a>b)
        {
            one=c;
            two=a;
            three=b;
        }
        else if (c>a&&c>b&&b>a)
        {
            one=c;
            two=b;
            three=c;
        }
        System.out.println(one+" "+two+" "+three);

    }

    public static void transport()
    {
        System.out.println("Czy pada deszcz? Jeśli tak wpisz true, jeśli nie false: ");
        boolean pada=getBoolean();
        System.out.println("Czy jest autobus? Jeśli tak wybierz true, jeśli nie false: ");
        boolean jestAutobus=getBoolean();
        if (pada&&jestAutobus) System.out.println("Weź parasol, dostaniesz się na uczelnie");
        else if (pada&&!jestAutobus) System.out.println("Nie dostaniesz się na uczelnie");
        else if (!pada&&jestAutobus) System.out.println("Dostaniesz się na uczelnie, miłego dnia i pięknej pogody");

    }

    public static void kupnoSamochodu(boolean znizka, boolean premia)
    {
        if (!znizka||premia) System.out.println("Możesz kupić samochód! Zniżki na samochód nie ma.");
        else if (!znizka||!premia) System.out.println("Zakup samochodu trzeba odłożyć na później... Zniżki na samochód nie ma.");
        else if (znizka||premia) System.out.println("Możesz kupić samochód! Jest zniżka.");
    }

    public static void kalkulator()
    {
        System.out.println("Wpisz dwie liczby: ");
        double a=getDouble();
        double b=getDouble();
        System.out.println("Wybierz działanie, które chcesz wykonać: ");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Reszta z dzielenia");
        int wybor=getInt();
        switch (wybor)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Nie ma takiej opcji w kalkulatorze!");
        }
    }



    public static int getInt()
    {
        return new Scanner(System.in).nextInt();
    }

    public static double getDouble()
    {
        return new Scanner(System.in).nextDouble();
    }

    public static boolean getBoolean()
    {
        return new Scanner(System.in).nextBoolean();
    }
}