//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 62; // масса тела, кг
        double h = 1.72; // рост, м
        int bmi = service.calculate(m, h); // ИМТ
        System.out.println(( m) +" масса тела, кг");
        System.out.println((h) +"рост, м");
        System.out.println((bmi) + "ИМТ");

    }
}