import java.util.*;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class MainClass {

    ListMultimap<Integer, Products> mapProducts = ArrayListMultimap.create();
    Map<Integer, Users> mapUsers = new HashMap<>();


    Products products = new Products("Apple", 90);
    Products products1 = new Products("Tomato", 100);
    Products products2 = new Products("Potato", 50);

    Users users = new Users("Elon", "Musk", 100);
    Users users1 = new Users("Mark", "Zuckerberg", 150);
    Users users2 = new Users("Linus", "Torvalds", 50);

    public void program() {
        setProductsId();
        setUsersId();
        int variant;
        int usersId = 0;
        int productId = 0;
        while (true) {
            a:
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nChoose the option (enter the number and press Enter):\n" +
                        "1 - Display list of all users\n" +
                        "2 - Display list of all products\n" +
                        "3 - Buy the product by user\n" +
                        "4 - Display list of user products by id\n" +
                        "5 - Display list of users that bought product by product id\n" +
                        "6 - Exit");
                try {
                    variant = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid number, please enter the number from 1 to 3\n");
                    continue;
                }
                if (variant == 1) {
                    showUsers();
                } else if (variant == 2) {
                    showProducts();
                } else if (variant == 3) {
                    while (true) {
                        System.out.println("Enter user id you want to buy product (from 1 to 3):");
                        try {
                            usersId = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println("Enter valid user ID\n");
                            break;
                        }
                        System.out.println("Enter products id you want to buy (from 1 to 3): ");
                        try {
                            productId = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println("Enter valid product ID");
                            break;
                        }
                        break;
                    }
                    switch (usersId) {
                        case 1:
                            switch (productId) {
                                case 1:
                                    if (users.getMoneyAmount() < products.getPrice()) {
                                        try {
                                            throw new Exception("User has not enough money.");
                                        } catch (Exception e) {
                                            System.out.println(e);
                                            break;
                                        }
                                    } else {
                                        System.out.println("Product have been successfully bought");
                                        users.setMoneyAmount(users.getMoneyAmount() - products.getPrice());
                                        mapProducts.put(users.getId(), products);
                                        mapUsers.put(products.getId(), users);
                                        break;
                                    }

                                case 2:
                                    if (users.getMoneyAmount() < products1.getPrice()) {
                                        try {
                                            throw new Exception("User has not enough money.");
                                        } catch (Exception e) {
                                            System.out.println(e);
                                            break;
                                        }
                                    } else {
                                        System.out.println("Product have been successfully bought");
                                        users.setMoneyAmount(users.getMoneyAmount() - products1.getPrice());
                                        mapProducts.put(users.getId(), products1);
                                        mapUsers.put(products1.getId(), users);
                                        break;
                                    }
                                case 3:
                                    if (users.getMoneyAmount() < products2.getPrice()) {
                                        try {
                                            throw new Exception("User has not enough money.");
                                        } catch (Exception e) {
                                            System.out.println(e);
                                            break;
                                        }
                                    } else {
                                        System.out.println("Product have been successfully bought");
                                        users.setMoneyAmount(users.getMoneyAmount() - products2.getPrice());
                                        mapProducts.put(users.getId(), products2);
                                        mapUsers.put(products2.getId(), users);
                                        break;
                                    }
                            }
                            break;
                        case 2:
                            switch (productId) {
                                case 1:
                                    if (users1.getMoneyAmount() < products.getPrice()) {
                                        try {
                                            throw new Exception("User has not enough money.");
                                        } catch (Exception e) {
                                            System.out.println(e);
                                            break;
                                        }
                                    } else {
                                        System.out.println("Product have been successfully bought");
                                        users1.setMoneyAmount(users1.getMoneyAmount() - products.getPrice());
                                        mapProducts.put(users1.getId(), products);
                                        mapUsers.put(products.getId(), users1);
                                        break;
                                    }
                                case 2:
                                    if (users1.getMoneyAmount() < products1.getPrice()) {
                                        try {
                                            throw new Exception("User has not enough money.");
                                        } catch (Exception e) {
                                            System.out.println(e);
                                            break;
                                        }
                                    } else {
                                        System.out.println("Product have been successfully bought");
                                        users1.setMoneyAmount(users1.getMoneyAmount() - products1.getPrice());
                                        mapProducts.put(users1.getId(), products1);
                                        mapUsers.put(products1.getId(), users1);
                                        break;
                                    }
                                case 3:
                                    if (users1.getMoneyAmount() < products2.getPrice()) {
                                        try {
                                            throw new Exception("User has not enough money.");
                                        } catch (Exception e) {
                                            System.out.println(e);
                                            break;
                                        }
                                    } else {
                                        System.out.println("Product have been successfully bought");
                                        users1.setMoneyAmount(users1.getMoneyAmount() - products2.getPrice());
                                        mapProducts.put(users1.getId(), products2);
                                        mapUsers.put(products2.getId(), users1);
                                        break;
                                    }
                            }
                            break;
                        case 3:
                            switch (productId) {
                                case 1:
                                    if (users2.getMoneyAmount() < products.getPrice()) {
                                        try {
                                            throw new Exception("User has not enough money.");
                                        } catch (Exception e) {
                                            System.out.println(e);
                                            break;
                                        }
                                    } else {
                                        System.out.println("Product have been successfully bought");
                                        users2.setMoneyAmount(users2.getMoneyAmount() - products.getPrice());
                                        mapProducts.put(users2.getId(), products);
                                        mapUsers.put(products.getId(), users2);
                                        break;
                                    }
                                case 2:
                                    if (users2.getMoneyAmount() < products1.getPrice()) {
                                        try {
                                            throw new Exception("User has not enough money.");
                                        } catch (Exception e) {
                                            System.out.println(e);
                                            break;
                                        }
                                    } else {
                                        System.out.println("Product have been successfully bought");
                                        users2.setMoneyAmount(users2.getMoneyAmount() - products1.getPrice());
                                        mapProducts.put(users2.getId(), products1);
                                        mapUsers.put(products1.getId(), users2);
                                        break;
                                    }
                                case 3:
                                    if (users2.getMoneyAmount() < products2.getPrice()) {
                                        try {
                                            throw new Exception("User has not enough money.");
                                        } catch (Exception e) {
                                            System.out.println(e);
                                            break;
                                        }
                                    } else {
                                        System.out.println("Product have been successfully bought");
                                        users2.setMoneyAmount(users2.getMoneyAmount() - products2.getPrice());
                                        mapProducts.put(users2.getId(), products2);
                                        mapUsers.put(products2.getId(), users2);
                                        break;
                                    }
                            }
                            break;
                    }
                } else if (variant == 4) {
                    while (true) {
                        System.out.println("Enter user's ID (from 1 to 3):");
                        try {
                            usersId = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println("Enter valid user ID");
                            break;
                        }
                        for (Map.Entry<Integer, Products> item : mapProducts.entries()) {
                            if (item.getKey() == usersId) {
                                System.out.println(mapProducts.get(usersId));
                            } else continue;
                            break;
                        }
                        break;
                    }
                } else if (variant == 5) {
                    while (true) {
                        System.out.println("Enter product ID (from 1 to 3):");
                        try {
                            productId = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println("Enter valid product ID");
                            break;
                        }
                        for (Map.Entry<Integer, Users> item : mapUsers.entrySet()) {
                            if (item.getKey() == productId) {
                                System.out.println(mapUsers.get(productId));
                            } else continue;
                            break;
                        }
                        break;
                    }
                } else if (variant == 6) {
                    System.exit(0);
                }
            }
        }
    }

    public void setProductsId() {
        products.setId(1);
        products1.setId(2);
        products2.setId(3);
    }

    public void setUsersId() {
        users.setId(1);
        users1.setId(2);
        users2.setId(3);
    }

    public void showProducts() {
        System.out.println(products + "\n" + products1 + "\n" + products2);
    }

    public void showUsers() {
        System.out.println(users + "\n" + users1 + "\n" + users2);
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.program();
    }

}
