public class Game{
    
    private final Interface infos;
    private final GameData gdata;
    
    public Game(){
        this.infos = new Interface();
        this.gdata = new GameData();
    }
    
    public static void main(String[] args){
        Game game = new Game();
        game.startUp();
    }
    
    private void startUp(){
        infos.welcome();
        while(true){
            if(gdata.isPlayerDead()){
                infos.playerLost();
                break;
            }
            if(gdata.isMonsterDead()){
                infos.monsterDied();
                break;
            }
            infos.menu(gdata.monsterHp(), gdata.playerHp(), gdata.playerDamageBuff(), gdata.playerArmorBuff(), gdata.monsterDamageBuff(), gdata.monsterArmorBuff());
            switch (infos.getAction()){
                case 1:
                    infos.playerAttacked();
                    gdata.damageMonster();
                    break;
                case 2:
                    if (gdata.playerHp()==100){
                        infos.playerIsFullHp();
                        continue;
                    }
                    infos.playerHealed();
                    gdata.healPlayer();
                    break;
                case 3:
                    gdata.buffPlayerDamage(1);
                    infos.playerDamageGotBuffed();
                    break;
                case 4:
                    gdata.buffPlayerArmor(1);
                    infos.playerArmorGotBuffed();
                    break;
                case 5:
                    gdata.buffMonsterDamage(-1);
                    infos.monsterDamageGotDebuffed();
                    break;
                case 6:
                    gdata.buffMonsterArmor(-1);
                    infos.monsterArmorGotDebuffed();
                    break;
                case 7:
                    if(gdata.canPlayerFlee()){
                        infos.playerFled();
                        System.exit(0);
                    }
                    infos.playerDidntFlee();
                    break;
                default:
                    continue;
            }
            switch (gdata.monsterAction()) {
                case 1:
                    infos.monsterAttacked();
                    gdata.damagePlayer();
                    break;
                case 2:
                    infos.monsterHealed();
                    gdata.healMonster();
                    break;
                case 3:
                    gdata.buffMonsterDamage(1);
                    infos.monsterDamageGotBuffed();
                    break;
                case 4:
                    gdata.buffMonsterArmor(1);
                    infos.monsterArmorGotBuffed();
                    break;
                case 5:
                    gdata.buffPlayerDamage(-1);
                    infos.playerDamageGotDebuffed();
                    break;
                case 6:
                    gdata.buffPlayerArmor(-1);
                    infos.playerArmorGotDebuffed();
                    break;
            }
        }
    }
}
