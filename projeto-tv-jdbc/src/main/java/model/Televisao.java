package model;

public class Televisao {
    private String marca;
    private Long id;
    private String modelo;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long string) {
		this.id = string;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Televisao [marca=" + marca + ", id=" + id + ", modelo=" + modelo + "]";
	}
	public void setId(int i, int j) {
		// TODO Auto-generated method stub
		
	}
    
	
    
}
