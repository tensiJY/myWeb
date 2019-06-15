<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<%@ include file="../common/common.jsp" %>
</head>
<body>
<%@ include file="../common/header.jsp" %>
<script type="text/javascript">
	$(function(){
		$("#frmBtn").on("click", function(){
			$(location).attr("href", "./form.do");
		});
	});
</script>

<table>
	<tr>
		<td>연번</td>
		<td>작성자</td>
		<td>제목</td>
		<td>등록일</td>
	</tr>
			
	<c:if test="${Board.size() == 0}">
	<tr>
		<td colspan="4">데이타가 없습니다.</td>
	</tr>
	</c:if>
	<c:if test="${Board.size() gt 0}">
	<c:forEach var="BoardVO" items="${Board}">
	<tr>
		<td><c:out value="${BoardVO.bno}"/></td>
		<td><c:out value="${BoardVO.bwriter}"/></td>
		<td><c:out value="${BoardVO.btitle}"/></td>
		<td></td>
	</tr>
	</c:forEach>
	</c:if>
	<tr>
		<td colspan="4">
			<input type="button" id="frmBtn" value="글쓰기">
		</td>
	</tr>
	</table>

<%@ include file="../common/footer.jsp" %>
  
</body>
</html>