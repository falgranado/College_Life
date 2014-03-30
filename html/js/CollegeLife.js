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
		     // For each item in our JSON
		    $.each(data, function(){
		      $("#name_under_picture").append(this.name);
		      $("#user").append(this.name);
		      $("#student_number").append(this._id);
		      $("#email_under_picture").append(this.email);
		      $("#concentration").append(this.concentration);
		    });
		
		    // Inject the whole content string into our existing HTML table
		    $('#overview_table').append(tableContent);
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
    $("#Professors_panel").click(function(){
    	 $('html, body').animate({
        scrollTop: $("#Professors").offset().top
    },1500);
    });
});
