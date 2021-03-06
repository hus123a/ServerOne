package com.catCoder.service;

import com.catCoder.bean.MyLinkTreeNode;

import java.util.List;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.CountDownLatch;

public interface ITreeService {
    public List<MyLinkTreeNode> selectAll();

    public boolean addTree(MyLinkTreeNode node);

    public List<Object> addNewTreeModeUsers(CountDownLatch mainLatch, CountDownLatch threadLatch, RollBack rollBack, BlockingDeque<Boolean> resultList, List<MyLinkTreeNode> taskList, ITreeService treeService);

    public MyLinkTreeNode selectOne(MyLinkTreeNode node);

    void testGetId(String code);
}
