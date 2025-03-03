public class No {
    private String conteudo;
    private No prox;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
    }

    // Conceito de ponteiro = criar uma tipo de variável igual a classe exemplo o No

    // Getters e Setters são métodos de encapsulamento
    // Getters capturam o elemento
    // Setters modificam o elemento

    public String getConteudo() {
        return conteudo;
    }

    public No getProx() {
        return prox;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
