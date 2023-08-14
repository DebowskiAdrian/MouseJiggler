package org.ajvid.model;

public class JigglerVariable {
    private double maxYAxis;
    private double maxXAxis;
    private int timeDelayBetweenMove;

    public double getMaxYAxis() {
        return maxYAxis;
    }

    public void setMaxYAxis(double maxYAxis) {
        this.maxYAxis = maxYAxis;
    }

    public double getMaxXAxis() {
        return maxXAxis;
    }

    public void setMaxXAxis(double maxXAxis) {
        this.maxXAxis = maxXAxis;
    }

    public int getTimeDelayBetweenMove() {
        return timeDelayBetweenMove;
    }

    public void setTimeDelayBetweenMove(int timeDelayBetweenMove) {
        this.timeDelayBetweenMove = timeDelayBetweenMove;
    }
}
