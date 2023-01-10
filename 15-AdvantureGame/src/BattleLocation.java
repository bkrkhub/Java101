
public abstract class BattleLocation extends Location{
	
	protected Obstacle obstacle;
	protected String award;
	
	public BattleLocation(Player player, String name,Obstacle obstacle, String award) {
		super(player);
		this.name = name;
		this.obstacle = obstacle;
		this.award = award;
		
	}
	
	public boolean getLocation() {
		int obsCount = obstacle.count();
		System.out.println("Şuan Buradasınız: " + this.getName());
		System.out.println("Dikkatli Ol! Burada " + obsCount + " tane " + obstacle.getName() + " yaşıyor !");
		System.out.print("<S>avaş veya <K>aç: ");
		String selCase = scan.nextLine();
		selCase = selCase.toUpperCase();
		if(selCase.equals("S")) {
			if(combat(obsCount)) {
				System.out.println(this.getName() + " bölgesindeki tüm düşmanları temizlediniz.");
				if (this.award.equals("Food") && player.getInv().isFood() == false) {
					System.out.println(this.award + " Kazandınız! ");
					player.getInv().setFood(true);
				} else if (this.award.equals("Water") && player.getInv().isWater() == false) {
					System.out.println(this.award + " Kazandınız! ");
					player.getInv().setWater(true);
				} else if (this.award.equals("Firewood") && player.getInv().isFirewood() == false) {
					System.out.println(this.award + " Kazandınız! ");
					player.getInv().setFirewood(true);
				}
				return true;
			}
			if(player.getHealthy() <= 0) {
				System.out.println("Öldünüz !");
				return false;
			}
		}
		return true;
	}
	
	public boolean combat(int obsCount) {
		for(int i = 0; i < obsCount; i++) {
			int defObsHealth = obstacle.getHealth();
			playerStats();
			enemyStats();
			while(player.getHealthy() > 0 && obstacle.getHealth() > 0) {
				System.out.print("<V>ur veya <K>aç: ");
				String selCase = scan.nextLine();
				selCase = selCase.toUpperCase();
				if(selCase.equals("V")) {
					System.out.println("==================");
					System.out.println("Hasar Verdiniz !");
					obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
					afterHit();
					if(obstacle.getHealth() > 0) {
						System.out.println("==================");
						System.out.println("Hasar Aldınız !");
						player.setHealthy(player.getHealthy() - (obstacle.getDamage()-player.getInv().getArmor()));
						afterHit();
					}
				}else {
					return false;
				}
			}
			
			if(obstacle.getHealth() <= 0 && player.getHealthy() > 0) {
				System.out.println("Tehtidi Atlattınız ! ");
				player.setMoney(player.getMoney() + obstacle.getAward());
				System.out.println("Güncel Paranız: " + player.getMoney());
				obstacle.setHealth(defObsHealth);
			}else {
				return false;
			}
			System.out.println("-------------------------");
		 }
		 return true;
	}
	
	public void playerStats() {
		System.out.println("Oyuncu Statları\n--------");
		System.out.println("Can: " + player.getHealthy());
		System.out.println("Hasar: " + player.getTotalDamage());
		System.out.println("Para: " + player.getMoney());
		if(player.getInv().getDamage() > 0 ) {
			System.out.println("Silah: " + player.getInv().getwName());
		}
		if(player.getInv().getArmor() > 0) {
			System.out.println("Zırh: " + player.getInv().getaName());
		}
	}
	
	public void enemyStats() {
		System.out.println(obstacle.getName() + " Değerleri\n--------------");
		System.out.println("Can: " + obstacle.getHealth());
		System.out.println("Hasar: " + obstacle.getDamage());
		System.out.println("Ödül: " + obstacle.getAward());
	}
	public void afterHit() {
		System.out.println("Oyuncu Canı: " + player.getHealthy());
		System.out.println(obstacle.getName() + " Canı: " + obstacle.getHealth());
		System.out.println();
	}
}
