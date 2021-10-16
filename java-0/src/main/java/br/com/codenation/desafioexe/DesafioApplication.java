package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> fibonacciList = new ArrayList<>();
		fibonacciList.add(0);
		fibonacciList.add(1);
		while (fibonacciList.get(fibonacciList.size() - 1) < 350) {
			fibonacciList.add(fibonacciList.get(fibonacciList.size() - 1) + fibonacciList.get(fibonacciList.size() - 2));
		};
		return fibonacciList;
	};

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}