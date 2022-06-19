package app;

public class Main {
    public static void main(String[] args) {
        // --------------- Aviões ---------------
        Fabricante fabricante1 = new Fabricante();
        fabricante1.setNome("Boeing");
        fabricante1.setPaisDeOrigem("Estados Unidos");

        Fabricante fabricante2 = new Fabricante();
        fabricante2.setNome("Embraer");
        fabricante2.setPaisDeOrigem("Brasil");

        Aviao aviao1 = new Aviao();
        aviao1.setNome("737-Max");
        aviao1.setNumTurbinas(24);
        aviao1.setAnoFabricacao(2017);
        aviao1.setCapacidade(200);
        aviao1.setFabricante(fabricante1);

        aviao1.decolar();
        aviao1.acelerar();
        aviao1.pousar();
        aviao1.mostrarDetalhes();

        Aviao aviao2 = new Aviao();
        aviao2.setNome("E195-E2");
        aviao2.setNumTurbinas(18);
        aviao2.setAnoFabricacao(2017);
        aviao2.setCapacidade(150);
        aviao2.setFabricante(fabricante2);

        aviao2.decolar();
        aviao2.acelerar();
        aviao2.pousar();
        aviao2.mostrarDetalhes();

        // --------------- Automóveis ---------------
        Fabricante fabricante3 = new Fabricante();
        fabricante3.setNome("Ford");
        fabricante3.setPaisDeOrigem("Estados Unidos");

        Fabricante fabricante4 = new Fabricante();
        fabricante4.setNome("Volkswagen");
        fabricante4.setPaisDeOrigem("Alemanha");

        Automovel automovel1 = new Automovel();
        automovel1.setNome("Mustang GT");
        automovel1.setDiametroRoda(45);
        automovel1.setAnoFabricacao(2022);
        automovel1.setCapacidade(5);
        automovel1.setFabricante(fabricante3);

        automovel1.acelerar();
        automovel1.abrirPortaMalas();
        automovel1.mostrarDetalhes();

        Automovel automovel2 = new Automovel();
        automovel2.setNome("Gol");
        automovel2.setDiametroRoda(40);
        automovel2.setAnoFabricacao(1999);
        automovel2.setCapacidade(5);
        automovel2.setFabricante(fabricante4);

        automovel2.acelerar();
        automovel2.abrirPortaMalas();
        automovel2.mostrarDetalhes();

        // --------------- Barco ---------------
        Fabricante fabricante5 = new Fabricante();
        fabricante5.setNome("MiniCat");
        fabricante5.setPaisDeOrigem("Republica Tcheca");

        Fabricante fabricante6 = new Fabricante();
        fabricante6.setNome("Tiwal");
        fabricante6.setPaisDeOrigem("França");

        Barco barco1 = new Barco();
        barco1.setNome("310");
        barco1.setNumVelas(1);
        barco1.setAnoFabricacao(2013);
        barco1.setCapacidade(1);
        barco1.setFabricante(fabricante5);

        barco1.icarVelas();
        barco1.acelerar();
        barco1.recolherVelas();
        barco1.mostrarDetalhes();

        Barco barco2 = new Barco();
        barco2.setNome("Tiwal 3");
        barco2.setNumVelas(2);
        barco2.setAnoFabricacao(2015);
        barco2.setCapacidade(2);
        barco2.setFabricante(fabricante6);

        barco2.icarVelas();
        barco2.acelerar();
        barco2.recolherVelas();
        barco2.mostrarDetalhes();

    }
}
