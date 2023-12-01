package com.implicita.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.implicita.model.Produto;

@ManagedBean
@SessionScoped
public class ProdutoBean {
	private List<Produto> listaProduto;
	private Produto produto;
	
	public ProdutoBean() {
		this.listaProduto=new ArrayList<Produto>();
		this.produto=new Produto();
		
	}
	
	public String obterAjuda() {
		if(this.listaProduto.isEmpty()) {
			return "AjudaGestaoProduto?faces-redirect=true";
		}else {
			return "AjudaGestaoProdutoTelefone?redirect=true";
		}
	}
	
	public void incluir() {
		listaProduto.add(produto);
		
		produto=new Produto();
	}
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	
	
}
