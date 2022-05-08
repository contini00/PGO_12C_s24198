package g12c.cw3.zd2;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart currentCart;
    private List<ShoppingCart> history = new ArrayList<>();

    public Person (String name, String surname, double moneyCash, double moneyCard) {
        setName(name);
        setSurname(surname);
        setMoneyInCash(moneyCash);
        setMoneyOnCard(moneyCard);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("You cannot leave name empty.");
        }
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new RuntimeException("You cannot leave surname empty.");
        }
        this.surname = surname;
    }


    public double getMoneyInCash() {
        return moneyInCash;
    }

    public void setMoneyInCash(double moneyInCash) {
        if (moneyInCash < 0) {
            throw new RuntimeException("Your cash cannot be a negative value.");
        }
        this.moneyInCash = moneyInCash;
    }


    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void setMoneyOnCard(double moneyOnCard) {
        if (moneyOnCard < 0) {
            throw new RuntimeException("Your balance cannot be a negative value.");
        }
        this.moneyOnCard = moneyOnCard;
    }


    public void MakeOrder() {
        if (this.currentCart != null) {
            throw new RuntimeException("You can only have one cart.");
        }
        this.currentCart = new ShoppingCart();
    }


    public void addToCart(Products product) {
        if (!product.isAvailable()) {
            throw new RuntimeException("Product you choose isn't available.");
        }
        this.currentCart.products.add(product);
        product.decreasePiecesAvailable();
    }


    public void removeFromCart(Products product) {
        if (product == null || !this.Cart().products.contains(product)) {
            throw new RuntimeException("You donnot have this product in your cart");
        }
        product.increasePiecesAvailable();
        this.Cart().products.remove(product);
    }

    public void removeAll() {
        if (this.Cart().products == null || this.Cart().products.isEmpty()) {
            throw new RuntimeException("You have emmpty cart.");
        }
        for (int i = 0; i < this.Cart().products.size(); i++) {
            this.Cart().products.get(i).increasePiecesAvailable();
        }
        this.Cart().products.clear();
    }

    public ShoppingCart Cart() {
        return currentCart;
    }

    public List<ShoppingCart> getHistory() {
        return history;
    }
    public void addToHistory(ShoppingCart cart) {
        this.history.add(cart);
    }

    public void BuyByCard() {
        if (currentCart != null) {
            if (this.moneyOnCard > this.currentCart.totalPrice()) {
                this.setMoneyOnCard(this.getMoneyOnCard() - this.currentCart.totalPrice());
                this.currentCart.Sell();
                this.history.add(currentCart);
                this.currentCart = null;
            } else {
                throw new RuntimeException("You donnot have enough money.");
            }
        } else {
            throw new RuntimeException("Shopping cart is empty.");
        }
    }

    public void BuyInCash() {
        if (currentCart != null || currentCart.products.isEmpty()) {
            if (this.moneyInCash > this.currentCart.totalPrice()) {
                this.moneyInCash -= this.currentCart.totalPrice();
                this.currentCart.Sell();
                this.history.add(currentCart);
                this.currentCart = null;
            } else {
                throw new RuntimeException("You don't have enough cash.");
            }
        } else {
            throw new RuntimeException("Shopping cart is empty.");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", moneyInCash=" + moneyInCash +
                ", moneyOnCard=" + moneyOnCard +
                ", currentCart=" + currentCart +
                ", history=" + history +
                '}';
    }
}
