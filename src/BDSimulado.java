import java.time.LocalDate;
import java.util.ArrayList;

public class BDSimulado {

	
	private ArrayList<Pessoa> pessoa;
	private ArrayList<Empresa> empresa;
	private ArrayList<Contato> contatar;
	
	public BDSimulado (){
		
		
		this.pessoa= new ArrayList<Pessoa>();
		this.empresa = new ArrayList<Empresa>();
		this.contatar = new ArrayList<Contato>();
		
		
		
		Empresa e1 = new Empresa("Kampeão", "38060430000171", "Brasilia", "DF");
		Empresa e2 = new Empresa("Takao", "38060430000252", "Uberlandia", "MG");
		Empresa e3 = new Empresa("Extra", "45648770001523", "Rio de Janeiro", "RJ");
		
		this.empresa.add(e1);
		this.empresa.add(e2);
		this.empresa.add(e3);
		
		
		Pessoa p1 = new Pessoa("Alberto", LocalDate.of(1993, 7, 25), "M", "Brasilia", "DF", e1);
		Pessoa p2 = new Pessoa("Tâmara", LocalDate.of(1992, 8, 10), "F", "Três Corações", "MG", e2);
		Pessoa p3 = new Pessoa("Amanda", LocalDate.of(1995, 6, 10), "F", "Búzios", "RJ", e3);
		Pessoa p4 = new Pessoa("Maria Donizete", LocalDate.of(1880, 9, 25), "F", "Montes Claros", "MG", e2);
		Pessoa p5 = new Pessoa("Newton Carlos", LocalDate.of(1880, 2, 22), "M", "Marabá", "PA", e1);
		Pessoa p6 = new Pessoa("Diogo Alan", LocalDate.of(1990, 10, 1), "M", "Uberlândia", "MG", e2);
		Pessoa p7 = new Pessoa("Gabriel Gago", LocalDate.of(1998, 12, 18), "M", "Brasilia", "DF", e1);
		Pessoa p8 = new Pessoa("Wanderson Carvalho", LocalDate.of(1995, 5, 28), "M", "Plabaltina", "GO", e1);
		Pessoa p9 = new Pessoa("Erica", LocalDate.of(2000, 2, 29), "F", "Planaltina", "GO",e1);
		Pessoa p10 = new Pessoa("Gustavo Souza", LocalDate.of(2001, 5, 10), "M", "Gama", "DF",e1);
			
		
	Contato c11 = new Contato("Email", "Alberto.neto@kampeao.com.br");
	Contato c12 = new Contato("Celular", "9565-8965");
	Contato c13 = new Contato("Fixo", "4585-6585");
	
	p1.addContatoPessoa(c11);
	p1.addContatoPessoa(c12);
	p1.addContatoPessoa(c13);
	
	Contato c21 = new Contato("Email", "tamara.jacqueline@hotmail.com");
	Contato c22 = new Contato("Celular", "94565-9852");
	Contato c23 = new Contato("Fixo", "5465-8956");
	
	p2.addContatoPessoa(c21);
	p2.addContatoPessoa(c22);
	p2.addContatoPessoa(c23);
	
	Contato c31 = new Contato("Email", "Amanda.leticia@hotmai.com");
	Contato c32 = new Contato("Fixo", "5465-8525" );
	
	p3.addContatoPessoa(c31);
	p3.addContatoPessoa(c32);
	
	Contato c41 = new Contato("Celular", "98525-4565");
	
	p4.addContatoPessoa(c41);
	
	Contato c51 = new Contato("Email", "newton.carlos@hotmail.com.br");
	
	p5.addContatoPessoa(c51);
	
	Contato c61 = new Contato("Celular", "94565-9852");
	
	p6.addContatoPessoa(c61);
	
	Contato c71 = new Contato("Email", "Gabriel.gago@gmail.com");
	Contato c72 = new Contato("Celular", "95236-9895");
	Contato c73 = new Contato("Fixo", "4525-5696");
	
	p7.addContatoPessoa(c71);
	p7.addContatoPessoa(c72);
	p7.addContatoPessoa(c73);
	
	Contato c81 = new Contato("Fixo", "4525-5696");
	Contato c82 = new Contato("Celular", "98525-8565");
	
	p8.addContatoPessoa(c81);
	p8.addContatoPessoa(c82);
	
	Contato c91 = new Contato("Email", "Erica.souza@yahoo.com");
	Contato c92 = new Contato("Celular", "98565-6598");
	
	p9.addContatoPessoa(c91);
	p9.addContatoPessoa(c92);
	
	Contato c100 = new Contato("Email", "Gustavo.souza@gmail.com.br");
		
	p10.addContatoPessoa(c100);

	
		
		this.pessoa.add(p1);
		this.pessoa.add(p2);
		this.pessoa.add(p3);
		this.pessoa.add(p4);
		this.pessoa.add(p5);
		this.pessoa.add(p6);
		this.pessoa.add(p7);
		this.pessoa.add(p8);
		this.pessoa.add(p9);
		this.pessoa.add(p10);
		

				
	}

	public ArrayList<Pessoa> getPessoa() {
		return pessoa;
	}

	public ArrayList<Empresa> getEmpresa() {
		return empresa;
	}


	public ArrayList<Contato> getContatar() {
		return contatar;
	}
	
	public ArrayList<Pessoa> getRecuperarDados(){
		ArrayList<Pessoa> resultado = new ArrayList<Pessoa>();
		
		for (int i = 0; i < this.pessoa.size(); i++) {
			resultado.add(this.pessoa.get(i));
			
		}
		return resultado;
		
	}
	

	
	
	
	


	
	
	
	
}