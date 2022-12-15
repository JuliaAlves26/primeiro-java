import com.sun.jdi.DoubleValue;

public class ContaCorrente  extends Conta {

    private Double limite;
    private Double calcularSaldo;

    public DoubleValue transferir(Conta contaDestino) {

        return null;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void transferir(Conta conta, Double valor) {
        if (this.saldo() > valor) {
            System.out.println("Sem saldo");

        } else {
            this.sacar(valor);
            conta.depositar(valor);
        }
    }

    public void setCliente(Cliente c1) {
    }
}