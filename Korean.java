////import java.util.Iterator;
//
//import java.util.Iterator;
//
//// 메뉴항목
//public class Korean implements Menu {
//    // 메뉴를 배열로 구성.
//    MenuItem[] menuItems;
//    // 최대 개수 지정.
//    static final int MAX_ITEMS = 6;
//    int numberOfItems = 0;
//
//
//    // 생성자
//    public Korean() {
//        menuItems = new MenuItem[MAX_ITEMS];
//
//        addItem("된장찌개 세트", "된장찌개와 공기밥", 7000);
//        addItem("김치찌개 세트", "김치찌개와 공기밥", 7000);
//    }
//
//    public void addItem(String name, String description, double price) {
//        MenuItem menuItem = new MenuItem(name, description, price);
//        if (numberOfItems >= MAX_ITEMS) {
//            System.err.println("메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
//        } else {
//            menuItems[numberOfItems] = menuItem;
//            numberOfItems += 1;
//        }
//    }
//
//    // 내부 구조 드러내는 단점 없앰
////    public MenuItem[] getMenuItems() {
////        return menuItems;
////    }
//
//    /* menuItems 가지고 iterator 생성 후 클라이언트에게 리턴.
//    클라이언트는 menuItems가 어떻게 관리되는지, iterator 어떻게 구현되는지
//    알 필요 없음. 반복자 메누에서 항목 하나하나에 접근만 할 수 있으면 됨.
//    => 캡슐화 */
//    public Iterator createIterator() {
//        return new KoreanIterator(menuItems);
//    }
//
//    // Menu1과 다른 기타 메서드
//}