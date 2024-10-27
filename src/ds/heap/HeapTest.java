package ds.heap;

public class HeapTest {

	public static void main(String[] args) throws Exception {
		MaxHeap maxHeap = new MaxHeap();
		maxHeap.offer(1);
		maxHeap.offer(2);
		maxHeap.offer(3);
		System.out.println(maxHeap.poll());
		maxHeap.offer(4);
		maxHeap.offer(5);
		System.out.println(maxHeap.poll());
		maxHeap.offer(6);
		maxHeap.offer(7);
		System.out.println(maxHeap.poll());
		maxHeap.offer(8);
		
		while(!maxHeap.isEmpty()) {
			System.out.println(maxHeap.poll());
		}
		
		System.out.println("--------------");
		
		MinHeap minHeap = new MinHeap();
		minHeap.offer(1);
		minHeap.offer(2);
		minHeap.offer(3);
		System.out.println(minHeap.poll());
		minHeap.offer(4);
		minHeap.offer(5);
		System.out.println(minHeap.poll());
		minHeap.offer(6);
		minHeap.offer(7);
		System.out.println(minHeap.poll());
		minHeap.offer(8);
		
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
		
		
	}
}
