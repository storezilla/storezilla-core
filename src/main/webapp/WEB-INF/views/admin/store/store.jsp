<div>
    <table class="ui celled structured table" border="1">
        <tr>
            <td id="at-td-breadcrumbs" style="border-style:none">
                <div class="ui breadcrumb">
                    <a class="section">Store</a>
                    <i class="right chevron icon divider"></i>
                    <a class="section">Add/Update Store</a>
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
                                        <input ng-model="store.storeId" type="hidden"/>
                                    </div>
                                    <div class="field">
                                        <label>Store Name</label>
                                        <input type="text" ng-model="store.storeName" placeholder="Store Name" />
                                    </div>
                                    <div class="field">
                                        <label path="storeURL">Store URL</label>
                                        <input type="text" ng-model="store.storeURL" placeholder="Store URL" />                                                
                                    </div>
                                    <div class="field">
                                        <label>Store Owner</label>
                                        <input type="text" ng-model="store.storeDetails.owner" placeholder="Store Owner"/>
                                    </div>
                                    <div class="field">
                                        <label>Address</label>
                                        <textarea ng-model="store.storeDetails.address"></textarea>
                                    </div>
                                    <div class="field">
                                        <label>Geocode</label>
                                        <input type="text" ng-model="store.storeDetails.geoCode" placeholder="Geocode"/>
                                    </div>
                                    <div class="field">
                                        <label>E-Mail</label>
                                        <input ng-model="store.storeDetails.eMail" type="text" placeholder="yourself@yourdomain.com"/>
                                    </div>
                                    <div class="field">
                                        <label>Telephone</label>
                                        <input ng-model="store.storeDetails.telePhone" type="text" placeholder="Telephone"/>
                                    </div>
                                    <div class="field">
                                        <label>Fax</label>
                                        <input ng-model="store.storeDetails.fax" type="text" placeholder="Fax"/>
                                    </div>
                                    <div class="field">
                                        <label>Image</label>
                                        <input type="text" placeholder="">
                                    </div>
                                    <div class="field">
                                        <label>Opening Times</label>
                                        <textarea ng-model="store.storeDetails.openingTimes"></textarea>
                                    </div>
                                    <div class="field">
                                        <label>Comment</label>
                                        <textarea ng-model="store.storeDetails.comment"></textarea>
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