package com.kyly.demoproductlist;

public class ProductsDTO {

	public static final ProductsDTO NULL_VALUE = new ProductsDTO(-1l, "", "", "", "", "", "", "");

	private final Long id;
	private final String produtoId;
	private final String produto;
	private final String descProduto;
	private final String cor;
	private final String descCor;
	private final String tamanho;
	private final String descTamanho;
	
	public ProductsDTO(Long id, String produtoId, String produto, String descProduto, String cor, String descCor, String tamanho, String descTamanho) {
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
	
	public static ProductsDTO getNullValue() {
		return NULL_VALUE;
	}

	public Long getId() {
		return id;
	}

	public String getProdutoId() {
		return produtoId;
	}



	public String getProduto() {
		return produto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public String getCor() {
		return cor;
	}

	public String getDescCor() {
		return descCor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public String getDescTamanho() {
		return descTamanho;
	}
	
}
