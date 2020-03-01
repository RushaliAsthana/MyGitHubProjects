import java.util.*;
class customList
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student>studentsList=new ArrayList<Student>();
        System.out.println("Please enter your custom list!Enter 10 Student name,roll no and dept");
        for(int i=0;i<10;i++)
        {
            String name=sc.next();
            String rno=sc.next(); 
            String dept=sc.next();
            studentsList.add(new Student(rno, name, dept));
        }
         
       
        while(true)
        {
             System.out.println("Enter your choice: 1.Add student 2.Remove student 3.See your list 4.exit");
            String choice=sc.next();
        switch(choice)
        {
            case "1":
            {
                System.out.println("Enter new student details rollno name and dept");
                String name=sc.next();
                String rollno=sc.next();
                String dept=sc.next();
                studentsList.add(new Student(rollno,name,dept));
                break;
            }
            case "2":
            {
                System.out.println("Enter Student name to be removed:");
                String sname=sc.next();

                for(Student s:studentsList)
                {
                    if(s.name.equals(sname))
                    {
                        studentsList.remove(s);
                        break;
                    }
                }
                break;
            }
            case "3":
            {
                    for(Student student:studentsList)
                    {
                        System.out.println(student.rollno+" "+student.name+" "+student.dept);
                    }   
                    break; 
            }
            case "4":
            {
                System.exit(0);
            }
        }
        }

    }

    
}