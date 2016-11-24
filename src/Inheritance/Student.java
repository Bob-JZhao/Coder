package Inheritance;

class Student extends Person{
	private int[] testScores;
    Student (String firstName,String lastName,int id,int[] code){
        super(firstName,lastName,id);
        super.firstName = firstName;
        super.lastName= lastName;
        super.idNumber = id;
        this.testScores = code ;
    }
   public String calculate(){
       int sum = 0;
       for(int i=0;i<testScores.length;i++){
           sum = sum+testScores[i];
       }
       if(testScores.length == 0){
           return "T";
       }
       double grade = sum /testScores.length;
       if( grade >=90 && grade <=100){
           return "O";
       }
        if(grade >=80 && grade <90){
           return "E";
       }
        if(grade >=70 && grade <80){
           return "A";
       }
        if(grade >=55 && grade <70){
           return "P";
       }
        if(grade >=40 && grade <55){
           return "D";
       }
       
         else  return "T";
       
   }
}