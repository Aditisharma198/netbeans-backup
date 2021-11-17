/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;
import java.util.*;
/**
 *
 * @author User
 */
public class datastruc {
      /*static public void main(String[] args){
         int[] a={0,1,2,3,4,5,6};
         
         int index=-1;
         for(int i=0;i<a.length;i++){
             if(a[i]==5){
                 
                 break;
             }
         }
         System.out.println("index="+index);
      }*/
    
    //Insertion in array
    /*
    public static void main(String[] args){
        int n,pos,x,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        n =sc.nextInt();
        int a[]=new int[n+1];
        System.out.println("Enter elements of array:");
        for(i=0; i<n; i++){
            a[i]=sc.nextInt();
            
        }
        System.out.println("Enterr the position where element is to be inserted");
        pos=sc.nextInt();
        System.out.println("Enterr the element to be inserted");
        x=sc.nextInt();
        for(i=(n-1); i>=(pos-1); i--){
            a[i+1]=a[i];
            
        }
        a[pos-1]=x;
        System.out.println("Array after insertion");
        for(i=0; i<n; i++){
           System.out.println(a[i]+" ,"); 
        }
         System.out.println(a[n]); 
    }*/
    
    //Deletion operation
    public static void main(String[] args){
         int n,flag=0,loc=0,x,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        n =sc.nextInt();
        int a[]=new int[n+1];
        System.out.println("Enter elements of array:");
        for(i=0; i<n; i++){
            a[i]=sc.nextInt();   
        }
        System.out.println("Enter the element to be deleted");
        x=sc.nextInt();
        for(i=0; i<n; i++){
            if(a[i]==x){
                flag=1;
                loc=i;
                break;
            }
            else{
                flag=0;
                
            }
        }
            if(flag==1){
                for(i= loc+1; i<n; i++){
                    a[i-1]=a[i];}
                System.out.println("Array after deletion");
                for(i=0; i<n-2;i++){
                     System.out.print(a[i]+","); 
                }
                 System.out.println(a[n-2]); 
                       
            }
            else{
            System.out.println("Element not found");
        }
        }
    }


