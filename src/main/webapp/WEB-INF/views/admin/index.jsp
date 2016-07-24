<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="storezilla-admin">
    <head>
        <%@include file="includes/head.jsp"%>
    </head>
    <body>      
        <div id="at-container">
            <header>
                <jsp:include page="includes/header.jsp"></jsp:include>
            </header>
            <table class="ui celled structured table" border="1">
                <tbody>
                    <tr>    
                        <td id="at-tr-menu" rowspan="3">
                            <jsp:include page="includes/menu.jsp"></jsp:include>
                        </td>
                    </tr>
                    <tr>
                         <td>
                            <div ng-view></div>
                        </td>
                    </tr>
                </tbody>
            </table>
            <footer>
                <jsp:include page="includes/footer.jsp"></jsp:include>
            </footer>
        </div>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.1.4.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular-route.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/semantic.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/app.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/services/storeservice.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/services/CategoryService.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/services/ProductService.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/controllers/OpenStoreController.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/controllers/CategoryController.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/controllers/ProductController.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/textAngular-rangy.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/textAngular-sanitize.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/textAngular.min.js"></script>
    </body>
</html>