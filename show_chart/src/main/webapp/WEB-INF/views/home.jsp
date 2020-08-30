<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<title>Home</title>

<%@include file="./common_resource.jsp"%>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/home.js?ver=1.2"></script>
<link href="${pageContext.request.contextPath}/resources/css/home.css"
	rel="stylesheet" />
</head>
<body>
	<h1>wine_quality 데이터 활용해서 차트 만들기</h1><br><br>
	<figure class="highcharts-figure">
		<div id="container1"></div><br><br><br>
		<div id="container2"></div>
	</figure>
</body>
</html>
