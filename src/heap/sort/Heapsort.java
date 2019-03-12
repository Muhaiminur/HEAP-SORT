package heap.sort;

import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muhaiminur
 */
public class Heapsort {
    int[]a=new int[100000];
    int heapsize=0;

    public Heapsort() {
        try {
            Scanner abir=new Scanner(new File("Input"));
            a=new int[abir.nextInt()+1];
            if (a.length>100000) {
                System.out.println("THERE IS A LIMIT");
            }
            for (int c = 1; c < a.length; c++) {
                a[c]=abir.nextInt();
                
            }
        } catch (Exception e) {
        }
    }
    public void SORT(int[]a){
        BUILMAXHEAP(a);
        System.out.println("=======SORTING====");
        System.out.println("hoise");
        for (int c = a.length-1; c >1 ; c--) {
            exchange(a, 1, c);
            heapsize=heapsize-1;
            MAXHEAPIFY(a,1);
        }
        
    }
    public void MAXHEAPIFY(int[]a,int i){
        int l=left(i);
        //System.out.println("left="+l);
        int r=right(i);
        //System.out.println("RIGHT="+r);
        int largest=0;
        if (l<=heapsize  && a[l]>a[i]) {
            largest=l;
            //System.out.println("bf");
        } else {
            //System.out.println("hvgfvggfvefhghjege");
            largest=i;
            //System.out.println("lar="+largest);
        }
        
        
        if (r<=heapsize && a[r]>a[largest]) {
            //System.out.println("bdasdh");
            largest=r;
        }
        
        
        
        
        if (largest != i) {
            exchange(a,i,largest);
            MAXHEAPIFY(a, largest);
        }
        
        
        
    }
    
    
    public void BUILMAXHEAP(int[]a){
        heapsize=a.length-1;
        /*System.out.println("a="+a.length);
        System.out.println("HEAP="+heapsize);
        System.out.println("a[20]="+a[20]);*/
        for (int c = a.length/2; c >0; c--) {
            MAXHEAPIFY(a, c);
        }
    }
    
    public void exchange(int[]a,int c,int d){
        int temp=a[c];
        a[c]=a[d];
        a[d]=temp;
    }
    
    public int left(int i){
        return 2*i;
    }
    public int right(int i){
        return 2*i+1;
    }
    public void print(){
        for (int c = 1; c < a.length; c++) {
            System.out.print(" "+a[c]);
            
        }
    }
    public void HSORT(){
        SORT(a);
    }
}
