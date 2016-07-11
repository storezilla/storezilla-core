<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div>
    <table class="ui celled structured table" border="1">
        <tr>
            <td id="at-td-breadcrumbs" style="border-style:none">
                <div class="ui breadcrumb">
                    <a class="section">Product</a>
                    <i class="right chevron icon divider"></i>
                    <a class="section">Add/Update Product</a>
                </div>                        
            </td>
            <td style="border-style:none;">
                <button type ="submit" class="ui green icon submit button" data-content="Save" data-variation="inverted" ng-click="SaveProduct()">
                    <i class="save icon"></i>
                </button>
            </td>
            <td style="border-style:none">
                <button type="submit" class="ui blue icon button" data-content="Undo" data-variation="inverted">
                    <i class="undo icon"></i>
                </button>
            </td>
        </tr>
        <tr>
            <td colspan="3" style="border-style:none">
                <div id="at-store">
                    <div class="ui negative message">
                        <i class="close icon"></i>
                        <div class="header">
                            We're sorry we can't apply that discount
                        </div>
                        <p>That offer has expired</p>
                    </div>
                    <div class="container">
                        <div class="ui tab segment active" data-tab="at-store-tabs">
                            <div class="ui top attached tabular menu">
                                <a class="item active" data-tab="at-sub-general">General</a>
                            </div>        
                            <div class="ui bottom attached tab segment active" data-tab="at-sub-general">
                                <div class="ui form">
                                    <div class="hidden">
                                        <input ng-model="product.productId" type="hidden"/>
                                    </div>
                                    <div class="field">
                                        <label>Product Name</label>
                                        <input type="text" ng-model="product.productName" placeholder="Product Name" />
                                    </div>
                                    <div class="field">
                                        <label>Product Description</label>
                                        <div text-angular ng-model="product.productDescription"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </td>
        </tr>
    </table>
</div>    