/*
 * Title: Text Based RPG
 * Filename: Player.java
 *
 */

public class Player {
    
    //Player stats
    private int HP;
    private int level;
    private int exp;

    //Setters and Getters
        //Player HP
    public void setHP(int hp)
    {
        HP = hp;
    }
    public int getHP()
    {
        return HP;
    }

        //Player level
    public void setLvl(int lvl)
    {
        level = lvl;
    }
    public int getLvl()
    {
        return level;
    }

        //Player exp
    public void setExp(int exp)
    {
        exp = exp;
    }
    public int getExp()
    {
        return exp;
    }
    
}
