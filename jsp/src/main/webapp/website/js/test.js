/**
 * 
 */
	var price = 5;	// 변수 선언
	var num1 = 14;	// 변수 선언
	var total = price * num1;	// 변수 연산		
	// 현재 문서의 html 태그 id 가져오기 [ span을 객체로 가져오기 ]
	var elem = document.getElementById("number");
	elem.innerHTML = "안녕하세요";
	
	var minus = price - num1;	// 변수 연산
	var plus = price + num1;	// 변수 연산
	var elem1 = document.getElementById("number1");
	if( price == num1 ){
		elem1.textContent = minus;
	}else{
		elem1.textContent = plus;
	}
function start(){	// 함수 선언 [ function 메소드명(){ 실행문 } ]
	// 배열 선언 : var 변수명 = [ 요소1 , 요소2 , 요소3 ~~ ]
	var color = ['red' , 'white' , 'black'];
	
	var colorName = document.getElementById("color");
	colorName.textContent = color[0];
	colorName.style.color = color[0];	// 태그명.style.속성
	
	var colors = color.length;
	var colorLength = document.getElementById("colors");
	colorLength.textContent = colors;
	
	document.body.style.backgroundColor = "blue";
}




