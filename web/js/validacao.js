
//function submitForm(){
$(document).ready(function(){
            $("#myForm").validate({
		rules: {        	        		
			nome: {required: true, minlength: 3, maxlength: 30},
                        sobrenome: {required: true, minlength: 4, maxlength: 40},
                        senha: {required: true, minlength: 8, maxlength: 20},
                        confirmaSenha: {required: true, minlength: 8, maxlength: 20, equalTo: '#senha'},
			email: {required: true, email: true}		
            },  
	    errorElement: "span" ,                              
	    messages: {
    		nome: {required: 'Entre com o nome.', 
                    minlength: 'Mínimo de 3 caracteres.', 
                    maxlength: 'Máximo de 30 caracteres.'},
                sobrenome: {required: 'Entre com o sobrenome.', 
                    minlength: 'Mínimo de 4 caracteres.', 
                    maxlength: 'Máximo de 40 caracteres.'},
                senha: {required: 'Entre com a senha.', 
                    minlength: 'Mínimo de 8 caracteres.', 
                    maxlength: 'Máximo de 20 caracteres.'},
                confirmaSenha: {required: 'Confirme a Senha.', 
                    minlength: 'Mínimo de 8 caracteres.', 
                    maxlength: 'Máximo de 20 caracteres.',
                    equalTo: 'Entre com a mesma senha.' },
    		email: {required: 'Entre com o e-mail.', email: 'E-mail inválido.'}
	    },
            highlight: function(element) {
                    $(element).closest('.form-group').removeClass('success').addClass('error');
            },
            success: function(element) {
                    element
                    .text('OK!').addClass('valid')
                    .closest('.form-group').removeClass('error').addClass('success');
            }
	});
	//if(validator.form()){ // validation perform
	//	$('form#myForm').attr({action: 'Confirm.jsp'});			
	//	$('form#myForm').submit();
	//}
});

