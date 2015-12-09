import java.util.Scanner;
class Exercice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le resultat sur 20 d'Examen1:");
        float ex1 = sc.nextFloat();
        System.out.println("Veuillez saisir la ponderation (%) d'Examen1:");
        float ex1p = sc.nextFloat();
        System.out.println("Veuillez saisir le resultat sur 20 d'Examen2:");
        float ex2 = sc.nextFloat();
        System.out.println("Veuillez saisir la ponderation (%) d'Examen2:");
        float ex2p = sc.nextFloat();
        System.out.println("Veuillez saisir le resultat sur 20 d'Examen3:");
        float ex3 = sc.nextFloat();
        System.out.println("Veuillez saisir la ponderation (%) d'Examen3:");
        float ex3p = sc.nextFloat();
        float moyenne = (5*((ex1*(ex1p/100))+(ex2*(ex2p/100))+(ex3*(ex3p/100))));
        System.out.println("Note moyenne = " + moyenne + "%");
        
	}

}