$(document).ready(function(){
    $("form").submit(function(){
 if ($('input:checkbox').filter(':checked').length < 2){
        alert("Check at least two Skills!");
 return false;
 }
    });
});