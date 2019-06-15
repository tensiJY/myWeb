<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<title>Document</title>
<%@ include file="../common/common.jsp"%>
<script>
	$(function() {
		var Util = Util || {};

		Util.Valid = new Valid({
			debugEnabled : true
		});
		
		$("#frmBtn").on("click", function(){
			if(Util.Valid.isNull($("#btitle").val())){
				return $("#btitle").focus();
			}
			
			if(Util.Valid.isEmpty($("#btitle").val())){
				return $("#btitle").focus();
			}
			
		});
		
	});

	function Wrapper() {
		this.config = {
			debugEnabled : false
		}
	}

	Wrapper.prototype = {
		constructor : Wrapper,
		setConfig : function(args) {
			this.config = args;
		},
		debugMessage : function(args) {
			if (this.config.debugEnabled) {
				console.log(args);
			}
		}

	}

	var Valid = (function() {
		var self = null;

		var obj = function(args) {
			self = this;
			if (args) {
				self.setConfig(args);
			}
			self.debugMessage("Created Valid");
		}

		obj.prototype = new Wrapper();

		obj.prototype.isNull = function(args) {
			if(args==null){
				self.debugMessage("isNull");
				return true;
			}
			return false;
		}
		
		obj.prototype.isEmpty = function(args){
			if(args.trim() == "" || args.trim().length==0){
				self.debugMessage("isEmpty");
				return true;
			}
			return false;
		}

		return obj;
	})();

	
</script>
</head>
<body>
	<%@ include file="../common/header.jsp"%>

	<form>
		<table>
			<tr>
				<td>작성자</td>
				<td><input type="text"
					value="<c:out value="${sessionScope.UID}"/>" id="bwriter"
					name="bwriter" readonly></td>
			</tr>
			<tr>
				<td>글제목</td>
				<td><input type="text" id="btitle" name="btitle"></td>
			</tr>
			<tr>
				<td>글내용</td>
				<td><textarea name="bcontent"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" id="frmBtn" value="전송하기"></td>
			</tr>
		</table>
	</form>

	<%@ include file="../common/footer.jsp"%>
</body>
</html>