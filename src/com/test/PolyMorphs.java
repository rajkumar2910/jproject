package com.test;

public class PolyMorphs extends MethodOverride {
	public void metA(int id) {
		System.out.println(id);	
	}
	public void metA(long ph) {
		System.out.println(ph);
		}
	public void metA(int id ,String name) {
		System.out.println(id+name);

	}

	@Override
	public void methA(float f) {
		System.out.println(f);
	}	


	
	public static void main(String[] args) {
		PolyMorphs p=new PolyMorphs();
		p.metA(12334);
		p.metA(987654245566l);
		p.metA(12, "rajkumar");
		p.methA(23.678f);
		
		
	}

}
