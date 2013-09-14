package exercicio01.questao03;

public abstract class Character {

	public WeaponBehavior weapon;

	public abstract void figth();
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
		
		this.weapon.useWeapon();
	}
	
	public void useWeapon(){
		this.weapon.useWeapon();
	}
}
