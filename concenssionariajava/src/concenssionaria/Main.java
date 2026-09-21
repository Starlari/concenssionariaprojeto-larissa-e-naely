package concenssionaria;

public class Main {
    public static void main(String[] args) {
        Veiculos carro =new Veiculos();
        
        carro.modelo = "song pro flex";
        carro.marca = "BYD";
        carro.ano = 2027;
        carro.preco = 199990.00;

        System.out.println(carro.modelo);
        System.out.println(carro.marca);
        System.out.println(carro.ano);
        System.out.println(carro.preco);
    }
}