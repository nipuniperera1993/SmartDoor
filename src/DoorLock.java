import java.util.Scanner;

public class DoorLock {

	public static void main(String[] args) {

		System.out.println("Hello World");
		// TODO Auto-generated method stub

		boolean person_walks_in = false;
		boolean door_sensor = false;
		boolean motion_sensors = false;
		boolean lights = false;

		String answer;
		Scanner scan = new Scanner(System.in);

		System.out.println("Does the person walk in?");
		answer = scan.nextLine();

		if(answer.equals("Yes") || answer.equals("yes")){

			person_walks_in = true;

			System.out.println(person_walks_in);

			System.out.println("Does the person open the door?");
			answer = scan.nextLine();

			if(answer.equals("Yes") || answer.equals("yes")){
				System.out.println(answer);
				// door sensors activated 
				door_sensor = true;
				System.out.println("Door Sensors :"+ door_sensor);

				System.out.println("Does the person walk in to the room?");
				answer = scan.nextLine();

				if(answer.equals("Yes") || answer.equals("yes")){

					//motion sensors activated 
					motion_sensors= true;
					System.out.println("Motion Sensor :"+ motion_sensors);

					if (motion_sensors == true && door_sensor == true){

						//swtich on the lights while the motion and door sensors are on
						lights = true;
						System.out.println("Lights are :"+ lights);
					}

				} else if(answer.equals("No") || answer.equals("no")){

					//motion sensors remain off 
					System.out.println("Motion Sensors :"+ motion_sensors);
				}

			}else if(answer.equals("No") || answer.equals("no")){

				//door sensors remain off
				System.out.println("Door Sensors :"+door_sensor);
			}
		}else{
			System.out.println("Person walks in :"+ person_walks_in);

		}

	}

}
