package maceraOyunu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class BattleLoc extends Location {


    private Monster monster;
    private String award;
    List<Monster> monsters = new ArrayList<>();

    public BattleLoc(Player player, String LocName, Monster monster) {
        super(player, LocName);
        this.monster = monster;

    }

    @Override
    public boolean onLocatin(){
        return combat();
    }

    public boolean combat(){

        for(int i = 0; i < monsters.size(); i++){
            boolean isFinish = false;
            while(true){
                adjustBlockPower(i);
                if(this.getPlayer().getHealth()>0){
                    System.out.println(this.getPlayer().getCharName()+ " Vurdu;");
                    monsters.get(i).setHealth(monsters.get(i).getHealth()-this.getPlayer().getDamage());
                    printSituation(i);
                    if(monsters.get(i).getHealth() ==0){
                        System.out.println("Sonuç : ");
                        System.out.println((i+1)+ ". "+monsters.get(i).getName()+" Yok Edildi.");
                        printSituation(i);
                        monsters.get(i).setHealth(monsters.get(i).getOrjinalHealth());
                        isFinish=true;
                        break;
                    }
                }

                if(monsters.get(i).getHealth()>0){
                    System.out.println(monsters.get(i).getName()+ " Vurdu;");
                    this.getPlayer().setHealth(this.getPlayer().getHealth()-monsters.get(i).getDamage());
                    printSituation(i);
                    if(this.getPlayer().getHealth()==0) {
                        System.out.println("Sonuç : ");
                        printSituation(i);
                        isFinish=true;
                        break;
                    }
                }
            }if(isFinish==true) break;
        }

        return isWinChapter();
    }

    public void createMonsters(Monster monster){
        int num = rand.nextInt(3)+1;
        for (int i = 0; i < num; i++) {
            monsters.add(monster);
        }
        monster.monsterInfo(monster, num);
        this.getPlayer().characterInfo();
        System.out.println("------------------------------------");

    }

    public void printSituation(int i){
        System.out.println(this.getPlayer().getCharName()+ " Health: "+ this.getPlayer().getHealth() +
                "\n"+monsters.get(i).getName()+ " Health: " + monsters.get(i).getHealth());
        System.out.println("---------------------------------------");

    }

    public boolean isWinChapter() {
        if (this.getPlayer().getHealth() > 0) {
            System.out.println(this.getPlayer().getName() + " " + this.getLocName() + " Bölümünü Kazandınız" +
                    "\nÖdülünüz: " + this.getMonster().getAward());
            this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getMoney());
            System.out.println("Yeni Bütçe: " + this.getPlayer().getMoney());
            switch (monster.getName()) {
                case "Zombi":
                    this.getPlayer().inventory.setFood(true);
                    break;
                case "Vampir":
                    this.getPlayer().inventory.setFireWood(true);
                    break;
                case "Ayı":
                    this.getPlayer().inventory.setWater(true);
                    break;
            }
            return true;

        }
        return false;
    }

    public void adjustBlockPower(int i){
        if(this.getPlayer().inventory.getArmorBlockPower() < monsters.get(i).getDamage()){
            monsters.get(i).setDamage(monsters.get(i).getDamage()-this.getPlayer().inventory.getArmorBlockPower());
        }else{
            monsters.get(i).setDamage(0);
        }
    }




    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }







}
