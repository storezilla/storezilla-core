<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div id="at-content">
    <c:url var="addAction" value="/store/add" ></c:url>    
    <form:form action="${addAction}" commandName="store">
        <table class="ui celled structured table" style="border-style:none">
            <tr>
                <td id="at-td-breadcrumbs" style="border-style:none">
                    <div class="ui breadcrumb">
                        <a class="section">Store</a>
                        <i class="right chevron icon divider"></i>
                        <a class="section">Add/Update Store</a>
                    </div>                        
                </td>
                <td id="at-td-savebutton" style="border-style:none;">
                    <button name="at-store-savebutton" type ="submit" class="ui green icon submit button" data-content="Save" data-variation="inverted">
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
                            <c:if test="${!empty exception.exceptionMsg}">
                                <div class="ui negative message">
                                    <i class="close icon"></i>
                                    <div class="header">
                                        We're sorry we can't apply that discount
                                    </div>
                                    <p>That offer has expired</p>
                                </div>
                            </c:if>
                            <div class="container" id="context1">
                                <div class="ui tab segment active" data-tab="at-store-tabs">
                                    <div class="ui top attached tabular menu">
                                        <a class="item active" data-tab="at-sub-general">General</a>
                                    </div>        
                                    <div class="ui bottom attached tab segment active" data-tab="at-sub-general">
                                        <div class="ui form">
                                            <div class="hidden">
                                                <form:hidden path="storeId"></form:hidden>
                                            </div>
                                            <div class="field">
                                                <form:label path="storeName">Store Name</form:label>
                                                <form:input type="text" path="storeName" placeholder="Store Name" />
                                            </div>
                                            <div class="field">
                                                <form:label path="storeURL"></form:label>
                                                <form:input type="text" path="storeURL" placeholder="Store URL" />                                                
                                            </div>
                                            <div class="field">
                                                <form:label path="storeDetails.owner">Store Owner</form:label>
                                                <form:input type="text" path="storeDetails.owner" placeholder="Store Owner"/>
                                            </div>
                                            <div class="field">
                                                <form:label path="storeDetails.address">Address</form:label>
                                                <form:textarea path="storeDetails.address"></form:textarea>
                                                </div>
                                                <div class="field">
                                                <form:label path="storeDetails.geoCode">Geocode</form:label>
                                                <form:input type="text" path="storeDetails.geoCode" placeholder="Geocode"/>
                                            </div>
                                            <div class="field">
                                                <form:label path="storeDetails.eMail">E-Mail</form:label>
                                                <form:input path="storeDetails.eMail" type="text" placeholder="yourself@yourdomain.com"/>
                                            </div>
                                            <div class="field">
                                                <form:label path="storeDetails.telePhone">Telephone</form:label>
                                                <form:input path="storeDetails.telePhone" type="text" placeholder="Telephone"/>
                                            </div>
                                            <div class="field">
                                                <form:label path="storeDetails.fax">Fax</form:label>
                                                <form:input path="storeDetails.fax" type="text" placeholder="Fax"/>
                                            </div>
                                            <div class="field">
                                                <label>Image</label>
                                                <input type="text" placeholder="">
                                            </div>
                                            <div class="field">
                                                <form:label path="storeDetails.openingTimes">Opening Times</form:label>
                                                <form:textarea path="storeDetails.openingTimes"/>
                                            </div>
                                            <div class="field">
                                                <form:label path="storeDetails.comment">Comment</form:label>
                                                <form:textarea path="storeDetails.comment"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <script>
                                    $('#context1 .menu .item')
                                            .tab({
                                        context: $('#context1')
                                    });
                                    $('.button').popup();            
                                    $('#store').submit(function() { // catch the form's submit event
                                        $('.button').popup('hide');
                                        var submitbutton = $(this.id).context.activeElement;   
                                        if(submitbutton.name==='at-store-savebutton') {
                                            $("#store").attr('action','store/add/');
                                        }else if(submitbutton.name==='at-store-cancelbutton') {
                                            $("#store").attr('action','cancelsave');                    
                                        }
                                        $.ajax({ // create an AJAX call...
                                            data: $(this).serialize(), // get the form data
                                            type: $(this).attr('method'), // GET or POST
                                            url: $(this).attr('action'), // the file to call
                                            success: function(response) { // on success..
                                                $('#at-tr-pages-section').html(response); // update the DIV
                                            }
                                        }); 
                                        return false; // cancel original event to prevent form submitting
                                    });
                                </script>
                            </div>
                        </div>    
                    </td>
                </tr>
        </form:form>        
</div>