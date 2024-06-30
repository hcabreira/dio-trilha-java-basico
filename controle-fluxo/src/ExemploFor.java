public class ExemploFor {
    public static void main(String[] args) {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	    for (int x=0; x<alunos.length; x++) {
		    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]); 
	    }
        //Forma abreviada
        for(String alunoNovo : alunos){
            System.out.println("Nome do aluno é " + alunoNovo);
        }
	}
}
