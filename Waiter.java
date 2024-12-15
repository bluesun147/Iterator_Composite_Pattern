//import java.util.Iterator;
//
//public class Waiter {
////    Western western;
////    Korean korean;
//
//    Menu western;
//    Menu korean;
//    Menu cafe;
//
////    // 생성자
////    public Waiter(Western western, Korean korean) {
////        this.western = western;
////        this.korean = korean;
////    }
//
////    // 생성자
////    public Waiter(Menu western, Menu korean) {
////        this.western = western;
////        this.korean = korean;
////    }
//
//    // 생성자
//    public Waiter(Menu western, Menu korean, Menu cafe) {
//        this.western = western;
//        this.korean = korean;
//        this.cafe = cafe;
//    }
//
////    public void printMenu() {
////        Iterator westernIterator = western.createIterator();
////        Iterator koreanIterator = korean.createIterator();
////
////        System.out.println("메뉴 \n\n양식");
////        printMenuDetail(westernIterator);
////        System.out.println("\n\n한식");
////        printMenuDetail(koreanIterator);
////    }
//
//    public void printMenu() {
//        Iterator westernIterator = western.createIterator();
//        Iterator koreanIterator = korean.createIterator();
//        Iterator cafeIterator = cafe.createIterator();
//
//        System.out.println("메뉴 \n\n양식");
//        printMenuDetail(westernIterator);
//        System.out.println("\n\n한식");
//        printMenuDetail(koreanIterator);
//        System.out.println("\n\n카페");
//        printMenuDetail(cafeIterator);
//    }
//
//    private void printMenuDetail(Iterator iterator) {
//        while (iterator.hasNext()) {
//            MenuItem menuItem = (MenuItem) iterator.next();
//            System.out.print(menuItem.getName() + ": ");
//            System.out.print(menuItem.getPrice() + "원, ");
//            System.out.print(menuItem.getDescription() + "\n");
//        }
//    }
//
//    // 기타 메서드
//}
//
//

/// ////////////

//
//import java.util.Iterator;
//import java.util.List;
//
//public class Waiter {
//    List<Menu> menus;
//
//    public Waiter(List<Menu> menus) {
//        this.menus = menus;
//    }
//
//    public void printMenu() {
//        Iterator<Menu> menuIterator = menus.iterator();
//        while (menuIterator.hasNext()) {
//            Menu menu = menuIterator.next();
//            printMenuDetail(menu.createIterator());
//        }
//    }
//
//    private void printMenuDetail(Iterator iterator) {
//        while (iterator.hasNext()) {
//            MenuItem menuItem = (MenuItem) iterator.next();
//            System.out.print(menuItem.getName() + ": ");
//            System.out.print(menuItem.getPrice() + "원, ");
//            System.out.print(menuItem.getDescription() + "\n");
//        }
//    }
//
//    // 기타 메서드
//}
//
//


public class Waiter {
    MenuComponent allMenus;

    public Waiter(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}