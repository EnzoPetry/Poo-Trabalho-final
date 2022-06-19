package app;

public class Aviao extends Veiculo {
    private int numTurbinas;

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }

    public void decolar() {
        System.out.println("O avião decolou");
    }

    public void pousar() {
        System.out.println("O avião pousou");
    }

    @Override
    public void acelerar() {
        System.out.println("O avião acelerou");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.printf(
                "O avião %s, ano %d, produzido pela %s (%s) utiliza %d turbinas"
                        + " e possui capacidade para %d pessoas.\n",
                this.getNome(), this.getAnoFabricacao(), this.getFabricante().getNome(),
                this.getFabricante().getPaisDeOrigem(), this.getNumTurbinas(), this.getCapacidade()
        );
    }
}
