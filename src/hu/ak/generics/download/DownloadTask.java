package hu.ak.generics.download;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class DownloadTask implements Callable<String> {

	String urlAdress;
	static AtomicInteger serialNumber = new AtomicInteger();

	public DownloadTask(String urlAdress) {
		this.urlAdress = urlAdress;
		serialNumber.getAndIncrement();
		System.out.println(serialNumber);
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
