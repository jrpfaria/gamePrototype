public class GameData{
    
    private final Monster monster;
    private final Player player;
    private int playerdamagebuffcount = 4;
    private int monsterdamagebuffcount = 4;
    private int playerarmorbuffcount = 4;
    private int monsterarmorbuffcount = 4;

    public GameData(){
        this.monster = new Monster();
        this.player = new Player();
    }
    
    // check stats
    public double playerHp(){
        return player.hp();
    }
    
    public double monsterHp(){
        return monster.hp();
    }
    
    public double playerDamageBuff(){
        return player.damagebuff();
    }
    
    public double playerArmorBuff(){
        return player.armorbuff();
    }
    
    public double monsterDamageBuff(){
        return monster.damagebuff();
    }
    
    public double monsterArmorBuff(){
        return monster.armorbuff();
    }
    
    // monster move generator
    public int monsterAction(){
        double action = Math.random();
        if (action <= 0.33) return 1;
        else if (action <= 0.6) return 2;
        else if (action <= 0.7) return 3;
        else if (action <= 0.8) return 4;
        else if (action <= 0.9) return 5;
        else return 6;
    }
    
    // check if player and monster are still alive
    public boolean isPlayerDead(){
        return (player.hp() <= 0);
    }
    
    public boolean isMonsterDead(){
        return (monster.hp() <= 0);
    }
    
    // damages and heals between player and monster
    public void damagePlayer(){
        double damage = player.damage()*player.damagebuff() - monster.armor()*monster.armorbuff();
        //if (willItCrit()) player.getDamaged(2*damage);
        /*else*/ player.getDamaged(damage);
    }
    
    public void damageMonster(){
        double damage = monster.damage()*monster.damagebuff() - player.armor()*player.armorbuff();
        //if (willItCrit()) monster.getDamaged(2*damage);
        /*else*/ monster.getDamaged(damage);
    }
    
    public void healPlayer(){
        player.heal();
    }
    
    public void healMonster(){
        monster.heal();
    }
    
    // critial damage
    public boolean willItCrit(){
        return Math.random()<=0.25;
    }
    
    // chance of running from the monster
    public boolean canPlayerFlee(){
        return (Math.random()<=0.5);
    }
    
    // damage and armor increases
    public void buffPlayerDamage(int type){
        if (type == -1 && playerdamagebuffcount != 0){
            playerdamagebuffcount--;
            player.changeDamageMulti(playerdamagebuffcount);
        }
        if (type == 1 && playerdamagebuffcount != 9){ 
            playerdamagebuffcount++;
            player.changeDamageMulti(playerdamagebuffcount);
        }
    }
    
    public void buffPlayerArmor(int type){
        if (type == -1 && playerarmorbuffcount != 0){
            playerarmorbuffcount--;
            player.changeArmorMulti(playerarmorbuffcount);
        }
        if (type == 1 && playerarmorbuffcount != 9){
            playerarmorbuffcount++;
            player.changeArmorMulti(playerarmorbuffcount);
        }
    }
    
    public void buffMonsterDamage(int type){
        if (type == -1 && monsterdamagebuffcount != 0){
            monsterdamagebuffcount--;
            monster.changeDamageMulti(monsterdamagebuffcount);
        }
        if (type == 1 && monsterdamagebuffcount != 9){
            monsterdamagebuffcount++;
            monster.changeDamageMulti(monsterdamagebuffcount);
        }
    }
    
    public void buffMonsterArmor(int type){
        if (type == -1 && monsterarmorbuffcount != 0){
            monsterarmorbuffcount--;
            monster.changeArmorMulti(monsterarmorbuffcount);
        }
        if (type == 1 && monsterarmorbuffcount != 9){
            monsterarmorbuffcount++;
            monster.changeArmorMulti(monsterarmorbuffcount);
        }
    }
}
