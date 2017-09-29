
public class Empresa {
	
	private String nome;
	private String CNPJ;
	private String cidade;
	private String UF;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	

	
	public Empresa(String nome, String cNPJ, String cidade, String uF) {
		super();
		this.nome = nome;
		CNPJ = cNPJ;
		this.cidade = cidade;
		UF = uF;
	
	}
	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", CNPJ=" + CNPJ + ", cidade=" + cidade + ", UF=" + UF ;
	}
	
	

}
