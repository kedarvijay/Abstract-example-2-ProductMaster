package com.goods;

import com.bank.costomer;

public class prdcustomer extends ProductMaster {

	@Override
	public int saleOfProduct(int qty) {
		if(qty>getStock()) {
			System.out.println("Insufficient Stock >> "+getStock());
			return getStock();
		}
		else {
			setStock(getStock()-qty);
				return getStock();
			}
		}
	public static void main(String[] args) {
		prdcustomer cust = new prdcustomer();
		cust.registerProduct("product 1", 20,500);
		cust.viewProducts();
		System.out.println("After Sales Available Stock >> "+cust.saleOfProduct(200));
	}

}
