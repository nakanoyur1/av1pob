package av1POB;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
	
	private static Scanner scanner = new Scanner(System.in);
	private int id;
	private double valor;
	private String nome; 
	
	public Produto(int id, double valor, String nome) {
		
		this.id = id;
		this.valor = valor;
		this.nome = nome;
	}
	
	public Produto() {
		
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	
	

}
	
