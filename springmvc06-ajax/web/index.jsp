<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/22
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>$Title$</title>
        <script src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.js"></script>
        <script type="text/javascript">


            function f() {
                $.ajax({
                    url: "${pageContext.request.contextPath}/a1",
                    type: "post",
                    data: {
                        "name": $("#username").val()
                    },
                    success: function (data, status) {
                        console.log("data:" + data)
                        console.log("status:" + status)
                    }
                })
            }


        </script>
    </head>
    <body>
        <%--失去焦点的时候，发起一个请求到后台--%>
        用户名：<input type="text" id="username" onblur="f()">
    </body>
</html>
