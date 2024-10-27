package ds.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
	List<Integer> list;
	
	public MaxHeap() {
		this.list = new ArrayList<>();
	}
	
	public void offer(int num) {
		list.add(num);
		heapifyUp(list.size() - 1);
	}
	
	private void heapifyUp(int child) {
		int parent = (child) / 2;
		if(child == parent) {
			return;
		}
		
		if(list.get(parent) < list.get(child)) {
			swap(parent, child);
		}
		
		heapifyUp(parent);
	}

	private void swap(int parent, int child) {
		int temp = list.get(child);
		list.set(child, list.get(parent));
		list.set(parent, temp);
	}

	public int poll() throws Exception {
		if(isEmpty()) {
			throw new Exception("Empty Heap");
		}
		int size = list.size();
		if(size == 1) {
			return list.remove(size - 1);
		}
		
		
		int root =  list.get(0);
		int lastValue = list.remove(size - 1);
		list.set(0, lastValue);
		
		heapifyDown(0);
		
		
		return root;
	}
	
	private void heapifyDown(int index) {
		int leftChildIndex = index * 2;
		int rightChildIndex = index * 2 + 1;
		int swapIndex = index;
		int size = list.size();
		if(size > leftChildIndex && list.get(swapIndex) < list.get(leftChildIndex)) {
			swapIndex = leftChildIndex;
		}
		
		if(size > rightChildIndex && list.get(swapIndex) < list.get(rightChildIndex)) {
			swapIndex = rightChildIndex;
		}
		
		if(swapIndex == index) {
			return;
		}
		swap(swapIndex, index);
		heapifyDown(swapIndex);
		
	}

	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Empty Heap");
		}
		
		return list.get(0);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

}
