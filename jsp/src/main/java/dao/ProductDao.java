package dao;

public class ProductDao extends DB {
	public ProductDao() {
		super();
	}
	public static ProductDao productDao = new ProductDao() ; 	
	public static ProductDao getProductDao() { return productDao; }
	
	// 1. 제품 등록 메소드 
	public boolean productwrite() {
		return false;
	}
	// 2. 제품 모든 출력 메소드 
	
	// 3. 제품 조건[ 검색 / 카데고리 ] 출력 메소드 
	
	// 4. 제품 수정 메소드 
	
	// 5. 제품 삭제 메소드 

}

