public class TestaMetodo {
    public static void main(String[] args) {
           Conta contaRenata = new Conta();
           contaRenata.saldo = 100;
           contaRenata.deposita(50);
           contaRenata.saca(50);
        System.out.println(contaRenata.saldo);

        Conta contaDaMaria = new Conta();
        contaDaMaria.saldo = 1000;
        contaDaMaria.transfere(2000, contaRenata);
        System.out.println(contaDaMaria.saldo);


    }
}
