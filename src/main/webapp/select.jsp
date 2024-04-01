<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>人数選択画面</title>
<style>
 body{
 text-align:center;
 }
</style>
</head>
<body>
<h1>遊ぶ人数を選んでね！</h1>

<input type="button" value="1人" onclick="location.href='/575/servletA?action=1'">
<input type="button" value="2人" onclick="location.href='/575/servletA?action=2'">

</body>
</html>