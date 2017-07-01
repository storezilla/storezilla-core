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
                        <div class="ui top attached tabular menu">
                            <a class="item active" data-tab="at-sub-general">General</a>
                            <a class="item" data-tab="at-sub-data">Data</a>
                            <a class="item" data-tab="at-sub-links">Links</a>
                            <a class="item" data-tab="at-sub-attributes">Attributes</a>
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
                                <h4 class="ui dividing header"></h4>
                                <div class="field">
                                    <label>Product Description</label>
                                    <div text-angular ng-model="product.productDescription"></div>
                                </div>
                                <h4 class="ui dividing header"></h4>
                                <div class="field">
                                    <label>Meta Tag Title</label>
                                    <input type="text" ng-model="" placeholder="Meta Tag Title" />
                                </div>
                                <h4 class="ui dividing header"></h4>
                                <div class="field">
                                    <label>Meta Tag Description</label>
                                    <textarea ng-model="" placeholder="Meta Tag Description"></textarea>
                                </div>
                                <h4 class="ui dividing header"></h4>
                                <div class="field">
                                    <label>Meta Tag Keywords</label>
                                    <textarea ng-model="" placeholder="Meta Tag Keywords"></textarea>
                                </div>
                                <h4 class="ui dividing header"></h4>
                                <div class="field">
                                    <label>Product Tags</label>
                                    <input type="text" ng-model="" placeholder="Product Tags" />
                                </div>
                            </div>
                        </div>
                        <div class="ui bottom attached tab segment" data-tab="at-sub-data">                                
                            <div class="ui form">
                                <div class="field">
                                    <label>Image</label>
                                    <input type="text" placeholder="Upload Image"/>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>Model</label>
                                    <input type="text" placeholder="Model"/>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>SKU</label>
                                    <input type="text" placeholder="SKU"/>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>Location</label>
                                    <input type="text" placeholder="Location"/>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>Price</label>
                                    <input type="text" placeholder="Price"/>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>Tax Class</label>
                                    <select class="ui fluid dropdown">
                                        <option value="0" selected>--None--</option>
                                        <option value="1">Taxable Goods</option>
                                    </select>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>Quantity</label>
                                    <input type="text" placeholder="Quantity"/>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>Minimum Quantity</label>
                                    <input type="text" placeholder="Minimum Quantity"/>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>Substract Stock</label>
                                    <select class="ui fluid dropdown">
                                        <option value="0" selected>--None--</option>
                                        <option value="1">Yes</option>
                                        <option value="2">No</option>
                                    </select>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>Out of Stock Status</label>
                                    <select class="ui fluid dropdown">
                                        <option value="0" selected>--None--</option>
                                        <option value="1">Pre-Order</option>
                                        <option value="2">In-Stock</option>
                                        <option value="3">Out of Stock</option>
                                    </select>
                                </div>
                                <div class="ui divider"></div>
                                <div class="inline fields">
                                    <label>Required Shipping</label>
                                    <div class="ui toggle checkbox">
                                        <input type="checkbox" class="hidden">
                                    </div>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>Date Available</label>
                                    <div class="ui action input">
                                        <input type="text" placeholder="Date Available">
                                        <button class="ui icon button">
                                            <i class="calendar icon"></i>
                                        </button>
                                    </div>
                                </div>
                                <div class="ui divider"></div>
                                <div class="inline fields">
                                    <label>Dimensions (L x W x H)</label>
                                    <div class="field">
                                        <input type="text" placeholder="Length">
                                    </div>
                                    <div class="field">
                                        <input type="text" placeholder="Width">
                                    </div>
                                    <div class="field">
                                        <input type="text" placeholder="Height">
                                    </div>
                                </div>
                                <div class="ui divider"></div>
                                <div class="field">
                                    <label>Status</label>
                                    <select class="ui fluid dropdown">
                                        <option value="0" selected>--None--</option>
                                        <option value="1">Enabled</option>
                                        <option value="2">Disabled</option>
                                    </select>
                                </div>
                                <div class="ui section divider"></div>
                                <div class="field">
                                    <label>Sort Order</label>
                                    <input type="text" placeholder="Sort Order"/>
                                </div>
                            </div>
                        </div>
                        <div class="ui bottom attached tab segment" data-tab="at-sub-links">                                
                            <div class="ui form">
                                <div class="field">
                                    <label>Manufacturer</label>
                                    <!--
                                        <div class="ui fluid selection dropdown">
                                            <input name="manufacturerId" type="hidden" ng-model="product.manufacturer.manufacturerId"/>
                                            <i class="dropdown icon"></i>	
                                            <div class="text">Select Manufacturer</div>                                        
                                            <div class="menu">
                                                <div data-value="{{manufacturer.manufacturerId}}" class="item" ng-repeat="manufacturer in manufacturers" ng-selected="product.manufacturer.manufacturerId">
                                                    {{manufacturer.manufacturerName}}
                                                </div>
                                            </div>
                                        </div>
                                    -->
                                   <select required class="ui dropdown" ng-model="product.manufacturer.manufacturerId" ng-options="manufacturer.manufacturerId as manufacturer.manufacturerName for manufacturer in manufacturers" id="selectmanufacturer"></select>
<!--                                   
                                   <select required class="ui dropdown" ng-model="product.manufacturer.manufacturerId">
                                       <option ng-repeat="manufacturer in manufacturers" value="{{manufacturer.manufacturerId}}">{{manufacturer.manufacturerName}}</option>
                                   </select>
-->
                                </div>
                                <div class="ui section divider"></div>
                                <div class="field">
                                    <label>Categories</label>
                                    <div class="ui fluid multiple search special selection dropdown">
                                        <input type="hidden">
                                        <i class="dropdown icon"></i>
                                        <div class="default text">Select Multiple Categories</div>
                                        <div class="menu">
                                            <div class="item" data-value="in"><i class="in flag"></i>India</div>
                                        </div>
                                    </div>
                                </div>                                    
                                <div class="ui section divider"></div>
                                <div class="field">
                                    <label>Filters</label>
                                    <div class="ui fluid multiple search special selection dropdown">
                                        <input type="hidden">
                                        <i class="dropdown icon"></i>
                                        <div class="default text">Select Multiple Filters</div>
                                        <div class="menu">
                                            <div class="item" data-value="in"><i class="in flag"></i>India</div>
                                        </div>
                                    </div>
                                </div>
                                <div class="ui section divider"></div>
                                <div class="field">
                                    <label>Stores</label>
                                    <div class="ui fluid multiple search special selection dropdown">
                                        <input type="hidden">
                                        <i class="dropdown icon"></i>
                                        <div class="default text">Select Multiple Stores</div>
                                        <div class="menu">
                                            <div class="item" data-value="in"><i class="in flag"></i>India</div>
                                        </div>
                                    </div>
                                </div>
                                <div class="ui section divider"></div>
                                <div class="field">
                                    <label>Related Products</label>
                                    <div class="ui fluid multiple search special selection dropdown">
                                        <input type="hidden">
                                        <i class="dropdown icon"></i>
                                        <div class="default text">Select Related Products</div>
                                        <div class="menu">
                                            <div class="item" data-value="in"><i class="in flag"></i>India</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="ui bottom attached tab segment" data-tab="at-sub-attributes">                                
                            <div class="ui form">
                                <table class="ui compact celled definition table">
                                    <thead class="full-width">
                                        <tr>
                                            <th>Attribute Name</th>
                                            <th>Attribute Value</th>
                                            <th>Add/Remove Attribute</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr ng-repeat="attribute in product.attributes">
                                            <td class="collapsing">
                                                <div class="ui input">
                                                    <input type="text" ng-model="attribute.name" placeholder="Name"> <label></label>
                                                </div>
                                            </td>
                                            <td>
                                                <div class="ui input">
                                                    <textarea type="text" rows="4" ng-model="attribute.value" placeholder="Value"></textarea> <label></label>
                                                </div>
                                            </td>
                                            <td>
                                                <button class="ui red icon button" ng-click="removeAttribute($index)"><i class="remove icon"></i></button>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="2"></td>
                                            <td>
                                                <button class="ui blue icon button" ng-click="addRow()"><i class="add icon"></i></button>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>    
                        </div>    
                    </div>
                </div>
            </td>
        </tr>
    </table>
</div>    