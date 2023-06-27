import java.util.Random;
public class EmpPresent{
public static void main(String args[]){
System.out.println("-----------Welcome to Employee Wage Computation Programm-----0 ");
System.out.println("----------");
System.out.println("");
int isPresent = 1;
int isAbsent = 0;
int randomCheck;
int checkAttendence  = (int)((Math.random()*10)%2);
if(checkAttendence == isPresent){
System.out.println("The Employee is Present");
}
else{
System.out.println(("The Employee is Absent");
}
}
}