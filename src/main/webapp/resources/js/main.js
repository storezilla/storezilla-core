$(document).ready(function() {
    $('#context1 .menu .item').tab({
        context: $('#context1')
    });
    $('body').on('click','#at-menu-item-store',function() {
        $("#at-tr-pages-section").load("listStores", function(responseTxt, statusTxt, xhr) {});
    });
});