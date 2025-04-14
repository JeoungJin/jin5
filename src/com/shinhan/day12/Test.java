package com.shinhan.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	
	
	public static void main(String[] args)  throws InterruptedException, ExecutionException {
		 
	        ExecutorService executor = Executors.newFixedThreadPool(3); // 동시에 3개만 실행

	        List<Future<Integer>> futureList = new ArrayList<>();;

	        // 5개의 비동기 작업 생성
	        for (int i = 0; i < 5; i++) {
	            final int taskId = i;

	            Callable<Integer> task = () -> {
	                System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
	                Thread.sleep(3000); // 3초 걸리는 작업
	                return taskId * 10; // 계산 결과 반환
	            };

	            Future<Integer> future = executor.submit(task); // 작업 제출 후 future 획득
	            futureList.add(future) ;
	        }

	        // 결과 받아오기
	        for (Future<Integer> f : futureList) {
	            Integer result = f.get(); // 블로킹 호출: 작업 완료까지 대기
	            System.out.println("Result: " + result);
	        }

	        executor.shutdown();
	    }
 
	public static void main7(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 1; i <= 100; i++) {
			int end = i;
			Callable<Integer> cc =  ()-> {
					int sum = 0;
					for (int su = 1; su <= end; su++) {
						sum += su;
					}
					
					System.out.println(Thread.currentThread().getName() + ":" + end + "....sum=" + sum);
					return sum;
				
			};
			Future<Integer> result = executor.submit(cc);
			int aa = result.get();

			System.out.println(aa + "받음");
		}
	}

	public static void main6(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 1; i <= 100; i++) {
			int end = i;
			executor.execute(new Runnable() {
				@Override
				public void run() {
					int sum = 0;
					for (int su = 1; su <= end; su++) {
						sum += su;
					}
					System.out.println(Thread.currentThread().getName() + ":" + end + "....sum=" + sum);
				}
			});
		}
	}

	public static void main4(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int end = i;
			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					int sum = 0;
					for (int su = 1; su <= end; su++) {
						sum += su;
					}
					System.out.println(Thread.currentThread().getName() + ":" + end + "....sum=" + sum);
				}
			});
			t1.start();
		}

	}

	public static void main3(String[] args) {
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("사용 가능한 코어 수(논리core): " + coreCount);

		// ExecutorService threadPool = new ThreadPoolExecutor(0, 0, 0, null, null);
		ExecutorService executor = Executors.newFixedThreadPool(5); // 24 x 2.5
		for (int j = 1; j <= 100; j++) {
			final int idx = j;
			Callable<Integer> cc = ()-> {
					int sum = 0;
					for (int i = 1; i <= idx; i++) {
						sum += i;
					}
					System.out.println(Thread.currentThread().getName() + "==>" + idx + "까지 합계");
					return sum;
			
			};
			
			Future<Integer> result = executor.submit(cc);
			try {
				int a = result.get();
				System.out.println("리턴값:" + a);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		executor.shutdown();

	}

	public static void main2(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());

			}
		});
		t1.start();
		System.out.println(Thread.currentThread().getName());
	}

}
