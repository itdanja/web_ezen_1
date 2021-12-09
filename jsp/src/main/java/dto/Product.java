package dto;

import java.text.DecimalFormat;

public class Product {
	
	private int p_num;
	private String p_name ;
	private int  p_price ;
	private String p_category ;
	private String p_manufacturer;
	private int  p_active;
	private String p_size ;
	private int p_stock;
	private String p_img;
	private String p_contents ;
	private String  p_date;
	
	public String getprice( ) { // 천단위 쉼표 메소드
		DecimalFormat decimalFormat = new DecimalFormat("###,###");	// DecimalFormat : 숫자형식
		return decimalFormat.format(this.p_price);
	}
	public String getactive( ) { // 상태 문자형 변환 메소드
		if( this.p_active == 1 ) { return "준비중";}
		if( this.p_active == 2 ) { return "판매중";}
		if( this.p_active == 3 ) { return "품절";}
		if( this.p_active == 4 ) { return "인기상품";}
		return null;
	}
	// 1. 빈생성자 2.풀생성자 3.등록생성자
	public Product() {}

	public Product(int p_num, String p_name, int p_price, String p_category, String p_manufacturer, int p_active,
			String p_size, int p_stock, String p_img, String p_contents, String p_date) {
		this.p_num = p_num;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_category = p_category;
		this.p_manufacturer = p_manufacturer;
		this.p_active = p_active;
		this.p_size = p_size;
		this.p_stock = p_stock;
		this.p_img = p_img;
		this.p_contents = p_contents;
		this.p_date = p_date;
	}

	public Product(String p_name, int p_price, String p_category, String p_manufacturer, int p_active, String p_size,
			int p_stock, String p_img, String p_contents) {
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_category = p_category;
		this.p_manufacturer = p_manufacturer;
		this.p_active = p_active;
		this.p_size = p_size;
		this.p_stock = p_stock;
		this.p_img = p_img;
		this.p_contents = p_contents;
	}

	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getP_category() {
		return p_category;
	}

	public void setP_category(String p_category) {
		this.p_category = p_category;
	}

	public String getP_manufacturer() {
		return p_manufacturer;
	}

	public void setP_manufacturer(String p_manufacturer) {
		this.p_manufacturer = p_manufacturer;
	}

	public int getP_active() {
		return p_active;
	}

	public void setP_active(int p_active) {
		this.p_active = p_active;
	}

	public String getP_size() {
		return p_size;
	}

	public void setP_size(String p_size) {
		this.p_size = p_size;
	}

	public int getP_stock() {
		return p_stock;
	}

	public void setP_stock(int p_stock) {
		this.p_stock = p_stock;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

	public String getP_contents() {
		return p_contents;
	}

	public void setP_contents(String p_contents) {
		this.p_contents = p_contents;
	}

	public String getP_date() {
		return p_date;
	}

	public void setP_date(String p_date) {
		this.p_date = p_date;
	}
	
	
	
	

	
	
	
	

}
