package com.delivery.log.api.exceptionhandler;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

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
