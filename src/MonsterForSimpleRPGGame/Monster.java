package MonsterForSimpleRPGGame;

public abstract class Monster implements Bleedable, Poisionable{

    String name ;
    int hitPoints ;
    double damage ;
    public Monster (String name, int hitPoints,double damage){

        this.name = name ;
        this.hitPoints = hitPoints;
        this.damage=damage;
    }

    public double getDamage() {
        return damage;
    }
    public String getName (){
        return name;
    }
    public int getHitPoints (){
        return hitPoints;
    }
    public double attack (){
        return getDamage()+bleed()+ poison () ;
    }
}
