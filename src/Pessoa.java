
import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private String sexo;
	private String cidade;
	private String UF;
	private Empresa empresa;
	private ArrayList<Contato> contatar;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
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
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public ArrayList<Contato> getContatar() {
		return contatar;
	}
	public void setContatar(ArrayList<Contato> contatar) {
		this.contatar = contatar;
	}
	public Pessoa(String nome, LocalDate dataNascimento, String sexo, String cidade, String uF, Empresa empresa) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cidade = cidade;
		UF = uF;
		this.empresa = empresa;
		this.contatar = new ArrayList<Contato>();

	}
	
	public void addContatoPessoa(Contato humano){
		contatar.add(humano);
		
		
		
		
		
		
		
		
		
		
		
	}
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", dataNascimento=" + getDataNascimentoComoString() + ", sexo=" + sexo + ", cidade=" + cidade
				+ ", UF=" + UF + "Empresa: " + empresa + "Contato: " + contatar + "\n";
	}
	
	
	public String getDataNascimentoComoString(){
		return dataNascimento.getDayOfMonth() + "/" +
				dataNascimento.getMonthValue() + "/" +
				dataNascimento.getYear();
	
	}
	
	
	

	}
