import java.util.Scanner;

/**
 * 
 * @author Ramon Xavier Leal
 * @version 1.0.0
 * @category System de banco basic
 * 
 * @param nome  retorna nome do usuario
 * @param pin   retorna codigo cadastrado
 * @param valor retorna valor digitado pelo usuario
 * @param sacar retora valor sacado
 *              sistema de cadastro de banco basico com input de dinheiro e
 *              saque.
 */
public class Contaterminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String[] lines = {
                "#####      ###    ##   ##   #####    #####            ##   ##    ###    ##   ##   ######  #######  ######",
                "##   ##   ## ##   ###  ##  ##   ##  ##   ##           ##   ##   ## ##   ##   ##     ##    ##       ##   ##",
                "##   ##  ##   ##  #### ##  ##       ##   ##            #####   ##   ##  ##   ##     ##    ##       ##   ##",
                "######   ##   ##  ## ####  ##       ##   ##             ###    ##   ##  ##   ##     ##    #####    ##   ##",
                "##   ##  #######  ##  ###  ##       ##   ##            #####   #######  ##   ##     ##    ##       ######",
                "##   ##  ##   ##  ##   ##  ##   ##  ##   ##           ##   ##  ##   ##   ## ##      ##    ##       ##  ##",
                "#####    ##   ##  ##   ##   #####    #####            ##   ##  ##   ##    ###     ######  #######  ##   ##"
        };

        String nome;
        int pin = 0;
        float valor = 0, sacar = 0;

        for (String line : lines) {
            System.out.println(line);
        }
        
        System.out.println("\ndigite seu nome:");
        nome = scanner.next();

        System.out.println("\ndigite seu codigo: ");
        pin = scanner.nextInt();

        System.out.println("\ndigite seu saldo: ");
        valor = scanner.nextFloat();

        System.out.println("bem vindo - " + nome);
        System.out.println("seu saldo é de:" + valor);
        System.out.println("Usuario numero " + pin + " de pin\n");
        System.out.println("digite o valor que deseja sacar: ");
        if (sacar > valor) {
            System.out.println("\nvalor insuficiente para saque!\n");

        } else System.out.println("\no valor atual após o saque é de: " + (valor - sacar));
    }
}
