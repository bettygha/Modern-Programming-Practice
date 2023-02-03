package lesson_Standard_Exam_4;

public abstract class Department {
	
	private StringQueue queue = new StringQueue();
	
	
	abstract String getName();
	
	public void addMessage(String msgString ) {
		queue.enqueue(msgString);
		
	}
	public String nextMessage() throws EmptyQueueException {
		queue.dequeue();
		String nextString = queue.peek();
		return nextString;
		
	}
	public StringQueue getQueue() {
		return queue;
		
	}

}
