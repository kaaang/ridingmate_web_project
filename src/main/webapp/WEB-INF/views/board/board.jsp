<%--
  Created by IntelliJ IDEA.
  User: 82109
  Date: 2021-09-01
  Time: 오후 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
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
		<select name="cars" class="custom-select">
			<option selected>지역</option>
			<option value="volvo">Volvo</option>
			<option value="fiat">Fiat</option>
			<option value="audi">Audi</option>
		</select>
		<select name="cars" class="custom-select">
			<option selected>직거래</option>
			<option value="volvo">Volvo</option>
			<option value="fiat">Fiat</option>
			<option value="audi">Audi</option>
		</select>
		<select name="cars" class="custom-select">
			<option selected>적산거리</option>
			<option value="volvo">Volvo</option>
			<option value="fiat">Fiat</option>
			<option value="audi">Audi</option>
		</select>
    </div>
</form>



<section data-bs-version="5.1" class="features3 cid-sHOtT9Yg33" id="features3-27">


	<div class="container">
		<div class="mbr-section-head">
			<h4 class="mbr-section-title mbr-fonts-style align-center mb-0 display-2">
				<strong>중고 거래</strong>
			</h4>

		</div>
		<div class="row mt-4">
			<div class="item features-image сol-12 col-md-6 col-lg-3">
				<div class="item-wrapper">
					<div class="item-img">
						<img src="/img/1.jpg">
					</div>
					<div class="item-content">
						<h5 class="item-title mbr-fonts-style display-7">
							<strong>제목</strong>
						</h5>
						<h6 class="item-subtitle mbr-fonts-style mt-1 display-7">
							<em>가격 : </em>
						</h6>
						<h7 class="item-subtitle mbr-fonts-style mt-1 display-7">
							<em>제조사 : </em>
						</h7><br>
						<h7 class="item-subtitle mbr-fonts-style mt-1 display-7">
							<em>모델명 : </em>
						</h7><br>
						<h7 class="item-subtitle mbr-fonts-style mt-1 display-7">
							<em>연식 : </em>
						</h7><br>
						<h7 class="item-subtitle mbr-fonts-style mt-1 display-7">
							<em>적산거리 : </em>
						</h7><br>
						<h7 class="item-subtitle mbr-fonts-style mt-1 display-7">
							<em>색상 : </em>
						</h7><br>
						<h7 class="item-subtitle mbr-fonts-style mt-1 display-7">
							<em>지역 : </em>
						</h7>
					</div>

				</div>
			</div>
			<div class="item features-image сol-12 col-md-6 col-lg-3">
				<div class="item-wrapper">
					<div class="item-img">
						<img src="/img/1.jpg">
					</div>
					<div class="item-content">
						<h5 class="item-title mbr-fonts-style display-7">
							<strong>Mobile Friendly</strong>
						</h5>
						<h6 class="item-subtitle mbr-fonts-style mt-1 display-7">
							<em>Card Subtitle</em>
						</h6>
						<p class="mbr-text mbr-fonts-style mt-3 display-7">You don't have to code to create your own site. Select one of available themes in the Mobirise Site Maker.</p>
					</div>

				</div>
			</div>
			<div class="item features-image сol-12 col-md-6 col-lg-3">
				<div class="item-wrapper">
					<div class="item-img">
						<img src="/img/1.jpg">
					</div>
					<div class="item-content">
						<h5 class="item-title mbr-fonts-style display-7">
							<strong>Unique Styles</strong>
						</h5>
						<h6 class="item-subtitle mbr-fonts-style mt-1 display-7">
							<em>Card Subtitle</em>
						</h6>
						<p class="mbr-text mbr-fonts-style mt-3 display-7">
							Select the theme that suits you. Each theme in the Mobirise Website Software contains a set of unique blocks.<br>
						</p>
					</div>

				</div>
			</div>
		</div>
	</div>
</section>





<%@include file="../layout/footer.jsp"%>