
public class Minefield {
	public int score = 0;
	public int position_x = 1;
	public int position_y = 1;
	public boolean dead = false;
	public void move( String direction ) {

	if(direction.equalsIgnoreCase("right"))
		position_x= position_x+1; 
	else if(direction.equalsIgnoreCase("left"))
		position_x= position_x - 1;
	else if(direction.equalsIgnoreCase("up"))
		position_y= position_y - 1;
	else if(direction.equalsIgnoreCase("down"))
		position_y=position_y + 1;
	
	
	if(position_x<=0|| position_y<=0) {
		System.out.println("You died");
		dead=true;
	 }
	
	
	if((dead==false)&&(position_x<6&&position_y<6)) {
	System.out.println("You are at [" + position_x + "," + position_y + "]"); 
	if(position_x==5&&position_y==5)
		System.out.println("You finished the game with " + score + " score.");
}
	if((position_x==2&&position_y==2) || (position_x==4&&position_y==3) || (position_x==1&&position_y==5)) {
		System.out.println("You found a star!");
		score=+100; }

	if(((position_x==2&&position_y==3) || (position_x==2&&position_y==5) || (position_x==5&&position_y==4))) {
		System.out.println("You stepped on a bomb! You died.");
		dead=true;}
	
	
	
	}
		
	
		}
