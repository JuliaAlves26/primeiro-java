public class Executavel1 {

     private static Cargo func2;
    private static Cargo func1;

    public static void main(String[] args) {
         Cargo gerente  = new Cargo();
         gerente.setNome("Gerente");
         Cargo atendente  = new Cargo();
         gerente.setNome("Atendente");

         func1 = new Cargo(gerente);
         func2 = new Cargo(atendente);

         System.out.println(func1.getNome());
    }
}
