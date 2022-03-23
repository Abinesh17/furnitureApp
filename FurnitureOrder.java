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
public class FurnitureOrder implements FurnitureOrderInterface
{

    HashMap<Furniture, Integer> order = new HashMap<>();

    @Override
    public void addToOrder(Furniture type, int count)
    {
        if (type != null)
        {
            int prevCount = 0;
            if (order.containsKey(type))
            {
                prevCount = order.get(type);
            }
            order.put(type, prevCount + count);
        }
    }

    @Override
    public HashMap<Furniture, Integer> getOrderedFurniture()
    {
        return order;
    }

    @Override
    public int getTypeCount(Furniture type)
    {
        if (type != null)
        {
            return order.getOrDefault(type, 0);
        }
        return 0;
    }

    @Override
    public float getTypeCost(Furniture type)
    {
        return type.cost();
    }

    @Override
    public float getTotalOrderCost()
    {
        float totalOrderCost = 0;
        totalOrderCost = order.entrySet().stream().map((entry) -> entry.getKey().cost() * entry.getValue()).reduce(totalOrderCost, (accumulator, item) -> accumulator + item);
        return totalOrderCost;
    }

    @Override
    public int getTotalOrderQuantity()
    {
        int totalOrderQuantity = 0;
        totalOrderQuantity = order.entrySet().stream().map((entry) -> entry.getValue()).reduce(totalOrderQuantity, Integer::sum);
        return totalOrderQuantity;
    }

}
