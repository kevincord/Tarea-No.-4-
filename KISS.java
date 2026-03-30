public class KISS {
    public static void main(String[] args) {
        int numero = 10;
        
        if(numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
public class KISS {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println(numero % 2 == 0 ? "Es par" : "Es impar");
    }
}