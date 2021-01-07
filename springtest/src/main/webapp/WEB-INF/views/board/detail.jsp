<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
  <h2>Form control: input</h2>
  <p>The form below contains two input elements; one of type text and one of type password:</p>
  <form action="/action_page.php">
    <div class="form-group">
      <label for="usr">제목</label>
      <input type="text" class="form-control" id="usr" name="title" readonly value="${board.num}">
    </div>
    <div class="form-group">
      <label for="pwd">작성자</label>
      <input type="text" class="form-control" id="pwd" name="writer" readonly value="${board.writer}">
    </div>
    <div class="form-group">
      <label for="pwd">작성일</label>
      <input type="text" class="form-control" id="pwd" name="registerDate" readonly value="${board.registerDate}">
    </div>
    <div class="form-group">
      <label for="pwd">내용</label>
      <textarea class="form-control" id="pwd" name="content" readonly>${board.content}</textarea>
    </div>
    <a href="<%=request.getContextPath()%>/board/list">
    	<button type="button" class="btn btn-primary">목록</button>
    </a>
  </form>
</div>
</body>
</html>