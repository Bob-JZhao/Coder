package Abstract;

class MyBook extends Book{
	int price ;
   
	
	MyBook (String t,String a ,int pri){
		super(t, a);
        title=t;
         
    } 
    @Override 
    void display(){
        System.out.println("Title:"+ super.title);
         System.out.println("Author:"+ super.author);
         System.out.println("Price:"+ this.price);
        
    }
}