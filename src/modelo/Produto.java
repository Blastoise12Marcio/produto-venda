package modelo;


public class Produto {
	
	private String name;
	private Integer quant;
	private Float valor;
	private Float Total;
	
	public Produto (String name, int quantidade, float valor) {
		this.name = name;
		this.quant = quantidade;
		this.valor = valor;
		this.Total = valor * quant;
	}
	
	public String toString() {
		return "Nome: " + name + "; Quant.: " + quant + "; Preço: "
				+ valor + "; Total: " + Total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
		this.Total = quant*valor;
	}
	public Float getValor() {
		return valor*quant;
	}
	public void setValor(Float valor) {
		this.valor = valor;
		this.Total = quant*valor;
	}
	public Float getvalorTotal() {
		return Total;
	}	
}



