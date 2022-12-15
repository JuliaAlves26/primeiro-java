public class ContaPoupança extends Conta {

    private Double rentabilidadeMensal;
    private Double calcularSaldo;

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public Double getCalcularSaldo() {
        return calcularSaldo;
    }

    public void setCalcularSaldo(Double calcularSaldo) {
        this.calcularSaldo = calcularSaldo;
    }

    public void setCliente(Cliente c6) {
    }
}
