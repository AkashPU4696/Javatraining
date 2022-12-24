package day10Interface;

public class CalMethod implements cal1,cal2{
	
	public int mul(int a, int b) {
		int c= a+b;
		return c;
	}

	public double div(int d, int e) {
		int f=d/e;
		return f;
	}

	public int sum(int j, int k) {
		int l = j+k;
		return l;
	}

	public int sub(int m, int n) {
		int p = m-n;
		return p;
	}

	
}
