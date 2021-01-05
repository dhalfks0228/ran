<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" 
	contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
    <style>
        .title{
            text-align: center;
            margin-top: 50px;
            margin-bottom: 30px;
        }
        label.error{
            color: red;
            display: none;
        }
    </style>
</head>
<body>
    <form action="<%=request.getContextPath() %>/signup" id="form" class="container-fluid" method="post">
        <h1 class="title">회원가입</h1>
        <div class="form-group">
            <input type="text" class="form-control" id="id" name="id" placeholder="아이디" value="${user.id}"> 
            <label id="id-error" class="error" for="id"></label>
          </div>
          <div class="form-group">
            <input type="password" class="form-control" id="pw" name="pw" placeholder="비밀번호"  value="${user.pw}"> 
            <label id="pw-error" class="error" for="pw"></label>
          </div>
          <div class="form-group">
            <input type="password" class="form-control" id="pw2" name="pw2" placeholder="비밀번호"  value="${user.pw2}"> 
            <label id="pw2-error" class="error" for="pw2"></label>
          </div>
          <div class="form-group">
            <input type="text" class="form-control" id="age" name="age" placeholder="나이"  value="${user.age}"> 
            <label id="age-error" class="error" for="age"></label>
          </div>
          <div class="form-group">
            <input type="text" class="form-control" id="name" name="name" placeholder="이름"  value="${user.name}"> 
            <label id="name-error" class="error" for="name"></label>
          </div>
          <div class="form-group">
            <input type="text" class="form-control" id="email" name="email" placeholder="e-mail"  value="${user.email}"> 
            <label id="email-error" class="error" for="email"></label>
          </div>
          <div class="form-group">
            <input type="text" class="form-control" id="home" name="home" placeholder="homepage"  value="${user.home}"> 
            <label id="home-error" class="error" for="home"></label>
          </div>          
          <button class="btn btn-outline-success col-12">회원가입</button>
    </form>
   ${user.test}
</body>
</html>