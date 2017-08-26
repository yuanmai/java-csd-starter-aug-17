package com.todo;


import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.junit.Assert;

/**
 * Created by Stevens Yao on 2016/10/13.
 * TodoList test step defines
 */
public class TodoStepDefines {
    TodoList todo;

    @假设("^我的任务清单里有(\\d+)个任务$")
    public void 我的任务清单里有_个任务(int totalTasks) throws Throwable {
        todo = new TodoList();
        todo.setTotalTaskCount(totalTasks);
        Assert.assertEquals(todo.getTotalTaskCount(), totalTasks);
    }

    @当("^我完成(\\d+)件任务之后$")
    public void 我完成_件任务之后(int finishedTasks) throws Throwable {
        todo.finishedTask(finishedTasks);
    }

    @那么("^我还剩下(\\d+)件未完成的任务$")
    public void 我还剩下_件未完成的任务(int leftTasks) throws Throwable {
        Assert.assertEquals(todo.getRestTasksCount(), leftTasks);
    }
}
