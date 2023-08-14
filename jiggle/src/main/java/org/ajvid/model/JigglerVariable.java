package org.ajvid.model;

public class JigglerVariable {
    private int minYAxis;
    private int minXAxis;
    private int maxYAxis;
    private int maxXAxis;
    private int timeDelayBetweenMove;

    public int getMinYAxis() {
        return minYAxis;
    }

    public void setMinYAxis(int minYAxis) {
        this.minYAxis = minYAxis;
    }

    public int getMinXAxis() {
        return minXAxis;
    }

    public void setMinXAxis(int minXAxis) {
        this.minXAxis = minXAxis;
    }

    public int getMaxYAxis() {
        return maxYAxis;
    }

    public void setMaxYAxis(int maxYAxis) {
        this.maxYAxis = maxYAxis;
    }

    public int getMaxXAxis() {
        return maxXAxis;
    }

    public void setMaxXAxis(int maxXAxis) {
        this.maxXAxis = maxXAxis;
    }

    public int getTimeDelayBetweenMove() {
        return timeDelayBetweenMove;
    }

    public void setTimeDelayBetweenMove(int timeDelayBetweenMove) {
        this.timeDelayBetweenMove = timeDelayBetweenMove;
    }
}
