package estore;

public class Item {

    private int quantityOfProduct;
    private Product product;

    public Item(int quantityOfProduct, Product product) {
        this.quantityOfProduct = quantityOfProduct;
        this.product = product;
    }

    public int getQuantityOfProduct() { return quantityOfProduct; }
    public Product getProduct(){ return product; }


public String toString(){
        return String.format("""
                Item Quantity: %d
                Item: %s
                
                """, quantityOfProduct, product);
}


}
