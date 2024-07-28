import java.util.Scanner;
class posting
{
int course_marks,apt_test,tech_test,interview_marks;
int total_marks;
int jobcodes[]={131,132,133};
void employee(int course_marks,int apt_test,int tech_test,int interview_marks)
{
total_marks=course_marks+apt_test+tech_test+interview_marks;
if(total_marks>=80)
{
System.out.println("you are selected as programer");
}
else
{
System.out.println("your are not selected");
}
}

void employee(int tech_test,int interview_marks)
{
int total_marks=tech_test+interview_marks;
if(total_marks>=85)
{
System.out.println("you are selected as team leader");
}
else
{
System.out.println("You are not selected");
}
}

void employee(int interview_marks)
{
if(interview_marks>=90)
{
System.out.println("Selected as project manager");
}
else
{
System.out.println("Better luck next time");
}
}
void read_marks(int code)
{
Scanner sc=new Scanner(System.in);
switch(code)
{
case 131:
System.out.println("course marks:");
course_marks=sc.nextInt();
System.out.println("enter aptitude marks:");
apt_test=sc.nextInt();
System.out.println("Technical Marks :");
tech_test=sc.nextInt();
System.out.println("Enter Interview marks:");
interview_marks=sc.nextInt();
break;

case 132:
System.out.println("Technical Marks :");
tech_test=sc.nextInt();
System.out.println("Enter Interview marks:");
interview_marks=sc.nextInt();
break;

case 133:	
System.out.println("Enter Interview marks:");
interview_marks=sc.nextInt();
break;
}}
}
class posting1
{
public static void main(String args[])
{
posting emp=new posting();
emp.read_marks(emp.jobcodes[0]);
emp.employee(emp.course_marks,emp.apt_test,emp.tech_test,emp.interview_marks);
emp.read_marks(emp.jobcodes[1]);
emp.employee(emp.tech_test,emp.interview_marks);
emp.read_marks(emp.jobcodes[2]);
emp.employee(emp.interview_marks);
}
}
