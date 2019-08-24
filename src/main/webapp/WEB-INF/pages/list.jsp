<%--
  Created by IntelliJ IDEA.
  User: zhouzhaojian
  Date: 8/24/19
  Time: 09:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute ("APP_PATH",request.getContextPath ());
%>

<%--
    web的路径问题，不以/开始的相对路径，找资源以当前资源的路径为基准，但是容易出问题
                以/开始的相对路径：找资源是以服务器的路径为标准
--%>
<html>
<head>
    <title>员工列表的页面</title>
    <%--引入jQuery--%>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.3.1.js"></script>
    <%--引入样式表--%>
    <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.css">
    <script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</head>
<body>
<%--搭建显示页面--%>


</body>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<%--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>
<%--!-- 最新的 Bootstrap 核心 JavaScript 文件 -->--%>
<%--<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>--%>
</html>
