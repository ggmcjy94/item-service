package hello.itemservice.domain.item;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Item {

    private  Long id;
    private String itemName;
    private Integer price;
    private Integer quantity; //int 를 쓰면 0 이라도 들어가야한다. null 이 못들어가므로


    public Item() {

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
