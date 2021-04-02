package com.huh.dsa.ds;

/**
 * @author huh
 * @version 1.0
 * @date 2021/4/2 1:05
 */
public class Single_List implements List{
    private int size;
    private Node head,tail;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Position first() {
        if (isEmpty())
            throw new ExceptionListEmpty("意外：列表空");
        return head.getNext();
    }

    @Override
    public Position last() {
        if (isEmpty())
            throw new ExceptionListEmpty("意外：列表空");
        //循环获取最后一个节点（判断next==tail）
        return tail.getNext();
    }

    @Override
    public Position getNext(Position p) throws ExceptionPositionInvalid, ExceptionBoundaryViolation {
        return null;
    }


    @Override
    public Position insertFirst(Object e) {
        return null;
    }

    @Override
    public Position insertLast(Object e) {
        return null;
    }

    @Override
    public Position insertAfter(Position p, Object e) throws ExceptionPositionInvalid {
        return null;
    }

    @Override
    public Position insertBefore(Position p, Object e) throws ExceptionPositionInvalid {
        return null;
    }

    @Override
    public Object remove(Position p) throws ExceptionPositionInvalid {
        return null;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Override
    public Object replace(Position p, Object e) throws ExceptionPositionInvalid {
        return null;
    }

    @Override
    public Iterator positions() {
        return null;
    }

    @Override
    public Iterator elements() {
        return null;
    }
}
