import de.thi.nestler.sport.Person;
import de.thi.nestler.sport.Sportart;

//import de.thi.nestler.uni.Kurs;
//import de.thi.nestler.uni.Person;

public class App {
    public static void main(String[] args) throws Exception {
        // methodenaufrufe();
        // >>

        Sportart fussball = new Sportart();

        // Instanzvariable name ist protected und ist daher aus
        // der Klasse App nicht direkt zugreifbar (anderes Paket)

        // fussball.name = "Fussball";
        fussball.istMannschaftssport = true;

        Person person = new Person("Max", fussball);

        de.thi.nestler.uni.Kurs kurs = new de.thi.nestler.uni.Kurs();
        de.thi.nestler.uni.Person person2 = new de.thi.nestler.uni.Person(12345, kurs);

    }

    public static void methodenaufrufe() {
        // test();
        // >>
        // test2();

        // Die Methode ausgeben führt zu einer Konsolenausgabe
        int i = 10;
        ausgeben(i);

        // Die Methode zurueckgeben liefert einen Wert zurück, der in diesem Fall in der
        // Variable j gespeichert wird
        int j = 10;
        j = zurueckgeben(j);
        j = j + 5;
        // ...

        // Ausgaben sind dennoch möglich
        System.out.println(zurueckgeben(j));
    }

    public static void ausgeben(int i) {
        System.out.println(i * i);
    }

    public static int zurueckgeben(int i) {
        return i * i;
    }

    public static void test() {
        System.out.println("Test1");
    }

    public static void test2() {
        System.out.println("Test2");
        test3();
    }

    public static void test3() {
        test4();
        // >>
        System.out.println("Test3");
    }

    public static void test4() {
        System.out.println("Test4");
        test5();
    }

    public static void test5() {
        System.out.println("Test5");
    }
}
