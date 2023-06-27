public class SnakeLadder{
public static void main(String args[]){
System.out.println("welcome to Snake LAdder  game :");
int singlePlayer = 0;
System.out.println("Starting position of Single Player Is:" +singlePlayer);
int dieCheck = (int)(Math.floor(Math.random()*10))%6 +1);// 1-6;
System.out.println("Player rolled the die and get the die" +dieCheck);
Random random = new Random();
int option  = random.nextInt(3);
switch(option){
case 0: singlePlayer += diecheck;
System.out.println("Player moved ahead by" +dieCheck);
System.out.println("Player current position" +singlePlayer);
 if(singlePlayer>100)
break;
case 1 : singlePlayer -= dieCheck;
System.out.println("player moved behind by:" +dieCheck);
System.out.println("Player current Position is:"+singlePlayer);
break;
case 2: singlePlayer += 0;
System.out.println("Player is at same position");
System.out.println("Player current position" +singlePLayer);
break;
}
}
System.out.println("  ");
System.out.println("Player reaches  Position " +singlePlayer);
    





}
}