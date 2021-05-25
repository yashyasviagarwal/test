package com.company;
import java.util.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int treeNumber = sc.nextInt();
        if(treeNumber<1 || treeNumber>(rows*columns)){
            System.out.println("Tree not present");
        }
        else{
            int treeRow,treeCol;
            treeRow = (int) Math.ceil((treeNumber*1.0)/columns);
            treeCol = treeNumber - ((treeRow-1)*columns);
            if(treeRow == 1 || treeCol == 1 || treeCol == columns){
                System.out.println("This is a Mango tree");
            }
            else{
                System.out.println("This is not a Mango tree");
            }
        }
    }
}
