public class MainListaDinamica {
    public static void main(String[] args) {
        ListaDinamica salaENSW = new ListaDinamica("Pedro");
        salaENSW.percorrerELementos();
        salaENSW.inserirElemento("Gustavo");
        salaENSW.inserirElemento("Marcos");
        salaENSW.inserirElemento("Victor");
        salaENSW.inserirElemento("Felipe");
        salaENSW.inserirElemento("Fabiano");
        salaENSW.inserirElemento("Adriano");
        salaENSW.inserirElemento("Arthur");
        System.out.println("=================");
        salaENSW.percorrerELementos();
        salaENSW.removerElemento("Pedro");
        System.out.println("=================");
        salaENSW.percorrerELementos();
        System.out.println("=================");
        salaENSW.buscarElemento("Marcos");
    }
}
