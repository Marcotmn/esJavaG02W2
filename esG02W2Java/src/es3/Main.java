package es3;

public class Main {

	public static void main(String[] args) {
		RubricaTelefonica rubrica = new RubricaTelefonica();

        
        rubrica.inserisciContatto("Mario Rossi", "3279547394");
        rubrica.inserisciContatto("Luigi Verdi", "32894172492");
        rubrica.inserisciContatto("Giovanna Bianchi", "3290348293");

        System.out.println("Contatti nella rubrica:");
        rubrica.stampaRubrica();

        System.out.println("Numero di telefono di Mario Rossi: " + rubrica.ricercaNumeroTelefono("Mario Rossi"));
        System.out.println("Nome associato al numero di telefono 32894172492: " + rubrica.ricercaNome("32894172492"));

        rubrica.cancellaContatto("Luigi Verdi");

        System.out.println("Contatti dopo la cancellazione:");
        rubrica.stampaRubrica();
    }

}
