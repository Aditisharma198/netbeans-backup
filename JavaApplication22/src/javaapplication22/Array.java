/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author User
 */
import java.util.*;
public class Array {
    void rotate(int arr[],int d,int n){
        for(int i=0;i<d;i++){
            leftrotation(arr,n);
        }
        
    }
    
    void leftrotation(int arr[],int n){
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    
    void show(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        Array a= new Array();
        a.rotate(arr,3,7);
        a.show(arr,7);
        
        /*Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.print("Cols");
        n=sc.nextInt();
        System.out.print("Rows");
        m=sc.nextInt();
        int[] arr=new int[5];
        for(int i=0;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        int[][] marray=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                marray[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(marray[i][j]);
            }
        }*/
        
        
        
    }
                
}
