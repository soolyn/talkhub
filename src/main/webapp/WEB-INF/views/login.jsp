<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 4.
  Time: 오후 5:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TalkHub</title>
</head>
<body>
<h1>TalkHub</h1>
<h3>로그인</h3>
<form action="${pageContext.request.contextPath}/login-proceed">
    <p>
        <label>아이디</label>
    <div>
        <input type="text" name="id">
    </div>
    </p>
    <p>
        <label>비밀번호</label>
    <div>
        <input type="password" name="password">
    </div>
    </p>
    <button type="submit">로그인</button>
</form>
</body>
</html>
