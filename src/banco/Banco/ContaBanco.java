package banco.Banco;

public class ContaBanco {

public int numConta;
protected String tipo;
private boolean status;
private float saldo;
private String dono;
public int conta;

    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }


    public int getNumConta(){
    return this.numConta;}
    public void setNumConta(int num){
    this.numConta = num;}

    public String getTipo(){
    return tipo;}
    public void setTipo(String tipo){
    this.tipo = tipo;}

    public boolean getStatus(){
    return status;}
    public void setStatus(boolean status){
    this.status = status;}

    public float getSaldo(){
    return saldo;}
    public void setSaldo(float saldo){
    this.saldo = saldo;}


    public String getDono(){
    return dono;}
    public void setDono(String dono){
    this.dono = dono;}

    public int getConta(){
    return conta;}
    public void setConta(int conta){
    this.conta = conta;}

public void estadoAtual(){
    System.out.println("-------------------------");
    System.out.println("Conta: " + this.getNumConta());
    System.out.println("Dono: " + this.getDono());
    System.out.print("Tipo: ");
    if(this.getTipo() == "CC"){
        System.out.println("Conta Corrente");
    }
    else if(this.getTipo() == "CP"){
        System.out.println("Conta Poupança");
    }
    else{
        System.out.println("Sem informação");
    }
    System.out.println("Saldo: " + this.getSaldo());
    System.out.print("Status: ");
    if(this.getStatus()){
        System.out.println("Ativa");
    }
    else{
        System.out.println("Desativada");
    }

}

public void abrirConta(String t) {
    this.setTipo(t);
    this.status = true;
    if (t == "CC") {
        this.setConta(12);
        this.setSaldo(50);
    } else if (t == "CP") {
        this.setConta(20);
        this.setSaldo(150);
    }
    System.out.println("Conta aberta com sucesso! ");
}

public void fecharConta(){
    if(this.getSaldo() != 0){
        if(this.getSaldo() > 0)
        { System.out.println("Não é possível fechar a conta porque ainda tem saldo. ");
        }
        else
        { System.out.println("Não é possível fechar a conta porque ainda está em débito com o banco. ");
        }
    }
    else{
        this.setStatus(false);
        System.out.println("A conta foi fechada! ");
    }
}

public void depositar(float valor){
    if(this.getStatus()){
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Deposito realizado na conta de " + this.dono + "! ");
    }
    else{
        System.out.println("Depósito não foi realizado, porque a conta está desativada");
    }

}
public void sacar(float valor){
    if(this.getStatus()){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("O saque foi realizado na conta de " + this.getDono());
        }
        else{
            System.out.println("O saque não foi realizado por não ter saldo o suficiente! ");
        }
    }
    else{
        System.out.println("O saque não foi realizado, conta inativa! ");
    }
}
public void pagarMensal(String t){
    if(this.getStatus()){
        if(this.getTipo() == "CC"){
            if(this.getSaldo() >= getConta()){
                this.setSaldo(this.getSaldo() - conta);
                System.out.println("A mensalidade foi paga na conta de " + this.getDono() + "!");
            }
            else{
                System.out.println("Saldo insuficiente para realizar o pagamento mensal! ");
            }
        }
        else{
            if(this.getSaldo()>= getConta()){
                this.setSaldo(this.getSaldo() - conta);
                System.out.println("A mensalidade foi paga na conta de " + this.getDono() + "!");
            }
            else{
                System.out.println("Saldo insuficiente para realizar o pagamento mensal! ");
            }
        }
    }
    else{
        System.out.println("Não foi possivel realizar o pagamento mensal, porque a conta está desativada! ");
    }

}

}
