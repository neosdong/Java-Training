package com.neosdong;

public class TestFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HairCutSkill hairCutSkill01 = HairCutFactory.getHairCutSkill("left");
		hairCutSkill01.doHairCut();
		
		HairCutSkill hairCutSkill02 = HairCutFactory.getHairCutSkill("right");
		hairCutSkill02.doHairCut();
	}

}
