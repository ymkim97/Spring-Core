package hello.core.singleton;

public class SingletoneService {

    // static 영역에 객체를 딱 1개만 생성해둔다
    private static final SingletoneService instance = new SingletoneService();

    // public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 참조하도록 허용
    public static SingletoneService getInstance() {
        return instance;
    }

    // 생성자는 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 막는다
    private SingletoneService() {
    }

    public void logic() {
        System.out.println("싱글톤 로직 호출");
    }

}
