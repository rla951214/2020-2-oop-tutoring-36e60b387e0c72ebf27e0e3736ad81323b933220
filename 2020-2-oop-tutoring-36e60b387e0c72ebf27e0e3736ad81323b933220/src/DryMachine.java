public class DryMachine {
    //돈을 받고
    //건조를 시켜준다

    // 매개변수로 int 타입 변수 넘겨받기

    // DryMachine이 가지고 잇는 int cost가
    // 4000원 이상인지 판단하기

    //4000원 이상이면 true 반환
    //4000원 이하면 돈이 부족하다고 말하고 false 반환

    int cost;
    boolean isRunning;
    long startTime;

    public DryMachine() {

    }

    boolean insertCoin(int cost) {
        this.cost += cost;
        System.out.println(this.cost);

        if (this.cost >= 4000) {
            return true;
        }

        return false;
    }

    public DryMachine(int cost) {
        this.cost = cost;
    }

    public void run() {

        // 이미 동작하고 있을 때
        if (isRunning) {
            long currentTime = System.currentTimeMillis();
            System.out.println((currentTime - startTime) / 1000);

            return;
        }

        // 이제 동작 시킬 떄
        startTime = System.currentTimeMillis();
        System.out.println(startTime);
        isRunning = true;

        }
    }