package com.tec.hasarealation;

public class Rachitha {

	public static void main(String[] args) {
		Processor p=new Processor("intel i11", 4, 2.4);
        HardDisk h =new HardDisk("WD", 1, "SSD");
        Operating o=new Operating("Windows", 11,64);
        Battery b=new Battery(3000 , 3, "Thosibha");
    
		Laptop l=new Laptop(60000, b, o, h, p);// composition with object reference
        System.out.println(l);
	}
	 }

