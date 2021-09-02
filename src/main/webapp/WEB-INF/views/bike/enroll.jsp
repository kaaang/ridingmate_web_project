<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script>

        $(document).ready(function(){

            goodajax();
        });


        function goodajax(){
            $.ajax({
                type:"GET",
                url:"http://localhost:8000/auth/searchspec",
                contentType:"application/json;charset=utf-8",
                dataType:"JSON"
            }).done(function (resp) {
                console.log(resp);

            }).fail(function (err) {
                console.log("뽀킹실패 ");
            })
        }

    </script>
</head>
<body>
adfadfadfadfadfafadfafadsfadfsadsfas
</body>
</html>