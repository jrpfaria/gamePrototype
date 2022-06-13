import java.util.Scanner;

public class Interface{
    
    // scanner variable for the player to pick his moves
    public static final Scanner sc = new Scanner(System.in);
    
    public int getAction(){
        return sc.nextInt();
    }
    
    // text messages
    public void welcome(){
        System.out.println("Welcome Hero! It's time to fight the monster!");
    }
    
    public void menu(double monsterhp, double playerhp, double pdbuff, double pabuff, double mdbuff, double mabuff){
        System.out.printf("\nMonster hp = %3.1f\nPlayer hp = %3.1f\n", monsterhp, playerhp);
        System.out.printf("\nPlayer damage scaling: %3.2f\nPlayer armor scaling: %3.2f\n", pdbuff, pabuff);
        System.out.printf("\nMonster damage scaling: %3.2f\nMonster armor scaling: %3.2f\n\n", mdbuff, mabuff);
        System.out.printf("1. Attack\n2. Heal\n3. Buff Attack\n4. Buff Armor\n5. Debuff Monster Attack\n6. Debuff Monster Armor\n7. Run\n");
    }
    
    public void playerLost(){
        System.out.println("You Lost.");
    }
    
    public void monsterDied(){
        System.out.println("You did it! You defeated the monster!");
    }
    
    public void playerAttacked(){
        System.out.println("You attacked the monster!");
    }
    
    public void monsterAttacked(){
        System.out.println("You were attacked by the monster.");
    }
    
    public void playerHealed(){
        System.out.println("You healed yourself");
    }
    
    public void playerIsFullHp(){
        System.out.println("You can't heal yourself anymore, your health is already full.");
    }
    
    public void monsterHealed(){
        System.out.println("The monster healed itself.");
    }

    public void playerFled(){
        System.out.println("You ran.");
    }
    
    public void playerDidntFlee(){
        System.out.println("You couldn't run.");
    }

    public void playerDamageGotBuffed(){
        System.out.println("Your damage scaling increased.");
    }
    
    public void playerArmorGotBuffed(){
        System.out.println("Your armor scaling increased.");
    } 
    
    public void playerDamageGotDebuffed(){
        System.out.println("Your damage scaling decreased.");
    }
    
    public void playerArmorGotDebuffed(){
        System.out.println("Your damage scaling decreased.");
    }
    
    public void monsterDamageGotBuffed(){
        System.out.println("The monster's damage scaling increased.");
    }
    
    public void monsterArmorGotBuffed(){
        System.out.println("The monster's armor scaling increased.");
    } 
    
    public void monsterDamageGotDebuffed(){
        System.out.println("The monster's damage scaling decreased.");
    }
    
    public void monsterArmorGotDebuffed(){
        System.out.println("The monster's scaling decreased.");
    }
}
