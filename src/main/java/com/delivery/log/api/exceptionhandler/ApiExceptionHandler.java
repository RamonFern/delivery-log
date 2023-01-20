package com.delivery.log.api.exceptionhandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler{
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
//		List<Problema.Campo> campos = null; //= new ArraList<>();
//		
//		for(ObjectError error : ex.getBindingResult().getAllErrors()) {
//			String nome = error.getObjectName();
//			String messagem = error.getDefaultMessage();
//			
//			campos.add(new Problema.Campo(nome, messagem));
//		}
		
		
		Problema problema = new Problema();
		problema.setStatus(status.value());
		problema.setDataHora(LocalDateTime.now());
		problema.setTitulo("Um ou mais campos estão inválidos. Preencha corretamente");
		//problema.setCampos(campos);

		return handleExceptionInternal(ex, problema, headers, status, request);
	}

}
