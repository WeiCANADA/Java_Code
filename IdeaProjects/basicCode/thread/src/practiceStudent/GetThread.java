package threadDemo.practiceStudent;

public class GetThread implements Runnable {
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				//判断是否有数据,没数据!false 进入wait()
				if(!s.flag){
					try {
						s.wait(); //t2就等待了。立即释放锁。将来醒过来的时候，是从这里醒过来的时候
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//有数据则输出
				System.out.println(s.name + "---" + s.age);
				//林青霞---27
				//刘意---30

				//修改标记
				s.flag = false;
				//唤醒线程
				s.notify(); ///唤醒t1
			}
		}
	}
}
