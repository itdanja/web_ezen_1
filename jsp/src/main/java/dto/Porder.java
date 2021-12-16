package dto;

public class Porder {
	
	private int order_num ;
	private int m_num ;
	private String order_date ;
	private String order_name ;
	private String order_phone ;
	private String order_address;
	private int order_pay ;
	private String order_payment ;
	private int delivery_num;
	private int delivery_pay;
	
	public Porder() {
		// TODO Auto-generated constructor stub
	}

	public Porder(int order_num, int m_num, String order_date, String order_name, String order_phone,
			String order_address, int order_pay, String order_payment, int delivery_num, int delivery_pay) {
		super();
		this.order_num = order_num;
		this.m_num = m_num;
		this.order_date = order_date;
		this.order_name = order_name;
		this.order_phone = order_phone;
		this.order_address = order_address;
		this.order_pay = order_pay;
		this.order_payment = order_payment;
		this.delivery_num = delivery_num;
		this.delivery_pay = delivery_pay;
	}

	public Porder(int m_num, String order_name, String order_phone, String order_address, int order_pay,
			String order_payment, int delivery_pay) {
		this.m_num = m_num;
		this.order_name = order_name;
		this.order_phone = order_phone;
		this.order_address = order_address;
		this.order_pay = order_pay;
		this.order_payment = order_payment;
		this.delivery_pay = delivery_pay;
	}

	public int getOrder_num() {
		return order_num;
	}

	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public String getOrder_phone() {
		return order_phone;
	}

	public void setOrder_phone(String order_phone) {
		this.order_phone = order_phone;
	}

	public String getOrder_address() {
		return order_address;
	}

	public void setOrder_address(String order_address) {
		this.order_address = order_address;
	}

	public int getOrder_pay() {
		return order_pay;
	}

	public void setOrder_pay(int order_pay) {
		this.order_pay = order_pay;
	}

	public String getOrder_payment() {
		return order_payment;
	}

	public void setOrder_payment(String order_payment) {
		this.order_payment = order_payment;
	}

	public int getDelivery_num() {
		return delivery_num;
	}

	public void setDelivery_num(int delivery_num) {
		this.delivery_num = delivery_num;
	}

	public int getDelivery_pay() {
		return delivery_pay;
	}

	public void setDelivery_pay(int delivery_pay) {
		this.delivery_pay = delivery_pay;
	}
	
	
}
