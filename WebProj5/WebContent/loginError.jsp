<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./style.css">
<title>LoginERROR</title>
</head>
<body>

	<h1>エラーが発生しました！</h1>

	<s:if test='(#session.loginDTOList.get(0).username)=="該当なし"'>
	該当者はいませんでした。
	</s:if>

	<br>
	<table>
		<tbody>
			<tr>
				<th>USERNAME</th>
				<th>PASSWORD</th>
			</tr>
		</tbody>
	</table>
	<s:iterator>
				<tr>
					<td><s:property value="username"/></td>
					<td><s:property value="password"/></td>
				</tr>
			</s:iterator>
</body>
</html>