/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.furniture;

import java.util.HashMap;

/**
 *
 * @author abinesh-b
 */
public interface FurnitureOrderInterface
{

    /**
     * Adds the furniture and its count to the order map. The type argument must
     * specify the type of the furniture that is non-null. The count argument
     * represents the count of furniture that is to be ordered.
     * <p>
     * This method doesn't return anything. It adds the count to the furniture
     * specified as the arguments.</p>
     *
     * @param type represents type of the furniture
     * @param count represents the count of furniture to be ordered
     */
    public void addToOrder(Furniture type, int count);

    /**
     * Returns the ordered furniture with their count.
     * <p>
     * This method returns the map that consists of the ordered furniture and
     * their count. </p>
     *
     * @return map represents furniture ordered and their count
     */
    public HashMap getOrderedFurniture();

    /**
     * Returns the count of ordered furniture of the type.
     * <p>
     * This method returns the integer value that represents the count of
     * furnitures ordered of the specified type. </p>
     *
     * @param type represents the furniture type whose count should be
     * calculated
     * @return the count of furnitures ordered of the specified type
     */
    public int getTypeCount(Furniture type);

    /**
     * Returns the cost of the specified furniture.
     * <p>
     * This method returns the float value that represents the cost of the
     * specified furniture type. </p>
     *
     * @param type represents the furniture type for which cost has to be
     * calculated
     * @return represents the cost of the specified furniture type
     */
    public float getTypeCost(Furniture type);

    /**
     * Returns the cost of all the ordered furnitures.
     * <p>
     * This method returns the float value that represents the cost of all the
     * furnitures ordered. </p>
     *
     * @return float value represents the cost of the total furnitures ordered
     */
    public float getTotalOrderCost();

    /**
     * Returns the total quantities of all the furnitures ordered.
     * <p>
     * This method returns the integer value that consists of the count of
     * ordered furnitures. </p>
     *
     * @return integer value represents the count of ordered furnitures
     */
    public int getTotalOrderQuantity();
}
