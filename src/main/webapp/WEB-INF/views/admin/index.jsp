<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="storezilla-admin">
    <head>
        <%@include file="includes/head.jsp"%>
    </head>
    <body layout="column">      
        <md-toolbar layout="row" class="md-toolbar-tools">
                <header>
                    <jsp:include page="includes/header.jsp"></jsp:include>
                </header>
        </md-toolbar>
        <div flex layout="row">
            <jsp:include page="includes/menu.jsp"></jsp:include>
            <md-content flex>
                <div ng-view></div>
            </md-content>
            <footer>
                <jsp:include page="includes/footer.jsp"></jsp:include>
            </footer>
        </div>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.1.4.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular-animate.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular-aria.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular-messages.min.js"></script>        
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular-material.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular-route.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/app.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/services/storeservice.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/services/CategoryService.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/services/ManufacturerService.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/services/ProductService.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/controllers/OpenStoreController.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/controllers/CategoryController.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/controllers/ProductController.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/textAngular-rangy.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/textAngular-sanitize.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/textAngular.min.js"></script>
    </body>
</html>