package com.todo;

/**
 * Created by Stevens Yao on 2016/10/13.
 * TODO add description
 */
public class TodoList {
    private int totalTaskCount;
    private int finishedTaskCount;

    public TodoList() {
        totalTaskCount = finishedTaskCount = 0;
    }

    public int getTotalTaskCount() {
        return totalTaskCount;
    }

    public void setTotalTaskCount(int count) {
        totalTaskCount = count;
    }

    public void finishedTask(int count) {
        finishedTaskCount = count;
    }

    public int getRestTasksCount() {
        return totalTaskCount - finishedTaskCount;
    }
}
