package com.internousdev.template.dto;

public class BuyItemDTO {
	private int id;
	private String itemName;
	private String itemPrice; //テーブルカラムに対応したフィールド変数の宣言

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}
	public String getItemPrice(){
		return itemPrice; //フィールド変数に対応したGetterSetterを定義
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice=itemPrice;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
}
