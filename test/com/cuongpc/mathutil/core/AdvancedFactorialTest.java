/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongpc.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ASUS
 */
@RunWith(value = Parameterized.class)// khai báo
public class AdvancedFactorialTest {
    
    // là viết kĩ thuật mới , tách data ra hẳn các câu lệnh kiểm tra hàm.
    // data này ta có thể đặt file .txt, .csv, .excel, database bên ngoài
    //@Before hàm để tải data vào
    //input và output/ expected là những cặp
    // nhiều cặp cần phải làm test, do data để test hàm sẽ là mảng hai chiều
    // mảng 2 chiều này sẽ đc nạp từ file .txt,db,...
    // hoặc tạo luôn 1 mảng 2 chiều ngay ở đây
 
    @Parameters
    public static Object[][] initData(){// tên hàm tùy ý
        return new Integer[][] {
                                  {0,1},
                                  {1,1},
                                  {2, 2},
                                  {3, 6},
                                  {4, 24},
                                  {5, 120},
        };
        
    } 
   
    // ta cần map 2 cột vào 2 cái biến để lát hồi nhồi/feed chúng vào
    // hàm checkFactorial, ta gọi là testing kiểu tham số hóa
    //parameting testing
    
    @Parameter(value = 0) // map cột 0 của tập data
    public int input;
    @Parameter(value = 1) // map cột 1 của tâp expected
    public long expected;
    
     @Test
        public void checkFactorialGivenRightArgumentReturnsWell(){
           
            Assert.assertEquals(expected,MathUtil.getFactorial(input));
            
            
        
    }
    
    
}
