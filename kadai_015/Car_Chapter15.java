package Kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1;
	private int speed = 10;
	
	//ギアの値により速度を変える
	public void gearChange(int afterGear) { 
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
		if(this.gear == 1) {
			this.speed = 10;
		}
		else if(this.gear == 2) {
			this.speed = 20;
		}
		else if(this.gear == 3) {
			this.speed = 30;
		}
		else if(this.gear == 4) {
			this.speed = 40;
		}
		else if(this.gear == 5) {
			this.speed = 50;
		}
		else {
			this.speed = 10;
		}
		
		
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	
	
	
	
	
	

}
