/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap.sort;

/**
 *
 * @author Muhaiminur
 */
public class CSE221LAB02 {
    public static void main(String[] args) {
        Heapsort h=new Heapsort();
        System.out.println("======PRINTING UNSORTED ARRAY=======");
        h.print();
        System.out.println("");
        h.HSORT();
        System.out.println("========PRINTING SORTED ARRAY=======");
        h.print();
    }
}
