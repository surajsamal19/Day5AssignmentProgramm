public class WagesForMonth{
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int NUM_OF_WORKING_DAYS = 20;
public static void main(String args[]){
int empWage = 0, empHrs = 0, totalEmployeewage = 0;
for(int day = 0; day<NUM_OF-WORKING_DAYS; day++){
int empCheck = (int) MAth.floor(Math.random()*10)%3;
switch(empCheck){
case IS_PART_TIME:
empHrs = 4;
break;
case IS_FULL_TIME:
emphrs = 8;
break;
default:
empHrs = 0;
}
empWage = empHrs * EMP_RATE_PER_HOUR;
totalEmployeeWage += empWage;
}
System.out.println("Total Employee Wage is:" +totalEmployeeWage);
}
}
