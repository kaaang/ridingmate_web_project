<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script>

        $(document).ready(function(){
            init();
            getCompany();
        });


        function getCompany(){
            $.ajax({
                type:"GET",
                url:"http://localhost:8000/auth/searchcompany",
                contentType:"application/json;charset=utf-8",
                dataType:"JSON"
            }).done(function (resp) {
                console.log(resp);
                $("#company").empty();
                $("#company").append("<option>"+"제조사를 선택 해 주세요"+"</option>");

                for (var i=0;i<resp.length;i++){
                    $("#company").append("<option>"+resp[i].company+"</option>");
                }

            }).fail(function (err) {
                console.log("company 정보 불러오기 실패");
                $("#company").append("<option>"+"company 정보 불러오기 실패"+"</option>");
            })
        }

        //모델정보 api로 받아와 select에 넣기
        function getmodel(){
            $("#model").empty();
            // console.log($("#company option:selected").val());
            let url ="http://localhost:8000/auth/searchmodel?companyName="+$("#company option:selected").val();
            $.ajax({
                type:"GET",
                url:url,
            }).done(function (resp) {
                // console.log(resp);
                $("#model").append("<option>"+"모델을 선택 해 주세요"+"</option>");
                for (var i=0;i<resp.length;i++){
                    $("#model").append("<option>"+resp[i].model+"</option>");
                }

            }).fail(function (err) {
                console.log("Model 정보 불러오기 실패");
                $("#model").append("<option>"+"Model 정보 불러오기 실패"+"</option>");
            })
        }

        //모델정보 api로 받아와 select에 넣기
        function getyear(){
            $("#year").empty();
            // console.log($("#company option:selected").val());
            let url ="http://localhost:8000/auth/searchyear?companyName="+$("#company option:selected").val()+"&model="+$("#model option:selected").val();
            $.ajax({
                type:"GET",
                url:url,
            }).done(function (resp) {
                // console.log(resp);
                $("#year").append("<option>"+"연식을 선택 해 주세요"+"</option>");
                for (var i=0;i<resp.length;i++){
                    $("#year").append("<option>"+resp[i].year+"</option>");
                }

            }).fail(function (err) {
                console.log("year 정보 불러오기 실패");
                $("#year").append("<option>"+"year 정보 불러오기 실패"+"</option>");
            })
        }

        function init() {
            $("#company").change(function() {getmodel();});
            $("#model").change(function() {getyear();});
        }
    </script>
</head>
<body>
<select id="company"></select><br><br>
<select id="model">
    <option>모델을 선택 해 주세요</option>
</select><br><br>
<select id="year">
    <option>연식을 선택 해 주세요</option>
</select>
</body>
</html>