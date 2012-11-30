package retrofit.http;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpParams;
import org.junit.Test;

import com.google.gson.Gson;

public class ModulesTest {
	 private static final Gson GSON = new Gson();
	 private static final String API_URL = "http://taqueria.com/lengua/taco";
	 
	 private static final Module SIMPLE_MODULE = new Module(){
		 @Override
		public void preHandle(HttpUriRequest request) {
			HttpParams params = request.getParams();
			params.setParameter("byModule", "Yeah B*ch,I'm added by module");
		}
	 };
	 
	 @Test
	 public void testSimpleModule() throws Exception {
		 RestAdapter ra = new RestAdapter.Builder()
		 				  .setClient(new DummyHttpClient())
		 				  .setServer(new Server(API_URL))
		 				  .addModule(SIMPLE_MODULE).build();
		 
		 
	 }
}
