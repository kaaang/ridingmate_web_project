$(document).ready(function(){
	   index.loadTxt();
	   index.agreementChk();
	   //index.inputEmptyChk();
});


let index={
    init:function (){
        $("#btn-join").on("click",()=>{
            this.join();
        });
        $("#btn-update").on("click",()=>{
            this.update();
        });
    },
    
    
    join:function (){
        let data = {
            userstring:$("#userstring").val(),
            username:$("#username").val(),
            password:$("#password").val(),
            nickname:$("#nickname").val(),
            phone:$("#phone").val(),
            email:$("#email").val(),
        };

        $.ajax({
            type:"POST",
            url:"/auth/joinProc",
            data:JSON.stringify(data),
            contentType:"application/json;charset=utf-8",
            dataType:"json"
        }).done(function(resp){
            alert("회원가입이 완료되었습니다.");
            location.href="/";
        }).fail(function(err){
            alert(JSON.stringify(err));
        });
    },
    
    update:function (){
		let data = {
			id:$("#id").val(),
			username:$("#username").val(),
            userstring:$("#userstring").val(),
            password:$("#password").val(),
            nickname:$("#nickname").val(),
            phone:$("#phone").val(),
            email:$("#email").val(),
        };
	
	
		if(this.inputEmptyChk()){
			$.ajax({
            type:"PUT",
            url:"/user",
            data:JSON.stringify(data),
            contentType:"application/json;charset=utf-8",
            dataType:"json"
	        }).done(function(resp){
	            alert("회원수정이 완료되었습니다.");
	            location.href="/";
	        }).fail(function(err){
	            alert(JSON.stringify(err));
	        });
		}
	
        

        
    },
    
    //이용약관 텍스트 가져오기
    loadTxt:function(){
		$('#agreement1').load('/assets/txt/agreement1.txt');
		$('#agreement2').load('/assets/txt/agreement2.txt');
		$('#agreement3').load('/assets/txt/agreement3.txt');
	
	},
	
	//이용약관 일괄처리
	agreementChk:function(){
		 
	   $("#checkAll").click(function(){
			if($(this).is(":checked")==true){
				$("#chk1").prop("checked", true);
				$("#chk2").prop("checked", true);
				$("#chk3").prop("checked", true);
			}else{
				$("#chk1").prop("checked", false);
				$("#chk2").prop("checked", false);
				$("#chk3").prop("checked", false);
			}
		});
	},
	
	//input 공란 처리
	inputEmptyChk:function(){
			if($("#userstring").val().length==0){alert("이름을 입력하세요"); $("#userstring").focus(); return false}
			if($("#password").val().length==0){alert("비밀번호를 입력하세요"); $("#password").focus(); return false}
			if($("#nickname").val().length==0){alert("닉네임을 입력하세요"); $("#nickname").focus(); return false}
			if($("#phone").val().length==0){alert("핸드폰 번호를 입력하세요"); $("#phone").focus(); return false}
			if($("#email").val().length==0){alert("이메일을 입력하세요"); $("#email").focus(); return false}
			return true;
	}
	

}


index.init();
