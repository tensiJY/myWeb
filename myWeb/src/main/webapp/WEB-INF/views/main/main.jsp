<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<%@ include file="../common/common.jsp" %>
	<script>
		
	</script>
	
</head>
<body>
<!-- header -->
  <%@ include file="../common/header.jsp" %>
    
<div class="row">
    <div class="col-lg-4">
        <div class="bs-component">
            <h1>Heading 1</h1>
            <h2>Heading 2</h2>
            <h3>Heading 3</h3>
            <h4>Heading 4</h4>
            <h5>Heading 5</h5>
            <h6>Heading 6</h6>
            <h3>
                Heading
                <small class="text-muted">with muted text</small>
            </h3>
            <p class="lead">Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
        </div>
    </div>
    <div class="col-lg-4">
        <div class="bs-component">
            <h2>Example body text</h2>
            <p>Nullam quis risus eget <a href="#">urna mollis ornare</a> vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula.</p>
            <p><small>This line of text is meant to be treated as fine print.</small></p>
            <p>The following is <strong>rendered as bold text</strong>.</p>
            <p>The following is <em>rendered as italicized text</em>.</p>
            <p>An abbreviation of the word attribute is <abbr title="attribute">attr</abbr>.</p>
        </div>

    </div>
    <div class="col-lg-4">
        <a href="">
            <div class="bs-component">
            <h2>php</h2>
            <p class="text-muted">Fusce dapibus, tellus ac cursus commodo, tortor mauris nibh.</p>
            <p class="text-primary">Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p class="text-warning">Etiam porta sem malesuada magna mollis euismod.</p>
            <p class="text-danger">Donec ullamcorper nulla non metus auctor fringilla.</p>
            <p class="text-success">Duis mollis, est non commodo luctus, nisi erat porttitor ligula.</p>
            <p class="text-info">Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
            </div>
        </a>
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