<%-- 
    Document   : listStores
    Created on : Dec 14, 2014, 1:24:57 PM
    Author     : Mitesh Manani
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div id="at-content">
    <table class="ui celled structured table" style="border-style:none">
        <tr>
            <td id="at-td-breadcrumbs" style="border-style:none">
                <div class="ui breadcrumb">
                    <a class="section">Store</a>
                    <i class="right chevron icon divider"></i>
                    <a class="section">Store List</a>
                </div>                        
            </td>
            <td style="border-style:none">
                <a class="ui right floated blue button" href="#/addstore" data-content="Add New" data-variation="inverted">
                    <i class="plus icon"></i>Add Store
                </a>
            </td>
        </tr>
        <tr>
            <td colspan="3" style="border-style:none">
                <table class="ui celled structured table">
                    <thead class="full-width">
                    <th>
                        <h5 class="ui header">
                            <i class="list icon"></i>
                            <div class="content">Store List</div>
                        </h5>
                    </th>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <table class="ui celled structured table" border="1">
                                    <thead class="full-width">
                                        <tr>
                                            <th>Store Name</th>
                                            <th>Store URL</th>
                                            <th>Edit</th>
                                            <th>Remove</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr ng-repeat="store in listStores">
                                            <td>{{store.storeName}}</td>
                                            <td>{{store.storeURL}}</td>
                                            <td>
                                                <a class="ui primary icon button" data-content="Edit Store" data-variation="inverted" href="#/editstore/{{$index}}">
                                                    <i class="pencil icon"></i>
                                                </a>
                                            </td>
                                            <td>
                                                <a class="ui red icon button" data-content="Remove Store" data-variation="inverted" href="#/removestore/{{store.storeId}}">
                                                    <i class="remove icon"></i>
                                                </a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </td>
        </tr>
    </table>        
</div>