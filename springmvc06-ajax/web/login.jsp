<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/23
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>登录</title>
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
                            $("#checkText1").css("display","inline")
                        }else{
                            $("#checkText1").css("display","none")
                        }
                    }
                })
            }
            function fun() {
                $.ajax({
                    url: "${pageContext.request.contextPath}/register",
                    data: {
                        "username": $("#username").val()
                    },
                    success: function (data) {
                        if (data === false){
                            $.ajax({
                                url: "${pageContext.request.contextPath}/login",
                                data: {
                                    "username": $("#username").val(),
                                    "password": $("#password").val()
                                },
                                success: function (data) {
                                    if (data === true){
                                        $("#checkPassword1").css("display","inline")
                                        $("#checkPassword2").css("display","none")
                                    }else{
                                        $("#checkPassword1").css("display","none")
                                        $("#checkPassword2").css("display","inline")
                                    }
                                }
                            })
                        }
                    }
                })
            }

        </script>
    </head>
    <body>
        <h2>注册账号</h2>
        账号：<input type="text" name="username" id="username" onblur="f()">
        <div id="checkText1" style="color: red;display: none">账号不存在</div><br>
        密码：<input type="text" name="password" id="password" onblur="fun()">
        <div id="checkPassword1" style="color: green;display: none">密码正确</div>
        <div id="checkPassword2" style="color: red;display: none">密码错误</div>
    </body>
</html>
