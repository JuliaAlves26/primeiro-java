import java.util.ArrayList;
public class Cliente extends Pessoa {

    private Boolean vip;

    private Endereço end;

    private Conta con;

    private Collection<Endereço> listaEndereço = new ArrayList<>("");

    public Cliente() {
        super();
    }

    public String listarEnderecos() {
        return null;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Endereço getEnd() {
        return end;
    }

    public void setEnd(Endereço end) {
        this.end = end;
    }

    public Conta getCon() {
        return con;
    }

    public void setCon(Conta con) {
        this.con = con;
    }

}
