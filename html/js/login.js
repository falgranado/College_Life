/**
 * @author Ch32k0
 */
$(document).ready({
	$("#login").click(
		function(){
			$.ajax({
		      url: 'http://collegelife.herokuapp.com/userlist',
		      type: 'get',
		      dataType: 'json',
		      success: function (data) {
		      	 var tableContent = '';
				     // For each item in our JSON
				    $.each(data, function(){
				      if($("#student_number").val() == this._id){
				      	window.location("platform.html");
				      }else{
				      	window.location("register.html")
				      }
				    });
				
				    // Inject the whole content string into our existing HTML table
				    $('#overview_table').append(tableContent);
		      },
		      error: function (XMLHttpRequest, textStatus, errorThrown) {
		        console.log('error', errorThrown);
		      }
		  });
		 }
	});
});
