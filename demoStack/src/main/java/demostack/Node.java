/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demostack;

/**
 *
 * @author admin
 */
public class Node {
    private int data;

    public Node(int data) {
        this.data = data;
    }
    public void printInfo(int par){
        System.out.println(this.data + "\n");
    }

    void printInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}