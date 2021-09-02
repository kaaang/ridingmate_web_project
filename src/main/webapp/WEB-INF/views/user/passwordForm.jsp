<%--
  Created by IntelliJ IDEA.
  User: 82109
  Date: 2021-08-27
  Time: 오후 3:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../layout/header.jsp"%>
<section data-bs-version="5.1" class="form7 cid-sHbevW3ksgk" id="form7-s">

	<div class="mbr-overlay"></div>
	<div class="container">
		<div class="row justify-content-center mt-4">
			<div class="col-lg-8 mx-auto mbr-form" data-form-type="formoid">
				<form class="mbr-form form-with-styler mx-auto">
					<div class="dragArea row">
						<input type="hidden" id="id" value="${principal.user.id}" />
						<div class="col-12 form-group mb-3 align-center" data-for="name">
							<label class="display-7 csLabel align-center">개인정보를 안전하게 보고하기 위하여<br> 비밀번호를 한번 더 입력하여 주세요
							</label> <br>
							<br> <input type="password" name="password" class="form-control" placeholder="현재 비밀번호" id="password">
						</div>
					</div>
					<div class="col-lg-12 col-md-12 col-sm-12 align-center mbr-section-btn">
						<button type="button" id="btn-passChk" class="btn btn-primary display-4">확인</button>
					</div>

				</form>


			</div>
		</div>
	</div>

</section>
<script src="/js/user.js"></script>
<%@include file="../layout/footer.jsp"%>