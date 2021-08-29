let index={
    init:function (){
        $("#btn-join").on("click",()=>{
            this.join();
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
    }

}

index.init();