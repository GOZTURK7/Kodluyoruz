package maceraOyunu;

public class ToolStore extends NormalLoc{

    public ToolStore(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocatin() {
        System.out.println("Dükkan Seçin: \n1. Silah Dükkanı\n2. Zırh Dükkanı");
        int store = scan.nextInt();
        switch(store) {
            case 1:
                buyWeapon();
                break;
            case 2:
                buyArmor();
                break;
            default:
                break;

        }



        return true;
    }

    public void buyArmor(){
        System.out.println("ZIRHLAR :");
        Armor [] armors = {
                new Armor(1),
                new Armor(2),
                new Armor(3)
        };
        for(Armor armor : armors){
            System.out.println("ID: "+ armor.getId()+" Zırh :"+armor.getName()+ " Blok Gücü: "+armor.getBlokPower()+ " Para: "+armor.getPrice());
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Almak İstdeğiniz Zırhın ID'sini Girin:");
        int armorSelection = scan.nextInt();
        Armor armor = new Armor(armorSelection);
        if(this.getPlayer().getMoney() >= armor.getPrice()){
            this.getPlayer().inventory.setArmorName(armor.getName());
            this.getPlayer().inventory.setArmorBlockPower(armor.getBlokPower());

        }else{
            System.out.println("Bütçeniz: "+ this.getPlayer().getMoney() + "TL, " +
                    "\nalmak istediğiniz silah: "+ armor.getPrice()+"TL \nBütçeniz Yetersiz.");
            System.out.println("----------------------------------------------------------------------");
        }

        this.getPlayer().characterInfo();
    }

    public void buyWeapon(){
        System.out.println("SİLAHLAR :");
        Weapon [] weapons = {
                new Weapon(1),
                new Weapon(2),
                new Weapon(3)
        };
        for(Weapon weapon : weapons){
            System.out.println("ID: "+ weapon.getId()+" Silah :"+weapon.getName()+ " Hasar: "+weapon.getDamage()+ " Para: "+weapon.getPrice());
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Almak İstdeğiniz Silah ID'sini Girin:");
        int weaponSelection = scan.nextInt();
        Weapon silah = new Weapon(weaponSelection);
        if(this.getPlayer().getMoney() >= silah.getPrice()){
            this.getPlayer().inventory.setWeaponName(silah.getName());
            this.getPlayer().inventory.setWeaponDamage(silah.getDamage());
            this.getPlayer().setDamage(this.getPlayer().getDamage()+ getPlayer().inventory.getWeaponDamage());
            this.getPlayer().setMoney(this.getPlayer().getMoney()-silah.getPrice());
            this.getPlayer().characterInfo();

        }else{
            System.out.println("Bütçeniz: "+ this.getPlayer().getMoney() + "TL, " +
                    "\nalmak istediğiniz silah: "+ silah.getPrice()+"TL \nBütçeniz Yetersiz.");
            System.out.println("----------------------------------------------------------------------");
        }

    }
}
