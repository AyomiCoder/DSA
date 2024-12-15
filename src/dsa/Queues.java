package dsa;
import java.util.Queue;
import java.util.LinkedList;

public class Queues {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Lambo");
		queue.offer("Nissan");
		queue.offer("Benz");
		queue.offer("Kia");
		queue.offer("Camry");
		
//		queue.peek();
//		queue.isFull();
//		queue.isEmpty();
		
//		queue.poll();

		
		System.out.println(queue);

	}

}
