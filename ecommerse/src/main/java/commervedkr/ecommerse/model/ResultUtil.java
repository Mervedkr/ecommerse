package commervedkr.ecommerse.model;

public class ResultUtil {
	public static Result success(Object object) {
		Result result = new Result();
		result.setStatus("okey");
		result.setMessage("succeed");
		result.setData(object);
		
		return result;
	}
	
	public static Result success() {
		return success(null);
	}
	
	public static Result failure(String status, String message) {
		Result result = new Result();
		result.setStatus(status);
		result.setMessage(message);
		
		return result;
	}
	
	public static Result failure(ResultEnum resultEnum) {
		return failure(resultEnum.getStatus(), resultEnum.getMessage());
	}
}
