public class Main {

    public static void main(String[] args) {

        Cliente joao = new Cliente("Joao", "12345678911");
        Cliente maria = new Cliente("Maria", "12345678922");

        Conta cc = new ContaCorrente(joao);

        cc.depositar(100);

        Conta cp = new ContaPoupanca(maria);

        cc.transferir(80, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }

    //TODO incluir novas classes, atributos e métodos


}
