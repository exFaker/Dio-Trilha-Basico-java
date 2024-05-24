import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        int contador = 0, contador2 = 0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE 1 NUMERO");
        contador = scanner.nextInt();
        
        System.out.println("DIGITE OUTRO NUMERO");
        contador2 = scanner.nextInt();

            //for( int i = 0; i < 5 ; i++ ) {  }

        try {

            
            contar(contador, contador2);

            int  contar = contador - contador2;

            for (int i = 1; i < contar+1 ; i++) {

            System.out.println("contagem" + i );

            }

        } catch (Exception e) {
            
                System.out.println("errado " + e.getMessage());

        } finally {
            scanner.close();
        }

    }

    public static void contar(int contando1, int contando2) throws Exception {
    
        int contagem = contando1 - contando2;
        
        if (contagem < 0) {
            throw new Exception("A contagem ta com numero negativo");
    }

        System.out.println("subitração: " + contagem);

    }

}

