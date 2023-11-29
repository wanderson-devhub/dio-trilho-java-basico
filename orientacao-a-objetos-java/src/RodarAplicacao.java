public class RodarAplicacao {
    public static void main(String[] args) {
        //Criação do objeto

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Renault Kwid Zen");
        carro1.setCapacidadeTanque(50);

        System.out.println(
                carro1.getCor() + "\n" +
                carro1.getModelo() + "\n" +
                carro1.totalValorTanque(5.2)
        );

        Carro carro2 = new Carro("Verde", "Fiat Mobi", 55);

        System.out.println(
                carro2.getCor() + "\n" +
                carro2.getModelo() + "\n" +
                carro2.totalValorTanque(4.55)
        );

    }

}
