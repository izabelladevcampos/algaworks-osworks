package com.algaworks.osworks.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Problema {

	private Integer status;
	private LocalDateTime dataHota;
	private String titulo;
	private List<Campos> campos;

	public static class Campos {
		private String nome;
		private String mensagem;

		public Campos(String nome, String mensagem) {
			super();
			this.nome = nome;
			this.mensagem = mensagem;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LocalDateTime getDataHota() {
		return dataHota;
	}

	public void setDataHota(LocalDateTime dataHota) {
		this.dataHota = dataHota;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Campos> getCampos() {
		return campos;
	}

	public void setCampos(List<Campos> campos) {
		this.campos = campos;
	}

}
