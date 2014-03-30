/**
 * @author Ch32k0
 */
var ls = window.localStorage;
$(document).ready(function() {

	 $.ajax({
      url: 'http://collegelife.herokuapp.com/userlist',
      type: 'get',
      dataType: 'json',
      success: function (data) {
        console.log('success', data);
      },
      error: function (XMLHttpRequest, textStatus, errorThrown) {
        console.log('error', errorThrown);
      }
    });
    
    $("#Grades_panel").click(function(){
    	 $('html, body').animate({
        scrollTop: $("#Grades").offset().top
    },1500);
    });
});
