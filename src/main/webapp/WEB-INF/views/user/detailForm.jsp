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
		<div class="mbr-section-head">
			<h3 class="mbr-section-title mbr-fonts-style align-center mb-0 display-2">
				<strong>내 정보</strong>
			</h3>
		</div>
		<div class="row justify-content-center mt-4">
			<div class="col-lg-12 mx-auto mbr-form" data-form-type="formoid">
				<form class="mbr-form form-with-styler mx-auto">
					<div class="dragArea row">
						<input type="hidden"  id="id" value="${principal.user.id}"/>
						<div class="col-12 form-group mb-3" data-for="name">
							<label class="display-7 csLabel">이름</label> 
							<input type="text" name="userstring" class="form-control" value="${principal.user.getUserstring()}" id="userstring">
						</div>
						<div class="col-12 form-group mb-3 " data-for="name">
							<label class="display-7 csLabel">아이디</label> 
							<input type="text" name="username" class="form-control" value="${principal.getUsername()}" id="username" readonly>
						</div>
						<div class="col-12 form-group mb-3" data-for="name">
							<label class="display-7 csLabel">비밀번호</label> 
							<input type="password" name="password" placeholder="8자리 이상 입력해주세요" class="form-control"   id="password" >
						</div>
						<div class="col-12 form-group mb-3" data-for="name">
							<label class="display-7 csLabel">닉네임</label>
							 <input type="text" name="nickname" placeholder="ex) 라이" class="form-control" value="${principal.user.getNickname()}" id="nickname">
						</div>
						<div class="col-12 form-group mb-3" data-for="phone">
							<label class="display-7 csLabel">핸드폰 번호</label> 
							<input type="text" name="phone" placeholder="010-0000-0000" class="form-control" value="${principal.user.getPhone()}"  id="phone">
						</div>
						<div class="col-12 form-group mb-3" data-for="email">
							<label class="display-7 csLabel">이메일</label> 
							<input type="email" name="email" class="form-control" value="${principal.user.getEmail()}" id="email">
						</div>
						<%--						<div class="col-12 form-group mb-3" data-for="textarea">--%>
						<%--							<textarea name="textarea" placeholder="Message" data-form-field="textarea" class="form-control" id="textarea-form5-x"></textarea>--%>
						<%--						</div>--%>
					</div>

				</form>

				<div class="col-lg-12 col-md-12 col-sm-12 align-center mbr-section-btn">
						<button id="btn-update" class="btn btn-primary display-4">수정하기</button>
				</div>
			</div>
		</div>
	</div>
	
</section>
<script src="/js/user.js"></script>
<%@include file="../layout/footer.jsp"%>