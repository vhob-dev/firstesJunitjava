package newtest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class primirotesteTest {
    public static void main(String[] args) {
        List<cliente> Clientes = new ArrayList<>();
        Clientes.add(new cliente("alucard", "M"));
        Clientes.add(new cliente("Chun li", "F"));
        Clientes.add(new cliente("Icaro", "M"));
        Clientes.add(new cliente("iasa", "F"));

        Scanner scanner = new Scanner(System.in);
        List<cliente> clientesl = new ArrayList<>();
        String entrada;
        while (true) {
            System.out.println("Digite um nome ou digite 'Sair' para encerrar");
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) ;
            break;

        }
        System.out.println("digite o sexo M para masculine ou F para Feminino:");
        String Sexo = scanner.nextLine();
        Clientes.add(new cliente(entrada, Sexo));

        List<cliente> nomesMulheres = Clientes.stream()
                .filter(cliente -> cliente.getGenero().equalsIgnoreCase("F"))
                .sorted(Comparator.comparing(cliente::getNome))
                .collect(Collectors.toList());
        System.out.println("Mulheres" + nomesMulheres);
         assertArrayEquals("F".getBytes(), Sexo.getBytes());

    }
}
