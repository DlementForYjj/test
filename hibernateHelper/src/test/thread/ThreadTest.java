package test.thread;

import java.util.concurrent.TimeUnit;

public class ThreadTest {

	public static void main(String[] args) {
		// Object a = new Object();
		// Object b = new Object();
		// Object c = new Object();
		// MyThreadPrinter2 pa = new MyThreadPrinter2("A", c, a);
		// MyThreadPrinter2 pb = new MyThreadPrinter2("B", a, b);
		// MyThreadPrinter2 pc = new MyThreadPrinter2("C", b, c);
		// MyThreadPrinter2 pd = new MyThreadPrinter2("D", b, c);
		//
		// try {
		// // 确保按顺序A、B、C执行
		// new Thread(pa).start();
		// Thread.sleep(100);
		// new Thread(pb).start();
		// Thread.sleep(100);
		// new Thread(pc).start();
		// Thread.sleep(100);
		// new Thread(pd).start();
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		final byte a[] = { 0 };// 以该对象为共享资源
		Thread t1 = new Thread(new NumberPrint((1), a), "1");
		t1.start();
		Thread t2 = new Thread(new NumberPrint((2), a), "2");
		t2.start();
	}

}

class MyThreadPrinter2 implements Runnable {

	private String name;
	private Object prev;
	private Object self;

	MyThreadPrinter2(String name, Object prev, Object self) {
		this.name = name;
		this.prev = prev;
		this.self = self;
	}

	@Override
	public void run() {
		int count = 10;
		while (count > 0) {
			synchronized (prev) {
				synchronized (self) {
					System.out.print(name);
					count--;
					self.notify();
				}
				try {
					prev.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}

class NumberPrint implements Runnable {
	private int number;
	public byte res[];
	public static int count = 5;

	public NumberPrint(int number, byte a[]) {
		this.number = number;
		res = a;
	}

	public void run() {
		try {
			while (count-- > 0) {
				
				synchronized (res) {
					res.notify();
					// 唤醒等待res资源的线程，把锁交给线程（该同步锁执行完毕自动释放锁）
					System.out.println(number);
					
					res.wait();
					
					// res.wait();//释放CPU控制权，释放res的锁，本线程阻塞，等待被唤醒。
					// System.out.println("------线程"+Thread.currentThread().getName()+"获得锁，wait()后的代码继续运行："+number);
				}
				
			}
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



