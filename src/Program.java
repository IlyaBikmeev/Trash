import wallet_stuff.Coin;
import wallet_stuff.CoinType;
import wallet_stuff.Person;
import wallet_stuff.Wallet;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
1. Инкапсуляция
2. Наследование
3. Полиморфизм

Композиция

 */

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov", 25);
        Wallet wallet = new Wallet();
        person.setWallet(wallet);
        wallet.putMoney(new Coin(500, CoinType.EURO));
        wallet.putMoney(new Coin(50, CoinType.DOLLAR_USA));

        System.out.println(person);



    }
}
