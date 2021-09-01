<%--
  Created by IntelliJ IDEA.
  User: 82109
  Date: 2021-09-02
  Time: 오전 1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../layout/header.jsp"%>
<br>
<form>
    <br>
    <div class="form-group" style="width: 80%">
        <input type="text" class="form-control" placeholder="Enter title" id="title">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" placeholder="제조사" id="a">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" placeholder="모델명" id="b">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" placeholder="배기량(숫자만 입력)" id="c">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" placeholder="연식" id="d">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" placeholder="적산 거리" id="e">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" placeholder="색상" id="f">
    </div>
    </div>
    <div class="form-group">
        <input type="text" class="form-control" placeholder="가격" id="g">
    </div>


    <div class="form-group">
        <textarea class="form-control summernote" rows="5" id="content"></textarea>
    </div>


</form>
<button id="btn-save" class="btn btn-primary">글쓰기 완료</button>

</div>

<script>
    $('.summernote').summernote({
        tabsize: 2,
        height: 300
    });
</script>
<script src="/js/board.js"></script>
<%@include file="../layout/footer.jsp"%>
