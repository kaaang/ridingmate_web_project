<%--
  Created by IntelliJ IDEA.
  User: 82109
  Date: 2021-09-02
  Time: 오전 1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../layout/header.jsp"%>
<section data-bs-version="5.1" class="form7 cid-sHbevW3ksgk" id="form7-s">


	<div class="container">
		<div class="mbr-section-head">
			<div class="mbr-section-head">
				<h3 class="mbr-section-title mbr-fonts-style align-center mb-0 display-2">
					<strong>글쓰기</strong>
				</h3>
			</div>


			<div class="container mt-3">
				<form>
					<div class="input-group mb-3">
						<div class="input-group-prepend">
							<span class="input-group-text">제목</span>
						</div>
						<input type="text" class="form-control">
					</div>
				</form>
			</div>

			<div class="container">
					<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
							바이크 선택
					</button>
					<div class="dropdown-menu">
						<c:forEach var="bike" items="${bikeList}">
							<a class="dropdown-item" href="/board/write/bikeselect">${bike.nickname}</a>
						</c:forEach>
					</div>
				</div>
			</div>


				<div class="form-group">
					<textarea class="form-control summernote" rows="5" id="content"></textarea>
				</div>


				</form>

				<button id="btn-save" class="btn btn-primary">글쓰기 완료</button>
			</div>
		</div>
	</div>

	</div>
</section>

<script>
	$('.summernote').summernote({
		tabsize : 2,
		height : 300
	});
</script>
<script src="/js/boardWrite.js"></script>
<%@include file="../layout/footer.jsp"%>
