<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/23
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>注册</title>
        <script src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.js"></script>
        <script type="text/javascript">
            function f() {
                $.ajax({
                    url: "${pageContext.request.contextPath}/register",
                    data: {
                        "username": $("#username").val()
                    },
                    success: function (data) {
                        if (data === true){
                            $("#checkText2").css("display","inline")
                            $("#checkText1").css("display","none")
                        }else{
                            $("#checkText1").css("display","inline")
                            $("#checkText2").css("display","none")
                        }
                    }
                })
            }

        </script>
    </head>
    <body>
        <h2>注册账号</h2>
        账号：<input type="text" name="username" id="username" onblur="f()">
        <div id="checkText1" style="color: red;display: none">该账号已被注册</div>
        <div id="checkText2" style="color: green;display: none">该账号可用</div><br>
        密码：<input type="text" name="password">
    </body>
</html>
