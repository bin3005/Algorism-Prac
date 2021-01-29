<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

<script type="text/javascript" >
	function qwe(){
		//alert($("#roomno").val());
		window.open("https://172.30.1.38:9001/qwe.html?studyid="+ $("#roomno").val() +"&memberid="+$("#memberid").val());
	
	};
	
	
</script>
</head>

<body>
	<input type="text" id="roomno" placeholder="방번호">
	<input type="text" id="memberid" placeholder="멤버아이디">
	<input type="button" value="열기" onclick="qwe();">
	<a href="home.do">home으로</a>
</body>
</html>