package core.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AdminLoggedInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("interceptor distrutto");

	}

	@Override
	public void init() {
		System.out.println("intercept lanciato");

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String result = invocation.invoke();
		return result;
	}

}
