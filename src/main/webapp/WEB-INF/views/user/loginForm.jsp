<%--
  Created by IntelliJ IDEA.
  User: 82109
  Date: 2021-08-27
  Time: 오후 3:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../layout/header.jsp"%>
<section data-bs-version="5.1" class="form7 cid-sHbevW3ksg" id="form7-s">

    <div class="mbr-overlay"></div>
    <div class="container">
        <div class="mbr-section-head">
            <h3 class="mbr-section-title mbr-fonts-style align-center mb-0 display-2">
                <strong>로그인</strong></h3>

        </div>
        <div class="row justify-content-center mt-4">
            <div class="col-lg-8 mx-auto mbr-form" data-form-type="formoid">
                <form action="/auth/loginProc" method="POST" class="mbr-form form-with-styler mx-auto">
                    <div class="dragArea row">
                        <div class="col-lg-12 col-md-12 col-sm-12 form-group mb-3" data-for="name">
                            <input type="text" name="username" placeholder="ID" data-form-field="name" class="form-control" id="username">
                        </div>
                        <div class="col-lg-12 col-md-12 col-sm-12 form-group mb-3" data-for="password">
                            <input type="password" name="password" placeholder="Password" data-form-field="email" class="form-control" id="password">
                        </div>

                        <div class="col-auto mbr-section-btn align-center">
                            <button type="btn-login" class="btn btn-primary display-4">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
<%@include file="../layout/footer.jsp"%>
