package concenssionaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner A = new Scanner(System.in);
        
        veiculos carro = new veiculos();

        System.out.println("Cadastro de veículos");
        System.out.print("Modelo: ");
        carro.modelo = A.nextLine();

        System.out.print("Marca: ");
        carro.marca = A.nextLine();

        System.out.print("Ano: ");
        carro.ano = A.nextInt();

        System.out.print("Preço: ");
        carro.preco = A.nextDouble();

        System.out.println();

        System.out.println("Veículo cadastrado!");

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Preço: " + carro.preco);

        A.close();
    }
}