package commervedkr.ecommerse.model;

public class Result<T> {

	private String status;
	
	private String message;
	
	private T data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [status=" + status + ", message=" + message + "]";
	}
}
