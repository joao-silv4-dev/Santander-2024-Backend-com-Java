public class Conta{
  private int numero;
  private String agencia;
  private String nomeCliente;
  private double saldo;

  //getter e setters
  public void setNumero(int numeroI){
    this.numero = numeroI;
  }
  public int getNumero(){
    return numero;
  }


  public void setAgencia(String agenciaI){
    this.agencia = agenciaI;
  }
  public String getAgencia(){
    return agencia;
  }


  public void setNomeCliente(String nomeClienteI){
    this.nomeCliente = nomeClienteI;
  }
  public String getNomeCliente(){
    return nomeCliente;
  }


  public void setSaldo(double saldoI){
    this.saldo = saldoI;
  }
  public double getSaldo(){
    return saldo;
  }
}
