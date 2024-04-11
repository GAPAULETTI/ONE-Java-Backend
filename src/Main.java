public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String nombre = "Gastón";
        int edad = 39;
        double exp = 5.5;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y mi experiencia es %f puntos", nombre, edad,exp));

        //Celsius a Fahrenheit

        double temperaturaCelsius = 10.4;
        int convertirFh = (int) ((temperaturaCelsius * 1.8) + 32);
        System.out.println("La temperatura es: "+convertirFh);


    }
}