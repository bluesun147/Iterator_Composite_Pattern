//import java.util.ArrayList;
//import java.util.Iterator;
//
//// 메뉴항목
//public class Western implements Menu {
//    // 메뉴를 ArrayList로 구성.
//    ArrayList<MenuItem> menuItems;
//
//    // 생성자
//    public Western() {
//        menuItems = new ArrayList<MenuItem>();
//        addItem("팬케이크 세트", "팬케이크와 우유", 5000);
//        addItem("햄버거 세트", "햄버거와 콜라", 8000);
//    }
//
//    public void addItem(String name, String description, double price) {
//        MenuItem menuItem = new MenuItem(name, description, price);
//        menuItems.add(menuItem);
//    }
//
////    public ArrayList<MenuItem> getMenuItems() {
////        return menuItems;
////    }
//
//    public Iterator<MenuItem> createIterator() {
////        return new WesternIterator(menuItems);
//        return menuItems.iterator();
//    }
//
//    // 기타 메서드
//}