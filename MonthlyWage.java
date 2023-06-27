public class MonthlyWage{
public static void main(String args[]){
System.out.println("Welcome to Employee wage computation problrem");
System.out.println("-------------------");
System.out.println("  ");
final int isPresent = 1;
final int isabsent = 0;
final int ispartTime = 2;
int daily_wage_per_hour = 100;
int max_hour_in_month = 100;
int workin_day =20;
int Total_Salary = 0;
intt total_working_hr = 0;
int total_working_days = 1;
int total_emp_hr = 0;
int dailySalary;
while(total_emp_hr <= max_hour_in_month && total_woking_days <working_day){
int return_value;
int checkAttendence = (int)((math.random()*10)%3);
switch(checkAttendence){
case isPresent:{
int dailyWorkHour = 8;
return_calue = dailyWorkHour;
break;
}
default:{
int dailyWorkHour = 0;
return_value= dailyWorkHour;
break;
}
}
total_emp_hr = total_emp_hr+return_value;
dailySalary = return_value*daily_wage_per_hour;
System.out.println("Daily Salary=" +dailySalary);
Total_alary = Total_Salry + dailySalary;
total_working_days++;
}
System.out.println("-------------");
System.out.prinntln("Total Salary:" +total_salary);
}
}