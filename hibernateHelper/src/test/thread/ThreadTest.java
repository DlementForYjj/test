package test.thread;

import java.beans.FeatureDescriptor;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest {

	class TCallable implements Callable<String>{
		
		public int id=0;
		
		public TCallable() {
			// TODO Auto-generated constructor stub
			id++;
		}
		
		@Override
		public String call() throws Exception {
			// TODO Auto-generated method stub
			return "Hello Thread:"+id;
		}
	}
	
	
	public static void main(String[] args) {
		
		ExecutorService singleThread = Executors.newSingleThreadExecutor();
		Future<String> f = singleThread.submit(new ThreadTest().new TCallable());
		try {
			System.out.println(f.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
