package game.mode;


import java.util.ArrayList;
import java.util.List;

/**
 * Author pengyi
 * Date 17-3-7.
 */
public class RunQuicklyRoom {

    private int baseScore; //基础分
    private String roomNo;  //桌号
    private int operationSeat;
    private GameStatus gameStatus;
    private List<Integer> seatNos;

    private int lastOperation;

    private int gameTimes; //游戏局数
    private int count;//人数
    private int multiple;
    private int gameCount;
    private int gameRules;

    public int getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(int baseScore) {
        this.baseScore = baseScore;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public int getOperationSeat() {
        return operationSeat;
    }

    public void setOperationSeat(int operationSeat) {
        this.operationSeat = operationSeat;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public List<Integer> getSeatNos() {
        return seatNos;
    }

    public void setSeatNos(List<Integer> seatNos) {
        this.seatNos = seatNos;
    }

    public int getLastOperation() {
        return lastOperation;
    }

    public void setLastOperation(int lastOperation) {
        this.lastOperation = lastOperation;
    }

    public int getGameTimes() {
        return gameTimes;
    }

    public void setGameTimes(int gameTimes) {
        this.gameTimes = gameTimes;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public int getGameRules() {
        return gameRules;
    }

    public void setGameRules(int gameRules) {
        this.gameRules = gameRules;
    }

    public RunQuicklyRoom() {
    }

    public RunQuicklyRoom(int baseScore, String roomNo, int gameTimes, int count, int gameRules) {
        this.baseScore = baseScore;
        this.roomNo = roomNo;
        this.gameTimes = gameTimes;
        this.count = count;
        this.gameRules = gameRules;
        this.gameStatus = GameStatus.WAITING;
        this.multiple = 1;
        seatNos = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            seatNos.add(i + 1);
        }
    }
}