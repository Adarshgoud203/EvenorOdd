
	class EvenOdd implements Runnable{
		static int count=1;
		Object obj; 
		//string resource="Abed";
		public EvenOdd(Object obj) {
			this.obj=obj;
		}

		@Override
		public void run() {
				while(count<=10) {
					if(count%2==0 && Thread.currentThread().getName().equals("E ven")) {
						synchronized(obj) {
							System.out.println("Thread Name"+Thread.currentThread().getName()+"value"+count);
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							count++;
							try {
							obj.wait();
						}
						catch(Exception e) {
							e.printStackTrace();
						}
						}
					}
						if(count%2!=0 && Thread.currentThread().getName().equals("Odd")) {
							synchronized(obj){
								System.out.println("Thread Name"+Thread.currentThread().getName()+"value"+count);
								try {
									Thread.sleep(3000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								count++;
								try {
								obj.notify();
							}
						catch(Exception e1) {
							e1.printStackTrace();
						}
						}
						}
			}
			}
		}


