package ds.queue;

public class AppQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		q.insert(1000);
		q.insert(9);
		q.insert(8);
		q.insert(5);
		q.insert(1000);
		q.insert(99);
		q.insert(98);
		
		q.view();
		

	}

}
