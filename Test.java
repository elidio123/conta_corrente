public class Test {
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
         
        conta.setSaldo(100);
        conta.deposita(1100);
        conta.saca(1500);       

        System.out.println("Saldo:"+conta.getSaldo());
        conta.limiteUtilizado();

        //System.out.println("Limite utilizado"+conta.getLimite());
        System.out.println("Limite Disponivel"+conta.getLimite());
        
        if(conta.getLimite()>0){
         System.out.println("Cheque especial");
    }
        else{
            System.out.println("No azul");
        }                  
    }
}
