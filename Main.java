public class Main {
    public static void main(String[] args) {
        String modo = System.getenv("APP_MODE");
        if (modo == null) {
            modo = "sin definir (valor por defecto)";
        }
        System.out.println("APP_MODE = " + modo);
    }
}