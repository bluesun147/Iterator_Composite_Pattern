//import java.util.ArrayList;
//import java.util.List;
//
//public class MenuTest {
//    public static void main(String args[]) {
//        Western western = new Western();
//        Korean korean = new Korean();
//        Cafe cafe = new Cafe();
//
//        List<Menu> menus = new ArrayList<>();
//        menus.add(western);
//        menus.add(korean);
//        menus.add(cafe);
//
////        Waiter waiter = new Waiter(western, korean, cafe);
//        Waiter waiter = new Waiter(menus);
//        waiter.printMenu();
//    }
//}

public class MenuTest {
    public static void main(String[] args) {
        MenuComponent western = new Menu("양식", "양식메뉴입니다.");
        MenuComponent korean = new Menu("한식", "한식메뉴입니다.");
        MenuComponent cafe = new Menu("카페", "카페메뉴입니다.");
        MenuComponent dessert = new Menu("디저트", "디저트메뉴입니다.");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴 입니다.");

        allMenus.add(western);
        allMenus.add(korean);
        allMenus.add(cafe);

        // 메뉴 항목에 추가
        korean.add(new MenuItem("불고기", "불고기입니다.", 9000));
        cafe.add(new MenuItem("커피", "커피입니다.", 9000));

        cafe.add(dessert);

        dessert.add(new MenuItem("마카롱", "마카롱입니다.", 2000));

        Waiter waiter = new Waiter(allMenus);
        waiter.printMenu();
    }
}