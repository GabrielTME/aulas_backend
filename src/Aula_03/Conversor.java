package Aula_03;

public class Conversor {

    public double converter(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public int converter(int horas, int minutos) {
        return (horas * 60) + minutos;
    }

    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        double fahrenheit = conversor.converter(25.0);
        System.out.println("25 graus Celsius em Fahrenheit: " + fahrenheit);

        int totalMinutos = conversor.converter(2, 30);
        System.out.println("2 h e 30 min em minutos: " + totalMinutos);
    }
}
