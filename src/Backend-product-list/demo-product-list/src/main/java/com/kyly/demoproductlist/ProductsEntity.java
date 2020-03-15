package com.kyly.demoproductlist;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
(name = "tb_product")
public class ProductsEntity {
	
	@Column
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String produtoId;
	@Column
	private String produto;
	@Column
	private String descProduto;
	@Column
	private String cor;
	@Column
	private String descCor;
	@Column
	private String tamanho;
	@Column
	private String descTamanho;
	
	public ProductsEntity(Long id, String produtoId, String produto, String descProduto, String cor, String descCor, String tamanho, String descTamanho) {
		super();
		this.id = id;
		this.produtoId = produtoId;
		this.produto = produto;
		this.descProduto = descProduto;
		this.cor = cor;
		this.descCor = descCor;
		this.tamanho = tamanho;
		this.descTamanho = descTamanho;
	}
	
	public ProductsEntity() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(String produtoId) {
		this.produtoId = produtoId;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDescCor() {
		return descCor;
	}

	public void setDescCor(String descCor) {
		this.descCor = descCor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getDescTamanho() {
		return descTamanho;
	}

	public void setDescTamanho(String descTamanho) {
		this.descTamanho = descTamanho;
	}
	
}
