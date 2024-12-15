// 구성요소
// 모든 메소드 기본으로 구현.
public abstract class MenuComponent {

    // 구성요소 추가, 제거, 가져오는 메소드
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // MenuItem에서 작업 처리하는 메소드.
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    // Menu와 MenuItem 모두 쓰이는 메소드
    public void print() {
        throw new UnsupportedOperationException();
    }
}