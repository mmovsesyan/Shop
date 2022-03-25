public class Shop implements BookShop, SoapShop, CakeShop, ShelfLive {
    private Product[] products = new Product[100];


    //Добавление товаров
    int index = 0;

    @Override
    public void addBook(Book book) {
        products[index] = book;
        index++;
    }

    @Override
    public void addCake(Cake cake) {
        products[index] = cake;
        index++;
    }

    @Override
    public void addSoap(Soap soap) {
        products[index] = soap;
        index++;
    }

    //Количество товаров
    public int productCount() {
        return index;
    }


    //Сортировка по сроку годности
    @Override
    public Object[] sortByShelfLive(int shelfLive) {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getShelfLive() >= shelfLive || products[i].getShelfLive() == -1) {
                count++;
            }
        }
        Product[] newProducts = new Product[count];
        int id = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getShelfLive() >= shelfLive || products[i].getShelfLive() == -1) {
                newProducts[id] = products[i];
                id++;
            }
        }
        return newProducts;
    }

    //новый массив меньше цены
    public Product[] newArrayByPrice(int price) {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getPrice() < price) {
                count++;
            }
        }
        Product[] newProducts = new Product[count];
        int id = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getPrice() < price) {
                newProducts[id] = products[i];
                id++;
            }
        }
        return newProducts;
    }

    //информация о товарах
    public void allProductInfo() {
        for (int i = 0; i < index; i++) {
            System.out.println(products[i].toString());
        }
    }

    //НАБОР ТОВАРОВ по имени из прошлого дз
    public Product[] productInfo(String name) {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getCategory().toLowerCase().contains(name.toLowerCase())) {
                count++;
            }
        }
        Product[] newProducts = new Product[count];
        int id = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getCategory().toLowerCase().contains(name.toLowerCase())) {
                newProducts[id] = products[i];
                id++;
            }
        }
        return newProducts;
    }

    //массив по имени товара
    @Override
    public Book[] findBooks() {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getCategory().equalsIgnoreCase("book")) {
                count++;
            }
        }
        Book[] books = new Book[count];
        int id = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getCategory().equalsIgnoreCase("book")) {
                books[id] = (Book) products[i];
                id++;
            }
        }
        return books;
    }

    @Override
    public Soap[] findSoaps() {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getCategory().equalsIgnoreCase("soap")) {
                count++;
            }
        }
        Soap[] soaps = new Soap[count];
        int id = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getCategory().equalsIgnoreCase("soap")) {
                soaps[id] = (Soap) products[i];
                id++;
            }
        }
        return soaps;
    }

    @Override
    public Cake[] findCakes() {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getCategory().equalsIgnoreCase("cake")) {
                count++;
            }
        }
        Cake[] cakes = new Cake[count];
        int id = 0;
        for (int i = 0; i < index; i++) {
            if (products[i].getCategory().equalsIgnoreCase("cake")) {
                cakes[id] = (Cake) products[i];
                id++;
            }
        }
        return cakes;
    }
}
