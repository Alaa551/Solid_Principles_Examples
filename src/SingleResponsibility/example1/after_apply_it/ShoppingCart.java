
package SingleResponsibility.example1.after_apply_it;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    private List<Item> cartItems= new ArrayList<>();

   public boolean addToCart(Item item){

           if (Inventory.checkAvailableQuantity(item)) {
               cartItems.add(item);
               return true;
           }

       return  false;
   }

   public boolean removeFromCart(Item item){
       if(cartItems.contains(item)){
           cartItems.remove(item);
           return true;
       }
       return false;
   }
    public long getItemsCount(){
        return  cartItems.size();
    }


    public List<Item> getCartItems() {
        return cartItems;
    }
 
}
