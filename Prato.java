
public class Prato {
	private int cod;
	private String nome;
	private double preco;
	private Prato prox;
	public Prato(int cod,String n,double p) {
		this.cod = cod;
		nome = n;
		preco = p;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double  getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public Prato getProx() {
		return prox;
	}
	public void setProx(Prato prox) {
		this.prox = prox;
	}

}
