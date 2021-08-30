<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="/data/data.js"></script>
    <script>
        let count=0;
        let totalcount;
        var Loof;
        $(document).ready(function(){
            totalcount=bikedata.length;
            Loof = setInterval(function () {
                goodajax();
            },1000);

        });



        function goodajax() {
            $.ajax({
                type:"POST",
                url:"http://localhost:8000/auth/data",
                data:JSON.stringify(bikedata[count]),
                contentType:"application/json;charset=utf-8",
                dataType:"JSON"
            }).done(function (resp) {
                count++;
                if(count>=totalcount){
                    clearInterval(Loof);
                }
                console.log(count+" 번째 데이터 성공\n");

            }).fail(function (err) {
                console.log(count+" 번째 데이터 실패*********\n");
                clearInterval(Loof);
            })
        }

    </script>
</head>
<body>
adfadfadfadfadfafadfafadsfadfsadsfas
</body>
</html>