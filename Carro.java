
public class Carro {

    String marca;
    String modelo;
    int ano;

   
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
     
        Carro carro1 = new Carro("Toyota", "Corolla", 2022);
        Carro carro2 = new Carro("Honda", "Civic", 2021);

        carro1.exibirInformacoes();
        System.out.println("-------------------");
        carro2.exibirInformacoes();
    }
}
