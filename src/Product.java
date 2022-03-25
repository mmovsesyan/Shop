public abstract class Product {
    private String description;
    private int price;
    private int weight;
    private String category;
    private int shelfLive;

    public Product(String description, int price, int weight, String category, int shelfLive) {
        this.description = description;
        this.price = price;
        this.weight = weight;
        this.category = category;
        this.shelfLive = shelfLive;
    }

    @Override
    public String toString() {
        if (getCategory().toLowerCase().contains("book".toLowerCase())) {
            return "Book: " + description + "  Price: " + price + "  Weight: " + weight + "  Category: " + category +
                    "  ShelfLive: " + shelfLive;
        }
        if (getCategory().toLowerCase().contains("soap".toLowerCase())) {
            return "Soap " + description + "  Price: " + price + "  Weight: " + weight + "  Category: " + category +
                    "  ShelfLive: " + shelfLive;
        }
        if (getCategory().toLowerCase().contains("cake".toLowerCase())) {
            return "Cake " + description + "  Price: " + price + "  Weight: " + weight + "  Category: " + category +
                    "  ShelfLive: " + shelfLive;
        }
        return description + "  Price: " + price + "  Weight: " + weight + "  Category: " + category +
                "  ShelfLive: " + shelfLive;
    }

    public String getCategory() {
        return category;
    }

    public int getShelfLive() {
        return shelfLive;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
