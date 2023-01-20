package com.delivery.log.api.exceptionhandler;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(Include.NON_NULL)
@Getter
@Setter
public class Problema {
	
	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
//	private List<Campo> campos;
//	
//	@AllArgsConstructor
//	@Getter
//	public static class Campo {
//		private String nome;
//		private String mensagem;
//	}

}
