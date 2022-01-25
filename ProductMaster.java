package com.goods;

public abstract class ProductMaster {
	private String prdname;
	private int cost;
	private int stock;
	public void registerProduct(String prdname, int cost, int stock) {
		this.prdname=prdname;
		this.cost=cost;
		this.stock=stock;
		
	}
	public void viewProducts() {
		System.out.println("Product Name  >>  "+this.prdname);

		System.out.println("Total Stock  >>  "+this.stock);

		System.out.println("Total Cost >> "+this.cost);
		
	}
	public abstract int saleOfProduct(int qty);
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getPrdname() {
		return prdname;
	}
	public int getCost() {
		return cost;
	}

}
