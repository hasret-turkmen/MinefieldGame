
public class Minefield {
	public int score = 0;  //Player starts with zero point
	public int position_x = 1;   //Player starts at 1x1
	public int position_y = 1;
	public boolean dead = false;
	
	public void move( String direction ) {

	if(direction.equalsIgnoreCase("right"))   //Player moves when user enters directions
		position_x= position_x+1; 
	else if(direction.equalsIgnoreCase("left"))
		position_x= position_x - 1;
	else if(direction.equalsIgnoreCase("up"))
		position_y= position_y - 1;
	else if(direction.equalsIgnoreCase("down"))
		position_y=position_y + 1;
	
	 
	if(position_x<=0|| position_y<=0) {   //Player dies if position is negative
		System.out.println("You died");
		dead=true;
	 }
	
	
	if((dead==false)&&(position_x<6&&position_y<6)) {        //Player keeps going if they are not dead and inside the 5x5 field
	System.out.println("You are at [" + position_x + "," + position_y + "]"); 
		
	if(position_x==5&&position_y==5)
		System.out.println("You finished the game with " + score + " score.");  //Prints the total score of the game
}
	if((position_x==2&&position_y==2) || (position_x==4&&position_y==3) || (position_x==1&&position_y==5)) {  //Adds points when found a star
		System.out.println("You found a star!");
		score=+100; }

	if(((position_x==2&&position_y==3) || (position_x==2&&position_y==5) || (position_x==5&&position_y==4))) {  //Dies when stepped on a bomb and game ends
		System.out.println("You stepped on a bomb! You died.");
		dead=true;}
	
	
	
	}
		
	
		}
