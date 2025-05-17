package Car_Chapter15;

public class Car_Chapter15 {
	// 初期値
	private int gear = 1;
	private int speed = 10;

	public void gearChange(int afterGear) {
		this.gear = afterGear;

		switch (afterGear) {
		case 1:
			speed = 10;
			break;
		case 2:
			speed = 20;
			break;
		case 3:
			speed = 30;
			break;
		case 4:
			speed = 40;
			break;
		case 5:
			speed = 50;
			break;
		default:
			speed = 10;
			break;
		}
	}

	public void run() {
		System.out.println("現在の速度は" + speed + "km/hです。");
	}

}
