
package SingleResponsibility.example1.before_apply_it;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    private List<Item> cartItems= new ArrayList<>();

   public boolean addToCart(Item item){

       // check available quantity
       if(Inventory.isItemExist(item)) {
           double quantityInInventory = item.getQuantity();

           if ( quantityInInventory >= item.getQuantity()) {
               cartItems.add(item);
               return true;
           }
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

    public void CreateInvoice(){

        // get customer data
        //save in database
        // print the invoice
        // send this to the customer email
    }

    public List<Item> getCartItems() {
        return cartItems;
    }
 
}
