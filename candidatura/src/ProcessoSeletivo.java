import java.util.concurrent.ThreadLocalRandom;

public static class ProcessoSeletivo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		case2();
		
	}
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }
	static void case2() {
		double salarioBase = 2000.0;
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		int totalSelecionados = 0;
		int proximoCandidato = 0; 
		while(totalSelecionados <5 && proximoCandidato < candidatos.length) {
			String candidato = candidatos[proximoCandidato++];
			double valorPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " está pedindo " + valorPretendido);
			if(valorPretendido > salarioBase) {
				System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
				
			}else {
				System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
				totalSelecionados++;
			}
			
		}
    }
		//System.out.println("Total de selecionados: " + totalSelecionados);
		//System.out.println("Total de consultados: " + proximoCandidato);
        //System.out.println("imprimindo a lista de candidatos informando o indice do elemento");
    static void imprimirSelecionados(){
            String[] candidatos;
            for(int indice = 0; indice < candidatos.length; indice++){
                 System.out.println("o candidato de nº" +(indice+1)+ " é o " + candidatos[indice]);
                }
            for(String candidato :  candidatos){
                 System.out.println("o candidato selecionado foi " + candidato);
                 }
    }
    
	}
	
	
	
