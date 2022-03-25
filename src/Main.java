import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addBook(new Book("Dostoevski", 650, 1));
        shop.addBook(new Book("Onegin", 700, 1));
        shop.addBook(new Book("Pushkin", 800, 1));
        shop.addCake(new Cake("Napoleon", 650, 2500, 5));
        shop.addCake(new Cake("Zebra", 750, 3000, 5));
        shop.addCake(new Cake("Polyot", 550, 2000, 7));
        shop.addSoap(new Soap("Soap", 120, 400));

        System.out.println(Arrays.toString(shop.sortByShelfLive(8)));
        System.out.println();
        System.out.println(shop.productCount());
        System.out.println();
        System.out.println(Arrays.toString(shop.newArrayByPrice(200)));
        System.out.println();
        shop.allProductInfo();
        System.out.println();
        System.out.println(Arrays.toString(shop.productInfo("soap")));
        System.out.println();
        System.out.println(Arrays.toString(shop.findBooks()));
        System.out.println(Arrays.toString(shop.findCakes()));
        System.out.println(Arrays.toString(shop.findSoaps()));
    }
}
