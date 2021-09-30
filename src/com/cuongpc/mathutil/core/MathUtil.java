/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongpc.mathutil.core;

/**
 *
 * @author ASUS
 */
public class MathUtil {
// viết hàm tinh giai thừa n! - 1.2.3.4.5.....
    //0! -1! =1
    //21! tràn kiểu long
    // <0 ! ko tính đc, ko có giai thừa cho số âm.
    public static long getFactorial(int n){
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException(" n must be between 0 from 20");
        
        if( n == 0 || n == 1)
            return 1;
        
        long product = 1;
        
        for ( int i= 1; i <= n; i++)
            
            product *= i; 
        
            return product;
            
        }
    }
  
    


//TDD- test drivem Development
// quá trình viết code phải tương thích trả về expected đúng
//test First Development
//khi ta viết code phải lưu ý ngay viết test cases/ tình huống test
// app/hàm phải được đề cập ngay
// test ngay những gì ta sẽ  viết ra or test trước khi ta viết ra
//hoàn thiện code