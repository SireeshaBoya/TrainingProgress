package datatypes.com;

 class CallByValue {

	 void dispaly(int x1) {
		 x1=x1+100;
		
	}
	
   public static void main(String[] args) {
	 
	   CallByValue obj= new CallByValue();
	   int a=100;
	   System.out.println("before passing " +a);
	      obj.dispaly(a);
	 
	   System.out.println("after passing " +a);
	 
	 
}
}
