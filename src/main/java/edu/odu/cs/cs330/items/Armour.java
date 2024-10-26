package edu.odu.cs.cs330.items;

import java.util.Scanner;

/**
 * This class represents one piece of armour--as found in most video games.
 * This includes boots and helmets.
 *
 * Armour may not be stacked.
 */
public class Armour extends Item {
    /**
     * Durability decreases each time armour is used.
     */
    protected int durability;

    /**
     * The amount of damage that can be negated.
     */
    protected int  defense;

    /**
     * Base material out of which the armour is constructed.
     */
    protected String material;

    /**
     * Type of enchantment afforded (e.g. protection, feather_falling, or
     * unbreaking)
     */
    protected String modifier;

    /**
     * Enchantment level applied.
     */
    protected int modiferLevel;

    /**
     * Associated element--e.g., ice, fire, and lightning.
     */
    protected String element;

    /**
     * Default to a armour with an empty name, zero durability, zero defense,
     * blank material, no modifier a zero modifier level, and a blank element.
     */
    public Armour()
    {
        // Initialize all data members (including those inherited from Item)
        super("", false);
        this.durability = 0;
        this.defense = 0;
        this.material = "";
        this.modifier = "";
        this.modiferLevel = 0;
        this.element = "";
    }

    /**
     * Duplicate a piece of armour.
     *
     * @param src armour to duplicate
     */
    public Armour(Armour src)
    {
        // Set and/or copy data members for *this* object based on *src*.
        super.name=src.name;
        super.stackable=false;
        this.durability = src.durability;
        this.defense = src.defense;
        this.material = src.material;
        this.modifier = src.modifier;
        this.modiferLevel = src.modiferLevel;
        this.element = src.element;
    }

    /**
     * Retrieve armour durability.
     */
    public int getDurability()
    {
        return this.durability;
    }

    /**
     * Set armour durability.
     *
     * @param dur new durability value
     */
    public void setDurability(int dur)
    {
        this.durability = dur;
    }

    /**
     * Retrieve armour defense.
     *
     * @return total defense provided
     */
    public int getDefense()
    {
        return this.defense;
    }

    /**
     * Update defense.
     *
     * @param def replacement defense
     */
    public void setDefense(int def)
    {
        this.defense = def;
    }

    /**
     * Retrieve armour material.
     *
     * @return base material
     */
    public String getMaterial()
    {
        return this.material;
    }

    /**
     * Set armour Material.
     *
     * @param mat replacement material type
     */
    public void setMaterial(String mat)
    {
        this.material = mat;
    }

    /**
     * Retrieve armour modifier.
     *
     * @return buff/debuff provided
     */
    public String getModifier()
    {
        return this.modifier;
    }

    /**
     * Set armour modifier.
     *
     * @param mod updated modifier
     */
    public void setModifier(String m)
    {
        this.modifier = m;
    }

    /**
     * Retrieve armour modifier level.
     *
     * @return buff/debuff level
     */
    public int getModifierLevel()
    {
        return this.modiferLevel;
    }

    /**
     * Set armour modifier level.
     *
     * @param level replacement modifier level
     */
    public void setModifierLevel(int level)
    {
        this.modiferLevel = level;
    }

    /**
     * Retrieve armour element.
     *
     * @return element
     */
    public String getElement()
    {
        return this.element;
    }

    /**
     * Set armour element.
     *
     * @param ele new element
     */
    public void setElement(String ele)
    {
        this.element = ele;
    }

    @Override
    public boolean isStackable()
    {
        return this.stackable;
    }

    /**
     * Read Armour attributes.
     */
    @Override
    public void read(Scanner snr)
    {   
        // Complete this method
        super.name = snr.next();
        super.stackable = false;
        this.material = snr.next();
        this.durability = snr.nextInt();
        this.defense = snr.nextInt();
        this.modifier = snr.next();
        this.modiferLevel = snr.nextInt();
        this.element = snr.next();
    }

    /**
     * Clone--i.e., copy--this Armour.
     */
    @Override
    public Item clone() 
    {
        // Replace the next line
        Armour clonedArmour = new Armour(this);
        return clonedArmour;
    }

    /**
     * *Print* one Armour.
     */
    @Override
    public String toString()
    {
        StringBuilder strBld = new StringBuilder();
        strBld.append(String.format("  %s %s%n","Nme:",this.name));
        strBld.append(String.format("  %s %s%n","Dur:",this.durability));
        strBld.append(String.format("  %s %s%n","Def:",this.defense));
        strBld.append(String.format("  %s %s%n","Mtl:",this.material));
        strBld.append(String.format("  %s %s (%s %s)%n","Mdr:",this.modifier,"Lvl",this.modiferLevel));
        strBld.append(String.format("  %s %s%n","Emt:",this.element));
        return strBld.toString();
    }
}




