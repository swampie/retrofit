package retrofit.http;

import org.apache.http.client.methods.HttpUriRequest;

/**
 * An interface class used to interact 
 * with httprequest creation and its actual execution.
 * 
 * Example: a module for oauth that add an authorization header
 * @author mfiandesio
 *
 */
public interface Module {
	
	public void preHandle(HttpUriRequest request);
	
}
