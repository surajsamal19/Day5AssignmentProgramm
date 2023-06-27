public class EmpSwitchCase{
public static void main(String args[]){
System.out.println("----------------Welcome to the EmployeeWageswitchcase---------");

final int wagePerHr = 20;
final int fullDayHr = 8;
final int partTimeHr = 8;
int dailyWage = 20;
int dailyWorkhour;
int dailySalary;
int return_value = 0;
int checkAttendence = (int)((Math.random()*10)%3);
switch(checkAttendence){
case isPresent:{
System.out.println("The employee is present");
dailyWorkhour = 8;
return_Value = dailyWorkHour;
break;
}
case isPartTime:{
System.out.println("The empployee is present");
dailyWorkhour = 5;
return_value= dailyWorkhour;
break;
}
default:{
System.out.println("The Employee is Absent");
dailyWorkHour = 0;
return_value = dailyWorkhour;
break;
}
}
dailySalary = dailyWage * return_value;
System.out.println("Daily salary is:" +dailySalary);
}
}


