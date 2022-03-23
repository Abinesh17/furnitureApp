/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.furniture;

/**
 * Furnitures that can be sold
 *
 * {@link #CHAIR}
 * {@link #TABLE}
 * {@link #COUCH}
 *
 * @author abinesh-b
 */
public enum Furniture
{
    /**
     * A Chair
     */
    CHAIR("chair", 100.0f),
    /**
     * A Table
     */
    TABLE("table", 200.0f),
    /**
     * A Couch
     */
    COUCH("couch", 300.0f);

    private final String label;
    private final float cost;

    private Furniture(String label, float cost)
    {
        this.label = label;
        this.cost = cost;
    }

    /**
     *
     * @return A String represents the label of the furniture type
     */
    public String label()
    {
        return label;
    }

    /**
     *
     * @return A float value represents the cost of the furniture type
     */
    public float cost()
    {
        return cost;
    }

}
