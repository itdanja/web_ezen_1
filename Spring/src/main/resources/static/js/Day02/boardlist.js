function boardwrite(){


    var b_title = $("#b_title").val();
    var b_contents = $("#b_contents").val();
    var param = { "b_title" : b_title , "b_contents" : b_contents };
    //  json변수 = {  "키" : 값 , "키2" : 값2 };

     /* 텍스트형 변수 전송 */
//    $.ajax({
//        url: "boardwrite2",  // 매핑할 경로
//        method: "get",  // 보내는 방식
//        data:  param ,     // 보내는 데이터
//        success: function( result ) { // 성공했을때
//            location.href = "/";  //    "/" 와 매핑하기
//        }
//    });

    /* json형 전송 */
        // json형 데이터 전송시 get 메소드 사용시 인코딩 문제!!!
        //  1. 문제 해결 : PoST 메소드 사용
    $.ajax({
            url: "boardwrite3" ,  // 매핑할 경로
            method: "Post" ,  // 보내는 방식
            data:  JSON.stringify(param) ,     // 보내는 데이터
            contentType: "application/json" ,  // 보내는 데이터 형식
            success: function( result ) { // 성공했을때
                location.href = "/";  //    "/" 와 매핑하기
            }
        });
}