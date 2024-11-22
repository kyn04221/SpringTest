<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 11. 21.
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>메뉴판</title>
</head>
<body>
<h1>카페 메뉴판</h1>
<ul>
  <li>아메리카노 - 4,000원</li>
  <li>카페라떼 - 4,500원</li>
  <li>카푸치노 - 5,000원</li>
  <li>바닐라 라떼 - 5,000원</li>
  <li>카페모카 - 5,500원</li>
  <li>초코라떼 - 5,500원</li>
  <li>녹차라떼 - 5,500원</li>
  <li>복숭아 아이스티 - 4,500원</li>
  <li>레몬에이드 - 5,000원</li>
  <li>자몽에이드 - 5,000원</li>
</ul>
<form action="/food/register" method="post">
  <button type="submit">돌아가기</button>
</form>
</body>
</html>
