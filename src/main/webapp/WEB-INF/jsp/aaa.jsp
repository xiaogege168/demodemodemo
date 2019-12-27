<%@ page import="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>菜鸟教程(runoob.com)</title>
</head>
<body>
Hello5555555555555555 World!<br/>


<c:forEach var="T" items="a">
    <h1 >${T.name}</h1>
    <h1 >${T.countryCode}</h1>
    <h1 >${T.district}</h1>
    <br/>
</c:forEach>
<%
    out.println("你的 IP 地址 " + request.getRemoteAddr());
%>

<table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
        <th>Header Name</th><th>Header Value(s)</th>
    </tr>
    <%
        Enumeration headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String paramName = (String)headerNames.nextElement();
            out.print("<tr><td>" + paramName + "</td>\n");
            String paramValue = request.getHeader(paramName);
            out.println("<td> " + paramValue + "</td></tr>\n");
        }

    %>

</table>

<%--${list}.code <br/>--%>
<%--${list}.name <br/>--%>
<%--${list}.continent <br/>--%>
<%--${list}.region <br/>--%>
<%--${list}.surfacearea <br/>--%>

</body>
</html>