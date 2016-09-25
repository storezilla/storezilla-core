<%-- 
    Document   : listStores
    Created on : Dec 14, 2014, 1:24:57 PM
    Author     : Mitesh Manani
--%>
<div id="at-content">
    <table class="ui celled structured table" style="border-style:none">
        <tr>
            <td id="at-td-breadcrumbs" style="border-style:none">
                <div class="ui breadcrumb">
                    <a class="section">Category</a>
                    <i class="right chevron icon divider"></i>
                    <a class="section">Category List</a>
                </div>                        
            </td>
            <td style="border-style:none">
                <a class="ui right floated blue button" href="#/addcategory" data-content="Add New" data-variation="inverted">
                    <i class="plus icon"></i>Add Category
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
                            <div class="content">Category List</div>
                        </h5>
                    </th>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <table class="ui celled structured table" border="1">
                                    <thead class="full-width">
                                        <tr>
                                            <th>Category Name</th>
                                            <th>Sort Order</th>
                                            <th>Edit</th>
                                            <th>Delete</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr ng-repeat="category in categories">
                                            <td>{{category.categoryName}}</td>
                                            <td>{{category.sortOrder}}</td>
                                            <td>
                                                <a class="ui primary icon button" data-content="Edit Category" data-variation="inverted" ng-click="editCategory(category.categoryId)">
                                                    <i class="pencil icon"></i>
                                                </a>
                                            </td>
                                            <td>
                                                <a class="ui red icon button" data-content="Remove Category" data-variation="inverted" href="#/removecategory/{{category.categoryId}}">
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