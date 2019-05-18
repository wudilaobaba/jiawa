package exception;
/**
 * 年龄不合法异常，一定要见名知意
 * 自定义异常来说明哪些业务逻辑错误
 * @author Administrator
 *
 */

//此处必须继承Exception或RuntimeException或其他异常
public class IllegaAgeException08 extends Exception{
	//建议加此处的序列化号
	private static final long serialVersionUID = 1L;

	public IllegaAgeException08() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegaAgeException08(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegaAgeException08(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegaAgeException08(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegaAgeException08(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
