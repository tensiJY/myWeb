<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	
	<%@ include file="../common/common.jsp" %>
	<script>
		$(function(){
			$("#loginBtn").on('click', function(){
				alert('abcd');				
			});
		});
	</script>
	
</head>
<body>
<!-- header -->
  <%@ include file="../common/header.jsp" %>
    
<div class="row">
    <div class="col-lg-4">
        <div class="bs-component">
          
        </div>
    </div>
    <div class="col-lg-4">
        <div class="bs-component">
         
        </div>

    </div>
    <div class="col-lg-4">
       
    </div>
</div>

<div class="bs-docs-section">
    <div class="row">
        <div class="col-lg-12">
            <div class="page-header">
                <h1 id="typography">Typography</h1>
            </div>
        </div>
    </div>
</div>



<div id="source-modal" class="modal fade">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Source Code</h4>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            </div>
            <div class="modal-body">
                <pre contenteditable></pre>
            </div>
        </div>
    </div>
</div>
  
  
<!-- footer -->  
  <%@ include file="../common/footer.jsp" %>
</body>
</html>