public class Main {
    public static void main(String[] args) {
        int numeroIf = 5;
        int numeroWhile = 1;
        int estacion = 3;
        usoIf(numeroIf);

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("while "+ numeroWhile);
        }

        do{
            numeroWhile++;
            System.out.println("do While " + numeroWhile);
        }while (false);

        for(int numeroFor = 0 ; numeroFor <= 3 ; numeroFor++){
            System.out.println("For " + numeroFor);
        }

        usoCase(estacion);

    }

    public static void usoIf(int valor){
        if(valor > 0){
            System.out.println("El numero " + valor + " es Positivo");
        }
        if(valor == 0){
            System.out.println("El numero es " + valor);
        }
        if(valor < 0){
            System.out.println("El numero " + valor + " es Negativo");
        }
    }

    public static void usoCase(int valor){
        switch (valor){
            case 1:
                System.out.println("Otoño");
                break;
            case 2:
                System.out.println("Invierno");
                break;
            case 3:
                System.out.println("Primavera");
                break;
            case 4:
                System.out.println("Verano");
                break;
            default:
                System.out.println("Error numero no valido");
                break;
        }
    }
}
