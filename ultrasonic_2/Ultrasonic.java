package ultrasonic;
import utils.MyNetworkTable;
public class Ultrasonic{
	public static void main(String[] args) throws Exception{
		PiJavaUltrasonic sonic=new PiJavaUltrasonic(
			0,//ECO PIN (physical 11)
			1,//TRIG PIN (pysical 22)
			1000,//REJECTION_START ; long (nano seconds)
			23529411 //REJECTION_TIME ; long (nano seconds)
		);
		System.out.println("Start");
		 // get an instance of our MyNetworkTable class
		 MyNetworkTable myNetworkTable = new MyNetworkTable();
		while(true){
			System.out.println("distance "+sonic.getDistance()+"in");
			
			 // write a string to the NetworkTable
			 myNetworkTable.writeString("distance", sonic.getDistance()+"");
			Thread.sleep(1000); //1s
		}
	}
	
}