<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<div id = "root">
	<header id="header">
		<div id ="header_box">
			<%@ include file="include/header.jsp" %>
		</div>
	</header>
</div>

<nav id="nav">
	<div id="nav_box">
		<%@ include file ="include/nav.jsp" %>
	</div>
</nav>

<footer id="footer">
	<div id="footer_box">
		<%@ include file="include/footer.jsp" %>
	</div>
</footer>

</body>
</html>
