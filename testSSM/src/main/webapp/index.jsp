<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<script src="js/jquery.min.js"></script>
<body>
<h2>Hello World!</h2>
<a href="account/findAll">查找所有</a>
<form action="account/saveAccount" method="post">
    姓名：<input type="text" name="name"><br/>
    金额：<input type="text" name="money"><br/>
    <input type="submit" value="保存用户"/>
</form>

<br/>
<hr/>
<form action="account/transfor" method="post">
    用户一：<input type="text" name="id1"><br>
    用户二：<input type="text" name="id2"><br>
    金 额 ：<input type="text" name="money"><br>
    <input type="submit" value="转账"/>

</form>
</body>
</html>