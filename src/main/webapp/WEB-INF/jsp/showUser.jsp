<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="userInfo">

    用户名：<form:input path="username"/>
    <%-- 密码：<form:input path="password"/> --%>
    密码：<form:password path="password" showPassword="true"/><br>
    描述：<form:textarea path="description" cols="4" rows="5"/><br>
    爱好：<form:checkboxes items="${hobbyCollection}" path="myHobbies"/><br>
    爱好：<form:checkboxes items="${postsCollection}" path="posts"/><br>
    性别：<form:radiobutton path="sex"  value="男"/>男
    <form:radiobutton path="sex"  value="女"/>女
    籍贯：<form:select path="origin">
            <form:options items="${originCollection}"/>
</form:select>


</form:form>
</body>
</html>
