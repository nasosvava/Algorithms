/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour.entities;

/**
 *
 * @author George
 */
public class TShirt  {
    
    private String name;
    private double price; 
    private Color color; 
    private Size size; 
    private Fabric fabric; 
    

    public TShirt() {
    }
    


    public TShirt(String name, double price, Color color, Size size, Fabric fabric) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }
    
    
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public Color getColor() {
        return color;
    }

    public void setColor(Color Color) {
        this.color = Color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size Size) {
        this.size = Size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TShirt{name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", color=").append(color);
        sb.append(", size=").append(size);
        sb.append(", fabric=").append(fabric);
        sb.append('}');
        return sb.toString();
    }

  





 

 

}
    
    
    
   