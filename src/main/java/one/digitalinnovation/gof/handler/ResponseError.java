package one.digitalinnovation.gof.handler;

import java.util.Date;

public class ResponseError {
	private Date timestamp = new Date();
	private String status = "error";
	private int statusCode = 400;
	private String error;
	
	public ResponseError(){}
	
    public Date getTimestamp(){ return timestamp;}
	public String getStatus(){ return status;}
	public int getStatusCode(){ return statusCode;}
	public String getError(){ return error;}

	public void setTimestamp(Date Timestamp){ timestamp = Timestamp;}
	public void setStatus(String Status){ status = Status;}
	public void setStatusCode(int Code){ statusCode= Code;}
	public void setError(String Error){ error = Error;}
	
}