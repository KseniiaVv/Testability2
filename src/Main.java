//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 62; // масса тела, кг
        double growth = 1.72; // рост, м
        int bmi = service.calculate(weight, growth); // ИМТ
        System.out.println(( weight) +" масса тела, кг");
        System.out.println((growth) +"рост, м");
        System.out.println((bmi) + "ИМТ");

    }
}