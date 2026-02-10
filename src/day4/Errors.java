package day4;

public enum Errors {
	
	ERR1("ERR1","%s is a Invalid Username"),
	ERR2("ERR2","Invalid Password");
	
	private String error_id;
	private String error_message;
	
	
	private Errors(String a,String b)
	{
		this.error_id=a;
		this.error_message=b;
	}


	public String getError_id() {
		return error_id;
	}


	public void setError_id(String error_id) {
		this.error_id = error_id;
	}


	public String getError_message() {
		return error_message;
	}


	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	
	

}
