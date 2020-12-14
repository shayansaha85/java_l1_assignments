package com.assginment3;

public class Test {
	public static void main(String[] args) {
		Instrument[] instrument = new Instrument[10];
		instrument[0] = new Piano();
		instrument[1] = new Flute();
		instrument[2] = new Guitar();
		instrument[3] = new Piano();
		instrument[4] = new Flute();
		instrument[5] = new Piano();
		instrument[6] = new Flute();
		instrument[7] = new Guitar();
		instrument[8] = new Piano();
		instrument[9] = new Flute();
		
		for(int i=0;i<10;i++) {
			if(instrument[i] instanceof Piano) {
				instrument[i].play();
			} else if(instrument[i] instanceof Flute) {
				instrument[i].play();
			} else {
				instrument[i].play();
			}
		}
	}
}
