
public class Activity1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sec=1000000000;
		double EarthSec= 31557600;
		double MercurySec= 0.2408467;
		double VenusSec= 0.61519726;
		double marsSec= 1.8808158;
		double Jupitersec= 11.862615;
		double SaturnSec= 29.447498;
		double UranusSec= 84.016846;
		double NeptuneSec= 164.79132;
		
		System.out.println("Age on Mercury:"+ sec/EarthSec/MercurySec);
		System.out.println("Age on Venus:"+ sec/EarthSec/VenusSec);
		System.out.println("Age on Earth:"+ sec/EarthSec);
		System.out.println("Age on Mars:"+ sec/EarthSec/marsSec);
		System.out.println("Age on Jupiter:"+ sec/EarthSec/Jupitersec);
		System.out.println("Age on Saturn:"+ sec/EarthSec/SaturnSec);
		System.out.println("Age on Uranus:"+ sec/EarthSec/UranusSec);
		System.out.println("Age on Neptune:"+ sec/EarthSec/NeptuneSec);
	}
	

}
