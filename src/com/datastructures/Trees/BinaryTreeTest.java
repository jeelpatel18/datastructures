package com.datastructures.Trees;

import java.util.ArrayList;

public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(20);
        BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.getRoot().setLeft(new BinaryTreeNode(10));
        binaryTree.getRoot().getLeft().setLeft(new BinaryTreeNode(5));
        binaryTree.getRoot().getLeft().setRight(new BinaryTreeNode(13));
        binaryTree.getRoot().setRight(new BinaryTreeNode(23));
        binaryTree.getRoot().getRight().setLeft(new BinaryTreeNode(21));
        binaryTree.getRoot().getRight().setRight(new BinaryTreeNode(28));

        System.out.println("Inorder Traversal in tree: ");
        binaryTree.inOrderTraversal(binaryTree.getRoot());
        System.out.println("\n\nPreorder Traversal in tree: ");
        binaryTree.preOrderTraversal(binaryTree.getRoot());

        System.out.println("\n\nPostorder Traversal in tree: ");
        binaryTree.postOrderTraversal(binaryTree.getRoot());

        System.out.println("\n\nPreOrder without recurssion: ");
        ArrayList<Integer> preOrdered = binaryTree.preOrder(binaryTree.getRoot());
        for(Integer i : preOrdered){
            System.out.print(i.intValue());
            System.out.print(" -> ");
        }

        System.out.println("\n\nInOrder without recurssion: ");
        ArrayList<Integer> inOrdered = binaryTree.inOrder(binaryTree.getRoot());
        for(Integer i : inOrdered){
            System.out.print(i.intValue());
            System.out.print(" -> ");
        }

        System.out.println("\n\nInOrder without recurssion using stack: ");
        binaryTree.inOrderUsingStack(binaryTree.getRoot());

        System.out.println("\n\npostOrder without recurssion: ");
        ArrayList<Integer> postOrder = binaryTree.postOrder(binaryTree.getRoot());
        for(Integer i : postOrder){
            System.out.print(i.intValue());
            System.out.print(" -> ");
        }

        System.out.println("\n\npostOrder without recurssion Using two stacks: ");
        binaryTree.postOrderUsingTwoStacks(binaryTree.getRoot());

        System.out.println("\n\nlevel Order with recurssion : ");
        binaryTree.levelOrder(binaryTree.getRoot());

        System.out.println("\n\nlevel Order without recurssion : ");
        binaryTree.levelOrderUsingQueue(binaryTree.getRoot());

        System.out.println("\n\n diameter of the binary tree: "+binaryTree.diameterOfBinaryTree(root));

        System.out.println("\n\n width of the binary tree: "+binaryTree.maxWidthOfBinaryTree(root));
    }




}
