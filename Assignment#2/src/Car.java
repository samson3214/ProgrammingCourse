
public class Car {
	int gear = 1;
	int location ;
	int speed = 0;
	final int DESTINATION = 250; 
	
	void reverseGear() {
			gear = -1;
			
	}
	
	int reportGear() {
	        return gear;
	} 


	int reportLocation() {
		return location; 
	}
 
	void gearUp () {
		if (gear == 6){
			System.out.println("Gear can not increase any further");
		}
		else if (gear==-1){
			gear=1;
		}
		else {
			gear = gear + 1;
		}
	}
	
void gearDown(){ 
	if (gear==1){
		System.out.println("gear can't decrease anymore");
		
	}
	else if (gear==-1){
		System.out.println("cannot decrease gear because car is in reverse gear");

	}else {
		gear = gear -1;
	}
}
	int reportRemaining (){
		return DESTINATION - location ; 
		}

void moveByTime(int time){	
	int delta;
	if (time<0){
		System.out.println("time should be positive");
  } 
    else
{ 
    	speed= gear*20;
    	delta= speed*time;
    	location= location+delta; 
}
}
	boolean isArrived(){
		if (location>= DESTINATION){
			return true;	
	}
	else
	{
		return false;
	}
	}
}
