package funcionalidades.telefone;

public interface Telefone {
    
    public void ligar(int numero);
     
    public boolean atender(int numero);

    public void iniciarCorreioVoz(boolean atendeu);
}
