<%-- 
    Document   : listStores
    Created on : Dec 14, 2014, 1:24:57 PM
    Author     : Mitesh Manani
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div id="at-content">
    <form:form commandName="store">
        <div id="at-liststore-main-table">
            <table class="ui celled structured table" style="border-style:none">
                <tr>
                    <td id="at-td-breadcrumbs" style="border-style:none">
                        <div class="ui breadcrumb">
                            <a class="section">Store</a>
                                <i class="right chevron icon divider"></i>
                            <a class="section">Store List</a>
                        </div>                        
                    </td>
                    <td id="at-td-buttonicon1"  style="border-style:none">
                        <button name="at-button-add-store" class="ui blue icon button" type="submit" data-content="Add New" data-variation="inverted">
                            <i class="plus icon"></i>
                        </button>
                    </td>
                    <td id="at-td-buttonicon2" style="border-style:none">
                        <button name="at-button-delete-store" class="ui red icon button" type="submit" data-content="Delete" data-variation="inverted">
                            <i class="remove icon"></i>
                        </button>
                    </td>
                </tr>
                <tr>
                    <td colspan="3" style="border-style:none">
                        <table class="ui celled structured table">
                            <thead class="full-width">
                            <th>
                            <div class="ui big label">
                                <i class="list icon"></i> Store List
                            </div>
                            </th>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>
                                        <table class="ui celled structured table" id="at-inner-storelist-table" border="1">
                                            <thead class="full-width">
                                                <tr>
                                                    <th>
                                            <div class="ui checkbox">
                                                <input type="checkbox"> <label></label>
                                            </div>
                                                <form:hidden path="storeId"></form:hidden>
                                            </th>
                                            <th>Store Name</th>
                                            <th>Store URL</th>
                                            <th>Action</th>
                                </tr>
                                </thead>
                            <tbody>
                                <c:forEach items="${listOpenStores}" var="store">
                                    <tr>
                                        <td id="at-tr-storerow${store.storeId}">
                                            <div class="ui checkbox">
                                                <input id="at-storeid-checkbox" type="checkbox" value="${store.storeId}"> <label></label>
                                            </div>
                                        </td>
                                        <td>${store.storeName}</td>
                                        <td>${store.storeURL}</td>
                                        <td>
                                            <button name="at-store-edit-btn" type="submit" class="ui primary icon button" data-content="Edit Store" data-variation="inverted">
                                                <i class="pencil icon"></i>
                                            </button>
                                        </td>
                                    </tr>
                                </c:forEach>            
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
        <script>
            $('.button').popup();            
            $('.ui .checkbox').checkbox({
                onChecked : function() {
                    $(this).parent().parent().parent().addClass('active');
                },
                onUnchecked : function() {
                    $(this).parent().parent().parent().removeClass('active');
                }
            });
            $('#store').submit(function() { // catch the form's submit event
                $('.button').popup('hide');
                var submitbutton = $(this.id).context.activeElement;   
                if(submitbutton.name==='at-button-delete-store') {
                    var storeid = $(".ui .checkbox.checked").children("input[id='at-storeid-checkbox']").val();
                    $("#store").attr('action','remove/'+storeid);
                }else if(submitbutton.name==='at-store-edit-btn') {
                    var storeid = $(submitbutton).parent().siblings('td[id*="at-tr-storerow"]').find('input').val();
                    $("#store").attr('action','edit/'+storeid);                    
                }else if(submitbutton.name==='at-button-add-store') {
                    $("#store").attr('action','store/create');                    
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
    </form:form>
</div>