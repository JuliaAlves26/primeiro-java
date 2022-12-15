

public abstract class Conta {

    private String numero;
    private Double depositar;
    private Double sacar;
    private Double valor;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getDepositar() {
        return depositar;
    }

    public void setDepositar(Double depositar) {
        this.depositar = depositar;
    }

    public Double getSacar() {
        return sacar;
    }

    public void setSacar(Double sacar) {
        Debito debito = new Debito();
        debito.setValor(valor);
        this.addDebito(debito);
    }

    private void addDebito(Debito debito) {
    }

    protected void depositar(Double valor) {
    }

    protected abstract void sacar(Double valor);

    protected abstract boolean saldo();
}

