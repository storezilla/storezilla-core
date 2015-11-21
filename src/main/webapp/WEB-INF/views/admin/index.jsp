<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
                            <div id="at-tr-pages-section">
                                <jsp:include  page="includes/listStores.jsp"></jsp:include>
                            </div>
                        </td>
                    </tr>
                </tbody>
            </table>
            <footer>
                <jsp:include page="includes/footer.jsp"></jsp:include>
            </footer>
        </div>
    </body>
</html>