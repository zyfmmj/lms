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
                <c:choose>
                    <c:when test="${result != 0}">
                        <h5 class="text-center">添加运单<span>${result}</span>成功</h5>
                    </c:when>
                    <c:otherwise>
                        <h5 class="text-center">添加失败</h5>
                    </c:otherwise>
                </c:choose>
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
            location.href="/newSendBill";
        }
    )
</script>
</body>
</html>
