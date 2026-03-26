public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Anzahl Buttons: " + Button.getAnzahlButtons());
        System.out.println("-------------------");
        Button button1 = new Button();
        System.out.println("-------------------");
        Button button2 = new Button(100, 100);
        System.out.println("-------------------");
        Button button3 = new Button(0, 0, 100, 100);
        System.out.println("-------------------");
        System.out.println("Anzahl Buttons: " + button3.getAnzahlButtons());
    }
}
