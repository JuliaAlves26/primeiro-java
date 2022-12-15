public class Executavel2 {

    public void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Ana");

        Endereço end1 = new Endereço();

        end1.setLogradouro("Rua santa helena");
        end1.setComplemento("terceiro andar");
        end1.setNumero("56");
        end1.setCidade("juiz de fora");
        end1.setUf("Mg");
        end1.setCep("36045789");

        Endereço end2 = new Endereço();

        end2.setLogradouro("Rua porto alegre");
        end2.setComplemento("segundo andar");
        end2.setNumero("06");
        end2.setCidade("Jacaraipe");
        end2.setUf("ES");
        end2.setCep("34538789");

        Endereço end3 = new Endereço();

        end3.setLogradouro("Rua cabo frio");
        end3.setComplemento("Apto 508");
        end3.setNumero("18");
        end3.setCidade("Rio de janeiro");
        end3.setUf("RJ");
        end3.setCep("12338456");

        System.out.println(end1);
        System.out.println(end2);
        System.out.println(end3);
    }
}

