class LoveProgramThread extends Thread{
	public void run(){
		System.out.println("Thread 1 : I");
		System.out.println("Thread 1 : Love");
		System.out.println("Thread 1 : Java");
		System.out.println("Thread 1 : Very");
		System.out.println("Thread 1 : Much");
		System.out.println("Thread 2 : I");
		System.out.println("Thread 2 : Love");
		System.out.println("Thread 2 : Java");
		System.out.println("Thread 2 : Very");
		System.out.println("Thread 2 : Much");
		System.out.println(Thread.currentThread().getState());
			}
	public static void main(String[]args){
	 	LoveProgramThread obj= new LoveProgramThread();
		obj.start();
		}	
}