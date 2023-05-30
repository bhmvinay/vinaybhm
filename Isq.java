23223class Student 
{
         String name;
         int regno;
         public Student()
         {
                name="raju";
                regno=1234;
         }
         public Student(String n,int r)
         {   
                name=n;
                regno=r; 
         }
         public Student(Student s) 
         {
                name=s.name;
                regno=s.regno;
         }
         void display()
         { 
                System.out.println(name+"\t"+regno);
         }
}
class Studentdemo
{
         public static void main(String s[])
         {  
                Student s1=new Student();
                Student s2=new Student("ravi",1468);
                Student s3=new Student(s1);
                s1.display();
                s2.display();
                s3.display();
         }
}
         
            