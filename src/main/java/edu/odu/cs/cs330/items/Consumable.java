package edu.odu.cs.cs330.items;

import java.util.Scanner;

/**
 * This class represents one Consumable Item--as found in most video games.
 * This includes food.
 *
 * Consumable Items must be stackable.
 */
public class Consumable extends Item {
    /**
     * The effect "buff" or "debuff" that is received when using this item.
     */
    protected String effect;

    /**
     * The number of times this item can be used.
     */
    protected int uses;

    /**
     * Default to a Consumable Item with an empty name, no effect and zero
     * uses.
     */
    public Consumable()
    {
        super("", true);

        this.effect = "";
        this.uses   = 0;
    }

    /**
     * Create a copy of this Consumable.
     *
     * @param src consumable item to duplicate
     */
    public Consumable(Consumable src)
    {
        // Complete this method
        super.name=src.name;
        super.stackable=true;
        this.effect=src.effect;
        this.uses=src.uses;
        
    }

    /**
     * Retrieve the effect.
     *
     * @return the set effect (i.e., buff or debuff)
     */
    public String getEffect()
    {
        return this.effect;
    }

    /**
     * Set a new buff or debuff.
     *
     * @param newEff replacement effect
     */
    public void setEffect(String newEff)
    {
        this.effect = newEff;
    }

    /**
     * Retrieve permitted number of uses.
     *
     * @return number of total uses
     */
    public int getNumberOfUses()
    {
        return this.uses;
    }

    /**
     * Set the number of permitted uses.
     *
     * @param allowed number of allowed uses
     */
    public void setNumberOfUses(int allowed)
    {
        this.uses = allowed;
    }

    /**
     * Read Consumable Item attributes.
     */
    @Override
    public void read(Scanner snr)
    {
        // Complete this method
        super.name = snr.next();
        super.stackable = true;
        this.effect = snr.next();
        this.uses = snr.nextInt();
    }

    /**
     * Clone--i.e., copy--this Consumable Item.
     */
    @Override
    public Item clone()
    {
        Consumable clonedConsumable = new Consumable(this);
        return clonedConsumable;
    }

    /**
     * *Print* the Consumable Item
     */
    @Override
    public String toString()
    {
        StringBuilder strBld = new StringBuilder();
        strBld.append(String.format("  %s %s%n","Nme:",this.name));
        strBld.append(String.format("  %s %s%n","Eft:",this.effect));
        strBld.append(String.format("  %s %s%n","Use:",this.uses));
        return strBld.toString();
    }
}