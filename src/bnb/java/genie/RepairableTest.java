package bnb.java.genie;

public class RepairableTest {

	Tank tank = new Tank();
	DropShip dropShip = new DropShip();
	Marine marine = new Marine();
	SCV scv = new SCV();

	class AirUnit extends Unit2 {
		AirUnit(int hp) {
			super(hp);
		}
	}

	class Unit2 {
		int hitPoint;
		final int MAX_HP;

		Unit2(int hp) {
			MAX_HP = hp;
		}
	}

	class GroundUnit extends Unit {
		GroundUnit(int hp){
			super(hp);
		}
	}
	
	interface Repairable{}
	
	class Unit{
		int hitPoint;
		final int MAX_HP;
		Unit(int hp){
			MAX_HP = hp;
		}
	}
	
	class Tank extends GroundUnit implements Repairable{

		Tank() {
			super(150);
			hitPoint = MAX_HP;
		}
		
		public String toString() {
			return "Tank";
		}
	}

	
	class DropShip extends AirUnit implements Repairable {
		DropShip(){
			super(125); // dropship의 hp는 125이다
			hitPoint = MAX_HP;
		}

		public String toString() {
			return "Dropship";
		}
	}

	class Marine extends GroundUnit {
		Marine() {
			super(40);
			hitPoint = MAX_HP;

		}
	}

	class SCV extends GroundUnit implements Repairable {
		SCV() {
			super(60);
			hitPoint = MAX_HP;
		}

		void repair(Repairable r) {
			if (r instanceof Unit2) {
				Unit2 u = (Unit2) r;
				while (u.hitPoiint != u.MAX_HP) {
					u.hitPoint++;
				}
				System.out.println(u.toString() + "의 수리가 맡겼습니다");
			}
		}
	}
}
