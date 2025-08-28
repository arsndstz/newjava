/*
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 */

package procpkg;

public class Character {
	
	// フィールド
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defence;
	
	// コンストラクタ
	public Character(String name) {
		this.name = name;
	}
	
	// ゲッター
	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getMp() {
		return mp;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getDefence() {
		return defence;
	}
	
	// セッター
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	// ステータス表示メソッド
	public void displayStatus() {
		System.out.println("こんにちは「" + name + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + hp);
		System.out.println("MP：" + mp);
		System.out.println("攻撃力：" + attack);
		System.out.println("素早さ：" + speed);
		System.out.println("防御力：" + defence);
		System.out.println("さあ冒険に出かけよう！");
	}

}
