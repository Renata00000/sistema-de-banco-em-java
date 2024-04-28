public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor){
   this.saldo = this.saldo + valor;
    }
     public boolean saca(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("saldo realizado com sucesso");
            return true;
        }else {
            System.out.println("saldo insuficiente");
            return false;
        }
     }


public boolean transfere(double valor ,Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            //estou usando o metodo de deposita dentro deste outro metodo
            destino.deposita(valor);
            System.out.println("transferencia realizado com sucesso");
            return true;
        }else {
            System.out.println("transferencia falhou");
            return false;
        }
}

}