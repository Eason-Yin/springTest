package com.ys.springJDK.Dao;

public class CustomerImpl implements CustomerDao{
    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void find() {
        System.out.println("查找");
    }
}
