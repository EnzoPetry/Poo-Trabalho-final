package app;

public class Barco extends Veiculo {
    private int numVelas;

    public int getNumVelas() {
        return numVelas;
    }

    public void setNumVelas(int numVelas) {
        this.numVelas = numVelas;
    }

    public void icarVelas() {
        System.out.println("O barco está com as velas içadas");
    }

    public void recolherVelas() {
        System.out.println("Velas recolhidas");
    }

    @Override
    public void acelerar() {
        System.out.println("O barco acelerou");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.printf("O barco %s, ano %d, produzido pela %s (%s) utiliza %d velas e possui capacidade para %d pessoas.\n",
                this.getNome(),this.getAnoFabricacao(),this.getFabricante().getNome(),this.getFabricante().getPaisDeOrigem(),
                this.getNumVelas(),this.getCapacidade());
    }
}
