package retrofit.http;

import org.apache.http.client.methods.HttpUriRequest;

/**
 * The abstract executable module delegates its execution 
 * to the canExecute method that triggers the actual module only
 * if the method returns a true value
 * @author mfiandesio
 *
 */
public abstract class AbstractExecutableModule  implements Module {
	
	
	public abstract void handler(HttpUriRequest request);
	
	public void preHandle(HttpUriRequest request) {
		if(canExecute(request)){
			handler(request);
		}
	};
	
	public abstract boolean canExecute(HttpUriRequest request);
	
}
