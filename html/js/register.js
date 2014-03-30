/**
 * @author Ch32k0
 */
$(document).ready(function(){
	var number;
	var name;
	var email;
	var password;
	var re_password;
	$("#student_number").off();
	$("#name").off();
	$("#email").off();
	$("#password").off();
	$("#password_retype").off();
	
	$("#student_number").on("change",function(){
		number = this.value;
		console.log(this.value);
	});
	$("#name").on("change",function(){
		name = this.value;
	});
	$("#student_number").on("change",function(){
		email = this.value;
	});
	$("#password").on("change",function(){
		password = this.value;
	});
	$("#password_retype").on("change",function(){
		re_password = this.value;
	});
	
	$("#register").click(function(){
		if(re_password != password){
			alert('Password must match!');
		}else{
			var data = {
				"_id": number,
				"name":name,
				"password":password,
				"creditos_aprovados":0,
				"email":email,
				"cursos":"Noob",
				"gpa": 4		
			};
			console.log(data);
			// var json = JSON.stringify(data);
				// console.log(data);	
			
			$.ajax({
				type: "POST",
				url: "http://collegelife.herokuapp.com/adduser",
				data: data,
				success: function(data){
					console.log(data);
					
				},
				error: function(ts) { 
					console.log(ts.responseText); 
				}
			});
			
				
		}
	});
	
});

