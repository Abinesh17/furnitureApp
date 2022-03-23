/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.furniture;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author abinesh-b
 */
public class FurnitureOrderTest
{

    static FurnitureOrderInterface furnitureOrderObj = null;
    static Map<Furniture, Integer> order = null;

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        furnitureOrderObj = new FurnitureOrder();
        order = new HashMap<>();
        order.put(Furniture.TABLE, 2);
        order.put(Furniture.CHAIR, 3);
        order.put(Furniture.COUCH, 4);

    }

    public static void main(String[] args)
    {
        FurnitureOrderTest test = new FurnitureOrderTest();
        test.testGetTypeCost();
    }

    @Test
    public void testAddToOrder()
    {
        order.entrySet().forEach((Map.Entry<Furniture, Integer> entry) ->
        {
            furnitureOrderObj.addToOrder(entry.getKey(), entry.getValue());
        });
    }

    @Test
    public void testGetOrderedFurniture()
    {
        HashMap<Furniture, Integer> orderMap = furnitureOrderObj.getOrderedFurniture();
        assertEquals(orderMap, order);
    }

    @Test
    public void testGetTypeCount()
    {
        for (Furniture type : Furniture.values())
        {
            int originalCount = order.get(type);
            int mapCount = furnitureOrderObj.getTypeCount(type);
            assertEquals(originalCount, mapCount);
        }
    }

    @Test
    public void testGetTypeCost()
    {
        for (Furniture type : Furniture.values())
        {
            assertEquals(type.cost(), furnitureOrderObj.getTypeCost(type), 1000000);
        }
    }

    @Test
    public void testGetTotalOrderCost()
    {
        assertEquals(2000, furnitureOrderObj.getTotalOrderCost(), 1000000);
    }

    @Test
    public void testGetTotalOrderQuantity()
    {
        assertEquals(9, furnitureOrderObj.getTotalOrderQuantity());
    }

}
