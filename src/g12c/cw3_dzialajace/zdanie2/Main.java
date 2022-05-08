package g12c.cw3_dzialajace.zdanie2;


    public class Main {

        public static void main(String[] args) {

            Person Wojciech = new Person ("Wojciech", "Wojciech", 10000, 350);

            Products water = new Products("Water", ProductType.Consumable, 5, 500);
            Products juice = new Products("Apple Juice", ProductType.Consumable, 10, 100);
            Products fridge = new Products("Fridge", ProductType.Electronic, 200, 20);
            Products playStation = new Products("Play Station", ProductType.Electronic, 500, 40);
            Products dvd = new Products("Movie Dvd", ProductType.Entertainment, 25, 150);
            Products ticket = new Products("Concert Tickets", ProductType.Entertainment, 90, 110);

            Storage storage_1 = new Storage(1);
            Storage storage_2 = new Storage(5);

            water.setStorage(storage_1);
            juice.setStorage(storage_1);
            fridge.setStorage(storage_2);
            playStation.setStorage(storage_2);

            System.out.println("Czas dostawy wody: " + water.getDeliveryTime());
            System.out.println("Czas dostawy playStation: " + playStation.getDeliveryTime());
            System.out.println("Czas dostawy płyt dvd: " + dvd.getDeliveryTime());

            Products computer = new Products("Komputer stacjonarny", ProductType.Electronic, 1299, 4, storage_2);

            Wojciech.MakeOrder();
            Wojciech.addToCart(water);
            Wojciech.addToCart(playStation);
            Wojciech.addToCart(dvd);

            System.out.println("Twoja zawartość koszyka to: " + Wojciech.Cart());

            Wojciech.removeFromCart(water);

            System.out.println("Twoja zawartość koszyka po usunięciu to: " + Wojciech.Cart());

            try {
                Wojciech.BuyByCard();
            }
            catch (RuntimeException e) {
                System.out.println(e);
            }

            Wojciech.BuyInCash();

            System.out.println(Wojciech);

            System.out.println("Ilość dostępnej wody: " + water.getQuantity());
            System.out.println("Ilość dostępnych płyt dvd: " + dvd.getQuantity());

            water.IncreaseQuantity(100);
            System.out.println("Ilość dostępnych butelek wody po powiększeniu ilości: " + water.getQuantity());

            Wojciech.MakeOrder();
            System.out.println("ID pierwszego koszyka: " + Wojciech.getHistory().get(0).getId());
            System.out.println("ID drugiego koszyka: " + Wojciech.Cart().getId());


        }
}
