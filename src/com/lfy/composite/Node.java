package com.lfy.composite;

import java.util.ArrayList;

/**
 * 组合模式
 *  解决树的问题
 */
public abstract class Node {
    public abstract void p();
}

class Leaf extends Node {
    private String content;
    public Leaf(String content) {
        this.content = content;
    }
    @Override
    public void p() {
        System.out.println(content);
    }
}

class Brunch extends Node {

    private String content;
    public ArrayList<Node> nodeList = new ArrayList();

    public Brunch(String content) {
        this.content = content;
    }
    public void add(Node node) {
        nodeList.add(node);
    }
    @Override
    public void p() {
        System.out.println(content);
    }

}

class Main {
    public static void main(String[] args) {

        Brunch root = new Brunch("root");
        Brunch dir1 = new Brunch("dir1");
        Brunch dir2 = new Brunch("dir2");
        Node file1 = new Leaf("file1");
        Node file2 = new Leaf("file2");
        Node file3 = new Leaf("file3");

        root.add(dir1);
        root.add(dir2);
        dir1.add(file1);
        dir1.add(file2);
        dir2.add(file3);

        tree(root,1);

    }
    static void tree(Node node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        node.p();
        if (node instanceof Brunch) {
            for (Node instance : ((Brunch) node).nodeList) {
                tree(instance,depth+1);
            }
        }
    }
}
