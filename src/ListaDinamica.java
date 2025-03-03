public class ListaDinamica {
    private No primeiroElemento;

    public ListaDinamica(String conteudo) {
        primeiroElemento = new No(conteudo);
    }

    public void inserirElemento(String conteudo) {
        No no = new No(conteudo);

        // Encontrar o último elemento da lista dinâmica
        if (primeiroElemento.getProx() == null) {
            primeiroElemento.setProx(no);
        } else {
            No aux = primeiroElemento;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(no);
        }
    }

    public boolean estaVazia() {
        if (this.primeiroElemento == null) {
            return true;
        }
        return false;
    }

    public void percorrerELementos() {
        if(estaVazia()) {
            System.out.println("A lista se encontra vazia.");
        } else {
            No aux = this.primeiroElemento;
            while (aux.getProx() != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            System.out.println(aux.getConteudo());
        }
    }

    public void removerElemento(String conteudo) {
        // Remover o primeiro elemento
        while (this.primeiroElemento != null && this.primeiroElemento.getConteudo().equals(conteudo)) {
            this.primeiroElemento = this.primeiroElemento.getProx();
        }
        // Percorrer o resto da lista
        No aux = this.primeiroElemento;
        while (aux != null && aux.getProx() != null) {
            // Compara se o conteúdo do nó auxiliar é igual ao conteúdo passado
            if (aux.getProx().getConteudo().equals(conteudo)) {
                aux.setProx(aux.getProx().getProx()); // Caso verdadeiro remove o nó
            } else {
                aux = aux.getProx(); // Caso não, avança para o próximo nó
            }
        }
    }

    public boolean buscarElemento(String conteudo) {
        No aux = this.primeiroElemento;
        while (aux != null) { // Percorre a lista
            if (aux.getConteudo().equals(conteudo)) {
                System.out.println("O elemento " + aux.getConteudo() + " foi encontrado.");
                return true;
            }
            aux = aux.getProx(); // Avança para o próximo nó
        }
        System.out.println("Elemento não encontrado.");
        return false;
    }

}
