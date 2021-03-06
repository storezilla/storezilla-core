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
                    <a class="section">Product</a>
                    <i class="right chevron icon divider"></i>
                    <a class="section">Product List</a>
                </div>                        
            </td>
            <td style="border-style:none">
                <a class="ui right floated blue button" href="#/addproduct" data-content="Add New" data-variation="inverted">
                    <i class="plus icon"></i>Add Product
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
                            <div class="content">Product List</div>
                        </h5>
                    </th>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <table class="ui celled structured table" border="1">
                                    <thead class="full-width">
                                        <tr>
                                            <th>Image</th>
                                            <th>Product Name</th>
                                            <th>Model</th>
                                            <th>Price</th>
                                            <th>Quantity</th>
                                            <th>Status</th>
                                            <th>Edit</th>
                                            <th>Remove</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr ng-repeat="product in products">
                                            <td>{{product.productName}}</td>
                                            <td>{{product.productDescription}}</td>
                                            <td>{{product.productDescription}}</td>
                                            <td>{{product.productDescription}}</td>
                                            <td>{{product.productDescription}}</td>
                                            <td>{{product.productDescription}}</td>
                                            <td>
                                                <button class="ui primary icon button" data-content="Edit Product" data-variation="inverted" ng-click="editProduct(product.productId)">
                                                    <i class="pencil icon"></i>
                                                </button>
                                            </td>
                                            <td>
                                                <button class="ui red icon button" data-content="Remove Product" data-variation="inverted" ng-click="removeProduct(product.productId)">
                                                    <i class="remove icon"></i>
                                                </button>
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