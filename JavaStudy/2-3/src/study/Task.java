package study;

//継承先
// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator{
	public Task() {
	}
		private int a;
		private int b;
		private int c;
		public Task(int a, int b, int c) {
			this.a = 10;
			this.b = 20;
			this.c = 30;
		}
	
	
	
    /**
     * タスクの実行
     */
    public void doTask() {
        	

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    	System.out.println("plusメソッドの引数が一つの場合：" + plus(10));
    	System.out.println("plusメソッドの引数が二つの場合：" + plus(10, 20));
    	System.out.println("plusメソッドの引数が三つの場合：" + plus(10, 20, 30));
    }

}


	