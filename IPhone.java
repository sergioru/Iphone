public class IPhone implements Navegador, Telefone, TocadorMusical{

       public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA PÁGINA");      
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");      
    }

        public void ligar() {
            System.out.println("FAZENDO LIGAÇÃO");       
    }

    public void atender() {
        System.out.println("ATENDENDO TELEFONE");       
    }

       public void IniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");      
    }

    public void tocar() {
        System.out.println("TOCANDO MUSICA");        
    }

       public void pausar() {
        System.out.println("PAUSANDO MUSICA");        
    }

        public void selecionarMusica() {
            System.out.println("SELECIONANDO MUSICA"); 
    }
    
}
