package a666;

public class Dog {
	
	String name;
	int age;
	String pingzhong;
	String xinbie;
	

	
		// TODO Auto-generated method stub
	    public Dog(){
		System.out.println("�޲������췽��");
	    }
    	public Dog(String name){
		this.name=name;
		System.out.println("1���������췽��");
    	}
		public Dog(String name,int age){
			this.name=name;
			this.age=age;
			System.out.println("2���������췽��");
		}
			public Dog(String name,int age,String pingzhong){
				this.name=name;
				this.age=age;
				this.pingzhong=pingzhong;
				System.out.println("3���������췽��");
			}
		public Dog(String name,int age,String pingzhong,String xinbie){
			this.name=name;
			this.age=age;
			this.pingzhong=pingzhong;
			this.xinbie=xinbie;
			System.out.println("4���������췽��");
		
	}



		public void show() {
			// TODO Auto-generated method stub
			System.out.println(this.name+"  "+this.age+"  "+this.pingzhong+"  "+this.xinbie);
			
		}

}
