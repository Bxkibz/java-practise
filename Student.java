class Student{
    /*
     This program will help users to store and manage student records
     */
    //variable declaration
    String firstname,lastname,grade,gender;
    //variable assignment
    int phonenumber;
    double feebalance,avgscore;

    String genderstr="Female";
    public static void main(String[] args) {
       System.out.println("Student details");
      //creating an object of student class
      Student studentobj=new Student();
      //variable assignmet
      studentobj.phonenumber=44235;
      studentobj.firstname="Brian";
      studentobj.lastname="Kibicho";
      studentobj.avgscore=82.1;
      
      System.out.println("phone number:"+studentobj.phonenumber);
      System.out.println("Gender:"+studentobj.genderstr);

    }}