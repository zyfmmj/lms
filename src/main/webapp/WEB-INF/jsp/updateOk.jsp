<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/6/25
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>请点击返回</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.css" />
</head>
<body>
    <div>
        <div>
            <div>
                <div>
                    <h5 class="text-center">修改运单成功</h5>
                </div>
                <div class="text-center">
                    <input type="button" id="btn-exit" class="btn" value="返回" />
                </div>
            </div>
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/static/js/jquery1.9.0.min.js"></script>
<script>
    $("#btn-exit").click(
        function () {
            location.href="/list";
        }
    )
</script>
</body>
</html>
