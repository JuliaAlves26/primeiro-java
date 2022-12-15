public class Executavel4 {

    Cliente c5 = new Cliente(); {

        c5.setNome("Julia");
        c5.setCpf("25668978825");

        ContaCorrente contCorren1 = new ContaCorrente();

        contCorren1.setNumero("123");
        contCorren1.setCliente(c5);
        contCorren1.setLimite(100.00);


        contCorren1.depositar(100.0);

        Cliente c6 = new Cliente();
        c6.setNome("Luan");
        c6.setCpf("25494889226");

        ContaPoupança contPoup = new ContaPoupança();

        contPoup.setNumero("560");
        contPoup.setCliente(c6);
        contPoup.setRentabilidadeMensal(30.0);


        contPoup.depositar(100.0);

        contCorren1.transferir((Conta) contPoup, 100.0);

        System.out.println(contPoup.saldocontCorren1());
        System.out.println(contCorren1.saldocontPoup());
    }
}
