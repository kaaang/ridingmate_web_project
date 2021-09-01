<%--
  Created by IntelliJ IDEA.
  User: 82109
  Date: 2021-08-27
  Time: 오후 3:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal" var="principal"/>
</sec:authorize>

<!DOCTYPE html>
<html>
<head>
	<!-- Site made with Mobirise Website Builder v5.4.1, https://mobirise.com -->
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="generator" content="Mobirise v5.4.1, mobirise.com">
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1">
	<link rel="shortcut icon" href="/assets/images/bold-96x53.png" type="image/x-icon">
	<meta name="description" content="">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>

	<title>main</title>
	<link rel="stylesheet" href="/assets/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/assets/bootstrap/css/bootstrap-grid.min.css">
	<link rel="stylesheet" href="/assets/bootstrap/css/bootstrap-reboot.min.css">
	<link rel="stylesheet" href="/assets/dropdown/css/style.css">
	<link rel="stylesheet" href="/assets/socicon/css/styles.css">
	<link rel="stylesheet" href="/assets/theme/css/style.css">
	<link href="/assets/fonts/style.css" rel="stylesheet">
	<link rel="preload" as="style" href="/assets/mobirise/css/mbr-additional.css">
	<link rel="stylesheet"  href="/assets/mobirise/css/customCss.css" type="text/css">
	<link rel="stylesheet" href="/assets/mobirise/css/mbr-additional.css" type="text/css">




</head>
<body>

	<section data-bs-version="5.1" class="menu menu2 cid-sHcdQkIXSP" once="menu" id="menu2-t">

		<nav class="navbar navbar-dropdown navbar-fixed-top navbar-expand-lg">
			<div class="container">
				<div class="navbar-brand">
					<span class="navbar-logo"> <a href="/"> <img src="/assets/images/bold-96x53.png"  style="height: 3rem;">
					</a>
					</span> <span class="navbar-caption-wrap"><a class="navbar-caption text-black display-7" href="/">Riding Mate Crew</a></span>
				</div>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-bs-toggle="collapse" data-target="#navbarSupportedContent" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
					<div class="hamburger">
						<span></span> <span></span> <span></span> <span></span>
					</div>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav nav-dropdown" data-app-modern-menu="true">
						<li class="nav-item"><a class="nav-link link text-black display-4" href="/userbike">내 바이크</a></li>
						<li class="nav-item"><a class="nav-link link text-black display-4" href="/market">중고 마켓</a></li>
						<li class="nav-item"><a class="nav-link link text-black display-4" href="/cs">고객센터</a></li>
					</ul>

					<div class="navbar-buttons mbr-section-btn">
					<c:choose>
						<c:when test="${empty principal}">
							<a class="btn btn-primary-outline display-4" href="/auth/joinForm">회원가입</a>
							<a class="btn btn-primary display-4" href="/auth/loginForm">로그인</a>
						</c:when>
						<c:otherwise>
							<a class="btn btn-primary-outline display-4" href="/detailForm">내정보</a>
							<a class="btn btn-primary display-4" href="/logout">로그아웃</a>
						</c:otherwise>
					</c:choose>
					</div>





				</div>
			</div>
		</nav>
	</section>