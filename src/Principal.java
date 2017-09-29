import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BDSimulado bds = new BDSimulado();
		
		
	 ArrayList<Pessoa> pessoas = bds.getPessoa();
	 ArrayList<Empresa>  empresa = bds.getEmpresa();
	 ArrayList<Contato> contatar = bds.getContatar();
	 
	 
	 ArrayList<Pessoa> getRecuperarDados = bds.getRecuperarDados();
	 System.out.println(getRecuperarDados);
	}

}