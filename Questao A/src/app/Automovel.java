package app;

public class Automovel extends Veiculo {
    private int diametroRoda;

    public int getDiametroRoda() {
        return diametroRoda;
    }

    public void setDiametroRoda(int diametroRoda) {
        this.diametroRoda = diametroRoda;
    }

    public void abrirPortaMalas() {
        System.out.println("O porta malas do carro foi aberto");
    }

    @Override
    public void acelerar() {
        System.out.println("O automóvel acelerou");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.printf(
                "O automóvel %s, ano %d, produzido pela %s (%s) possui rodas com diâmetro de %d"
                        + " e possui capacidade para %d pessoas.\n",
                this.getNome(), this.getAnoFabricacao(), this.getFabricante().getNome(),
                this.getFabricante().getPaisDeOrigem(), this.getDiametroRoda(), this.getCapacidade()
        );
    }
}