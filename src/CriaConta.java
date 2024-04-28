public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        System.out.println("-----------------------------------");

        //+= pegue os 200 e add 100 ( =200 que e o saldo qe defini na com o + adiciona o valor atribuido
        primeiraConta.saldo += 100;
        System.out.println("saldo atualizado; " + primeiraConta.saldo);
        System.out.println("%%%%%%%%%");

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem; " + primeiraConta.saldo );
        System.out.println("segunda conta tem; " + segundaConta.saldo);



    }
}
