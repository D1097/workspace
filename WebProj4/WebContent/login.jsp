<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Login</title>
</head>
<body>

<s:property value="LoginDTOList.get(0).username"/>さん、ようこそ

	<br>
	<table>
		<tbody>
			<tr>
				<th>username</th>
				<th>password</th>
			</tr>

			<s:iterator value="LoginDTOList">
				<tr>
					<td><s:property value="username"/></td>
					<td><s:property value="password"/></td>
				</tr>

			</s:iterator>

		</tbody>
	</table>
</body>
</html>