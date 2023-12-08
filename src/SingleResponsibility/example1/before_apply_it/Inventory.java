
package SingleResponsibility.example1.before_apply_it;


import java.util.ArrayList;
import java.util.List;

public class Inventory {
    
      private static List<Item> items;
      
      public Inventory(){
          
       items=  new ArrayList<>(){{
        add(new Item("123",100,5));
        add(new Item("456",200,10));
        add(new Item("789",300,15));
    }};
       
      }

    public static List<Item> getItems() {
        return items;
    }

    public static Item getSpecificItem(String code){
        for(Item item:items){
            if(item.getCode().equals(code))
                return item;
        }
        return null;
    }

    public static boolean isItemExist(Item item){
       return items.contains(item);
    }


    
}
