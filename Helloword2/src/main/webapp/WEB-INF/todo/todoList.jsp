<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 11. 21.
  Time: 오전 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>todoList</title>
</head>
<body>
<h1>todoList 목록화면. </h1>
<a href="/todo/register">글쓰기 폼이동</a>

<h2>todoRead 하나 조회 더미 </h2>
<a href="/todo/read?tno=5">하나 조회</a>

<h2>더미 데이터 단순 출력</h2>
<h3>list 전체 중에서 호출, list[0]</h3>
${list[0]}
<h3>list 전체 중에서 호출, list[0].tno</h3>
${list[0].tno}
<h3>list 전체 중에서 호출, list[0].title</h3>
${list[0].title}
<h3>list 전체 호출</h3>
${list}


<h2>JSTL 연습장</h2>
<H3>반복문, foreach이용, var=변수명,items="데이터목록"</H3>
<ul>
    <c:forEach var="dto" items="${list}">
        <li>${dto}</li>
    </c:forEach>

</ul>
<H3>begin/end foreach"</H3>
<ul>
    <c:forEach var="dto" items="${list}" begin="1" end="5">
        <li>${dto}</li>
    </c:forEach>
</ul>


<H3>if</H3>
<ui>
    <c:forEach var="dto" items="${list}">
    <c:if test="${dto.tno % 2 == 0}">
        <li> 짝수 , ${dto}</li>
    </c:if>
    <c:if test="${dto.tno % 2 != 0}">
        <li>홀수, ${dto}</li>
    </c:if>
    </c:forEach>
</ui>

<H3>choose</H3>
<ui>
<c:forEach var="dto" items="${list}">
    <c:choose>
        <c:when test="${dto.tno % 2 == 0}">
            <li> 짝수 , ${dto}</li>
        </c:when>
        <c:otherwise>
            <li>홀수, ${dto}</li>
        </c:otherwise>
    </c:choose>
</c:forEach>
</ui>


<h2>JSTL 변수 설정하고 사용하는 방법</h2>
<c:set var="todoDTO" value="${list[0]}"/>

<c:forEach var="dto" items="${list}">
    <c:if test="${dto.tno == todoDTO.tno}">
        ${dto}
    </c:if>
</c:forEach>


</body>
</html>