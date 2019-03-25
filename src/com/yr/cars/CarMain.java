package com.yr.cars;

public class CarMain {
	
	public static void main(String[] args) {
		Car c1 = new Car();  // 객체 생성
		
		c1.wheel=4;
		c1.color="pink";
		c1.size="대형";
		c1.company="BMW";
		
		Car c2 = new Car();  
		// 깊은 복사
		c2.wheel=c1.wheel;
		c2.color=c1.color;
		c2.size=c1.size;
		c2.company=c1.company;
		
		Car c3 = c1; // 얕은복사
		
		c2.color = "red";
		
		
		System.out.println(c1.color);
		
		Bike b1 = new Bike();
		b1.wheel=2;
		b1.color="white";
		b1.company="Honda";
		
		// Engine
		System.out.println(c1);
		
		// Engine engine = new Engine();
		// c1.engine = engine;
		// engine.hp=100;
		// engine.fuel="gas";
		// c1.engine.cc=1000;
		
		c1.engine = new Engine();
		
		c1.engine.hp=100;
		c1.engine.fuel="gas";
		c1.engine.cc=1000;
		
		System.out.println(c1.engine.fuel);
		
		// ================================================
		
		Airplane airplane = new Airplane();
		airplane.engine = new Engine[2];
		
		airplane.engine[0] = new Engine();
		airplane.engine[1] = new Engine();
		
		airplane.engine[0].hp=10000;
		airplane.engine[0].fuel="gas";
		
		
		//airplane.engine = new Engine();
		// airplane.engine2 = airplane.engine; // 문법상 O 같은 객체를 같이 쓰겠다--->X
		//airplane.engine2=new Engine();
		
		
		System.out.println(airplane.engine);
		
		Airplane airplane2 = new Airplane();
		
		airplane2.engine = new Engine[120];
		
		
		for (int i=0; i<airplane2.engine.length; i++) {
			airplane2.engine[i] = new Engine();
			airplane2.engine[i].hp=1000;
			airplane2.engine[i].fuel="항공유";
			airplane2.engine[i].cc=30000;
			
			//Engine e = new Engine();
			//e.hp=1000;
			//e.fuel="항공유";
			//e.cc=30000;
			//airplane2.engine[i]=e;
		}
			
		
		
		
		
	}
}
