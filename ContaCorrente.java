public class ContaCorrente{
    //numero saldo extrato
    private int numero;
    private double saldo;
    private boolean status;
    //status true estou no cheque especial
    //status false esatou no azul
    private double limite=2000;

    public void saca(double valor){
        if(valor > saldo && limite <= 2000){
            status=true;
            saldo=saldo-valor;
            limite=limite+saldo;
            
        }
        else{
            status=false;
            saldo=saldo-valor;
        }
        
    
    }
    
    public void deposita(double valor){
        saldo+=valor;
        //saldo=saldo+valor
    }
    public int getNumero() {
        return numero;
    }
   public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
 public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void limiteUtilizado(){
        if(limite !=2000){
            double utilizado;
            utilizado = getLimite()-2000;
            System.out.println("Limite utilizado"+utilizado);
        }
    }
    
}