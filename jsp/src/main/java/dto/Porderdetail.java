package dto;

public class Porderdetail {
	
	private int orderdetail_num;
	private int order_num ;
	private int p_num  ;
	private int p_count  ;
	private int delivery_state ;
	
	public Porderdetail() {
		// TODO Auto-generated constructor stub
	}

	public Porderdetail(int orderdetail_num, int order_num, int p_num, int p_count, int delivery_state) {
		super();
		this.orderdetail_num = orderdetail_num;
		this.order_num = order_num;
		this.p_num = p_num;
		this.p_count = p_count;
		this.delivery_state = delivery_state;
	}

	public Porderdetail(int order_num, int p_num, int p_count, int delivery_state) {
		this.order_num = order_num;
		this.p_num = p_num;
		this.p_count = p_count;
		this.delivery_state = delivery_state;
	}

	public int getOrderdetail_num() {
		return orderdetail_num;
	}

	public void setOrderdetail_num(int orderdetail_num) {
		this.orderdetail_num = orderdetail_num;
	}

	public int getOrder_num() {
		return order_num;
	}

	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}

	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	public int getP_count() {
		return p_count;
	}

	public void setP_count(int p_count) {
		this.p_count = p_count;
	}

	public int getDelivery_state() {
		return delivery_state;
	}

	public void setDelivery_state(int delivery_state) {
		this.delivery_state = delivery_state;
	}
	
	
	
	
	
	
	
	
	
	

}
