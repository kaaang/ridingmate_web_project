<%--
  Created by IntelliJ IDEA.
  User: 82109
  Date: 2021-09-01
  Time: 오후 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../layout/header.jsp"%>
<br>

<form>
    <div class="custom-control custom-switch" style="margin-left: 10%">
        <a href="/board/write"><button type="button" class="btn btn-outline-primary">글쓰기</button></a>>
        <input type="checkbox" class="custom-control-input" id="switch1">
        <label class="custom-control-label" for="switch1">상세 검색</label>
    </div>
</form>

<form>
    <div style="margin-left: 10%;margin-top: 10px">
        <select name="cars" class="custom-select">
            <option selected>배기량</option>
            <option value="volvo">Volvo</option>
            <option value="fiat">Fiat</option>
            <option value="audi">Audi</option>
        </select>
        <select name="cars" class="custom-select">
            <option selected>제조사</option>
            <option value="volvo">Volvo</option>
            <option value="fiat">Fiat</option>
            <option value="audi">Audi</option>
        </select>
        <select name="cars" class="custom-select">
            <option selected>모델명</option>
            <option value="volvo">Volvo</option>
            <option value="fiat">Fiat</option>
            <option value="audi">Audi</option>
        </select>
        <select name="cars" class="custom-select">
            <option selected>시트고</option>
            <option value="volvo">Volvo</option>
            <option value="fiat">Fiat</option>
            <option value="audi">Audi</option>
        </select>
    </div>
</form>

<div class="container">
    <br>

    <div class="card" style="width:300px;height: 500px;border: 1px solid black">
        <img class="card-img-top" src="/img/1.jpg" alt="Card image" style="width:100%;height: 50%;margin: auto"/>
        <div class="card-body">

            <h4 class="card-title">제목 나올곳</h4>
            <h6 class="card-title">회사명</h6>
            <h6 class="card-title">모델</h6>
            <h6 class="card-title">연식</h6>
            <h6 class="card-title">지역</h6>
            <h6 class="card-title">가격</h6>
            <h6 class="card-title">작성자</h6>
            <h6 class="card-title">작성시간</h6>
            <h6 class="card-title">조회수</h6>
            <a href="#" class="stretched-link"></a>
        </div>
    </div>


    <ul class="pagination justify-content-center">
        <li class="page-item disabled"><a class="page-link" href="#">Previous</a></li>
        <li class="page-item"><a class="page-link" href="#">Previous</a></li>
        <li class="page-item disabled"><a class="page-link" href="#">Next</a></li>
        <li class="page-item"><a class="page-link" href="#">Next</a></li>
    </ul>
</div>





<%@include file="../layout/footer.jsp"%>