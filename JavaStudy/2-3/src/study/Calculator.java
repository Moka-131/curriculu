package study;
//継承元
public class Calculator extends Task{
	public Calculator() {
		super(10, 20, 30);
	}

    protected int plus(int a) {
        return a + 1;
    }

    protected int plus(int a, int b) {
        return a + b;
    }

    protected int plus(int a, int b, int c) {
        return a + b + c;
    }

}