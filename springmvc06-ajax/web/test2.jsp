<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/23
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <script src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.js"></script>
        <script type="text/javascript">

            function f() {
                $.ajax({
                    url: "${pageContext.request.contextPath}/a2",
                    success: function (data) {
                        console.log(data)
                        var html = ""
                        for (let i = 0; i < data.length; i++) {
                            html += "<tr>" +
                                "<td>" + data[i].name + "</td>" +
                                "<td>" + data[i].age + "</td>" +
                                "<td>" + data[i].sex + "</td>" +
                                "</tr>"
                        }
                        $("#content").html(html)
                    }
                })
            }

        </script>


    </head>
    <body>
        <input type="button" value="加载数据" onclick="f()" id="btn">
        <table>
            <thead>
            <tr>
                <td>姓名</td>
                <td>年龄</td>
                <td>性别</td>
            </tr>
            </thead>
            <tbody id="content">
            </tbody>
        </table>
    </body>
</html>
