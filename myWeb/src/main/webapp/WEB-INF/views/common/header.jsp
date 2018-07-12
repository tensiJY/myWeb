<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="navbar navbar-expand-lg fixed-top navbar-light bg-light">
    <div class="container">
    	<c:if test="${empty sessionScope.UID}">
        	<a id="loginBtn" class="navbar-brand" href="#">login</a>
        </c:if>
        <c:if test="${not empty sessionScope.UID}">
        	<a id="logoutBtn" class="navbar-brand" href="#">logout</a>
        </c:if>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav">
                <!-- <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" id="themes">Themes <span class="caret"></span></a>
                    <div class="dropdown-menu" aria-labelledby="themes">
                        <a class="dropdown-item" href="../default/">Default</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="../cerulean/">Cerulean</a>
                        <a class="dropdown-item" href="../cosmo/">Cosmo</a>
                        <a class="dropdown-item" href="../cyborg/">Cyborg</a>
                        <a class="dropdown-item" href="../darkly/">Darkly</a>
                        <a class="dropdown-item" href="../flatly/">Flatly</a>
                        <a class="dropdown-item" href="../journal/">Journal</a>
                        <a class="dropdown-item" href="../litera/">Litera</a>
                        <a class="dropdown-item" href="../lumen/">Lumen</a>
                        <a class="dropdown-item" href="../lux/">Lux</a>
                        <a class="dropdown-item" href="../materia/">Materia</a>
                        <a class="dropdown-item" href="../minty/">Minty</a>
                        <a class="dropdown-item" href="../pulse/">Pulse</a>
                        <a class="dropdown-item" href="../sandstone/">Sandstone</a>
                        <a class="dropdown-item" href="../simplex/">Simplex</a>
                        <a class="dropdown-item" href="../sketchy/">Sketchy</a>
                        <a class="dropdown-item" href="../slate/">Slate</a>
                        <a class="dropdown-item" href="../solar/">Solar</a>
                        <a class="dropdown-item" href="../spacelab/">Spacelab</a>
                        <a class="dropdown-item" href="../superhero/">Superhero</a>
                        <a class="dropdown-item" href="../united/">United</a>
                        <a class="dropdown-item" href="../yeti/">Yeti</a>
                    </div>
                </li> -->
                <li class="nav-item">
                    <a class="nav-link" href="../help/">Help</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="http://blog.bootswatch.com">Blog</a>
                </li>
           <!--      <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" id="download">Sketchy <span class="caret"></span></a>
                    <div class="dropdown-menu" aria-labelledby="download">
                        <a class="dropdown-item" href="https://jsfiddle.net/bootswatch/gbuemo39/">Open in JSFiddle</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="../4/sketchy/bootstrap.min.css">bootstrap.min.css</a>
                        <a class="dropdown-item" href="../4/sketchy/bootstrap.css">bootstrap.css</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="../4/sketchy/_variables.scss">_variables.scss</a>
                        <a class="dropdown-item" href="../4/sketchy/_bootswatch.scss">_bootswatch.scss</a>
                    </div>
                </li> -->
            </ul>

            <!-- <ul class="nav navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="http://builtwithbootstrap.com/" target="_blank">Built With Bootstrap</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="https://wrapbootstrap.com/?ref=bsw" target="_blank">WrapBootstrap</a>
                </li>
            </ul> -->

        </div>
    </div>
</div>  
