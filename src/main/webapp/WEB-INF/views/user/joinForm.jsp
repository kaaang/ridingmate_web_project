<%--
  Created by IntelliJ IDEA.
  User: 82109
  Date: 2021-08-27
  Time: 오후 3:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../layout/header.jsp"%>
<section data-bs-version="5.1" class="form7 cid-sHbevW3ksg" id="form7-s">

	<div class="mbr-overlay"></div>
	<div class="container">
		<div class="mbr-section-head">
			<h3 class="mbr-section-title mbr-fonts-style align-center mb-0 display-2">
				<strong>회원가입</strong>
			</h3>
		</div>
		<div class="row justify-content-center mt-4">
			<div class="col-lg-12 mx-auto mbr-form" data-form-type="formoid">
				<form class="mbr-form form-with-styler mx-auto">
					<div class="dragArea row">
						<div class="col-12 form-group mb-3" data-for="name">
							<label class="display-7 csLabel">이름</label> <input type="text" name="userstring" placeholder="이름" class="form-control" value="" id="userstring">
						</div>
						<div class="col-12 form-group mb-3 " data-for="name">
							<label class="display-7 csLabel">아이디</label> <input type="text" name="username" placeholder="아이디" class="form-control" value="" id="username">
						</div>
						<div class="col-12 form-group mb-3" data-for="name">
							<label class="display-7 csLabel">비밀번호</label> <input type="password" name="password" placeholder="8자리 이상 입력해주세요" class="form-control" value="" id="password">
						</div>
						<div class="col-12 form-group mb-3" data-for="name">
							<label class="display-7 csLabel">닉네임</label> <input type="text" name="nickname" placeholder="ex) 라이" class="form-control" value="" id="nickname">
						</div>
						<div class="col-12 form-group mb-3" data-for="phone">
							<label class="display-7 csLabel">핸드폰 번호</label> <input type="text" name="phone" placeholder="010-0000-0000" class="form-control" value="" id="phone">
						</div>
						<div class="col-12 form-group mb-3" data-for="email">
							<label class="display-7 csLabel">이메일</label> <input type="email" name="email" placeholder="E-mail" class="form-control" value="" id="email">
						</div>
						<%--						<div class="col-12 form-group mb-3" data-for="textarea">--%>
						<%--							<textarea name="textarea" placeholder="Message" data-form-field="textarea" class="form-control" id="textarea-form5-x"></textarea>--%>
						<%--						</div>--%>
					</div>

				</form>


			</div>
		</div>
	</div>
	<div class="container">
		<div class="row justify-content-center mt-4">
			<h4 class="align-center" >
			<strong>서비스 약관에 동의하여 주세요</strong><br><br>
			</h4>
			<div class="col-lg-12 mx-auto mbr-form" data-form-type="formoid">
				<form class="mbr-form form-with-styler mx-auto">
			
					<div class="dragArea row">
					
						<ul>
							<li class="checkBox check01">
								<ul class="clearfix">
									<li>모두 동의합니다.</li>
									<li class="checkAllBtn"><input type="checkbox" name="chkAll" id="checkAll" class="chkAll"></li>
								</ul>
							</li>
							<li class="checkBox check02">
								<ul class="clearfix">
									<li>이용약관 동의(필수)</li>
									<li class="checkBtn"><input type="checkbox" name="chk" id="chk1"></li>
								</ul> 
								<textarea id="agreement1" rows=6 data-form-field="textarea" class="form-control text-muted" readonly>
				     	  		</textarea>
							</li>
							<li class="checkBox check03">
								<ul class="clearfix">
									<li>개인정보 수집 및 이용에 대한 안내(필수)</li>
									<li class="checkBtn"><input type="checkbox" name="chk" id="chk2"></li>
								</ul> 
								<textarea id="agreement2" rows=6 data-form-field="textarea" class="form-control text-muted" readonly>
				     	  		</textarea>
							</li>
							<li class="checkBox check03">
								<ul class="clearfix">
									<li>위치정보 이용약관 동의(선택)</li>
									<li class="checkBtn"><input type="checkbox" name="chk" id="chk3"></li>
								</ul> 
								<textarea id="agreement3" rows=6 data-form-field="textarea" class="form-control text-muted" readonly>
				     	  		</textarea>
							</li>
						</ul>

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