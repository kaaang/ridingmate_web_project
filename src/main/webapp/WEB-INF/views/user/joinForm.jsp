<%--
  Created by IntelliJ IDEA.
  User: 82109
  Date: 2021-08-27
  Time: 오후 3:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../layout/header.jsp"%>
<section data-bs-version="5.1" class="form5 cid-sHcguQJ9tr" id="form5-x">

	<div class="mbr-overlay"></div>
	<div class="container">
		<div class="mbr-section-head">
			<h3 class="mbr-section-title mbr-fonts-style align-center mb-0 display-2">
				<strong>회원가입</strong>
			</h3>
		</div>
		<div class="row justify-content-center mt-4">
			<div class="col-lg-8 mx-auto mbr-form" data-form-type="formoid">
				<form>
					<div class="dragArea row">
						<div class="col-12 form-group mb-3" data-for="name">
							<input type="text" name="user_name" placeholder="이름" class="form-control" value="" id="user_name">
						</div>
						<div class="col-12 form-group mb-3" data-for="name">
							<input type="text" name="user_id" placeholder="아이디" class="form-control" value="" id="user_id">
						</div>
						<div class="col-12 form-group mb-3" data-for="name">
							<input type="password" name="password" placeholder="비밀번호" class="form-control" value="" id="password">
						</div>
						<div class="col-12 form-group mb-3" data-for="name">
							<input type="text" name="nickname" placeholder="닉네임" class="form-control" value="" id="nickname">
						</div>
						<div class="col-12 form-group mb-3" data-for="name">
							<input type="text" name="phone" placeholder="핸드폰 번호" class="form-control" value="" id="phone">
						</div>
						<div class="col-12 form-group mb-3" data-for="email">
							<input type="email" name="email" placeholder="E-mail" class="form-control" value="" id="email">
						</div>
<%--						<div class="col-12 form-group mb-3" data-for="textarea">--%>
<%--							<textarea name="textarea" placeholder="Message" data-form-field="textarea" class="form-control" id="textarea-form5-x"></textarea>--%>
<%--						</div>--%>
					</div>
				</form>
				<div class="col-lg-12 col-md-12 col-sm-12 align-center mbr-section-btn">
					<button id="btn-join" class="btn btn-primary display-4">회원가입</button>
				</div>
			</div>
		</div>
	</div>
</section>
<script src="/js/user.js"></script>
<%@include file="../layout/footer.jsp"%>