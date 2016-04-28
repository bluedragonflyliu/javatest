	public class IncomingReader implements Runnable{
		public void run(){
			String message;
			try{
				while((message = reader.readLine()) != null){
					System.out.println("read "+ message);
					incoming.append(message + "\n");
				}
			} catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}