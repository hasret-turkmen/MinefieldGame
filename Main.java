import java.util.Scanner;
public class Main {
	
public static void main(String[] args) {
	
Scanner bili = new Scanner( System.in );
	
Minefield player = new Minefield();
	
System.out.println( "Which direction to move?" );
String direc= bili.next();

while( (!player.dead )) {
	player.move(direc);
	direc=bili.next();

}

bili.close();
}
}
