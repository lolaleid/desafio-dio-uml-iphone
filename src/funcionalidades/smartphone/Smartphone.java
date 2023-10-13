package funcionalidades.smartphone;

import funcionalidades.navegador.Navegador;
import funcionalidades.reprodutorMusical.ReprodutorMusical;
import funcionalidades.telefone.Telefone;

public class Smartphone implements Navegador, ReprodutorMusical, Telefone{



    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o número: "+numero);
    }

    @Override
    public boolean atender(int numero) {
        System.out.println("O número "+numero+"está ligando!");

        return false;
    }

    @Override
    public void iniciarCorreioVoz(boolean atendeu) {
        if(!atendeu){
            System.out.println("Grave sua mensagem!");
        }
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a musica: "+musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: "+musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: "+url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Página "+url+"adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }
  
    

}
