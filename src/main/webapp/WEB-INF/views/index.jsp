<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 4.
  Time: 오전 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TalkHub</title>
</head>
<body>
<h1>TalkHub</h1>
<p>
    TalkHub 에 오신것을 환영합니다람쥐
</p>

<form action="${pageContext.request.contextPath}/join">
    <button type="submit">회원가입</button>
</form>

<form action="${pageContext.request.contextPath}/login">
    <button type="submit">로그인</button>
</form>

</body>
</html>
