<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div>
    <table class="ui celled structured table" border="1">
        <tr>
            <td id="at-td-breadcrumbs" style="border-style:none">
                <div class="ui breadcrumb">
                    <a class="section">Category</a>
                    <i class="right chevron icon divider"></i>
                    <a class="section">Add/Update Category</a>
                </div>                        
            </td>
            <td id="at-td-savebutton" style="border-style:none;">
                <button name="at-store-savebutton" type ="submit" class="ui green icon submit button" data-content="Save" data-variation="inverted" ng-click="SaveStore()">
                    <i class="save icon"></i>
                </button>
            </td>
            <td id="at-td-cancelbutton" style="border-style:none">
                <button name="at-store-cancelbutton" type="submit" class="ui blue icon button" data-content="Undo" data-variation="inverted">
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
                    <div class="container" id="context1">
                        <div class="ui tab segment active" data-tab="at-store-tabs">
                            <div class="ui top attached tabular menu">
                                <a class="item active" data-tab="at-sub-general">General</a>
                            </div>        
                            <div class="ui bottom attached tab segment active" data-tab="at-sub-general">
                                <div class="ui form">
                                    <div class="hidden">
                                        <input ng-model="category.categoryId" type="hidden"/>
                                    </div>
                                    <div class="field">
                                        <label>Category Name</label>
                                        <input type="text" ng-model="category.categoryName" placeholder="Category Name" />
                                    </div>
                                    <div class="field">
                                        <label>Category Description</label>
                                        <div text-angular></div>
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