package br.com.comprasa2.api.eventos.dto;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class EventoDto {
	
	@SerializedName("id")
	@JsonProperty("id")	
	private String id;

	@SerializedName("chave")
	@JsonProperty("chave")	
	private String chave;
	
	private String tipo;
	private String status;

	private String action;

	private long time;
	private long finishProcessTime;
	private long startProcessTime;
	private long queueTime;

	private String userId;

	private Map<String,Object> data = new HashMap<String,Object>();

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public Map<String,Object> getData() {
		return data;
	}

	public void setData(Map<String,Object> data) {
		this.data = data;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public long getFinishProcessTime() {
		return finishProcessTime;
	}

	public void setFinishProcessTime(long finishProcessTime) {
		this.finishProcessTime = finishProcessTime;
	}

	public long getStartProcessTime() {
		return startProcessTime;
	}

	public void setStartProcessTime(long startProcessTime) {
		this.startProcessTime = startProcessTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getQueueTime() {
		return queueTime;
	}

	public void setQueueTime(long queueTime) {
		this.queueTime = queueTime;
	}

	

	
	
	 
	
	
}
