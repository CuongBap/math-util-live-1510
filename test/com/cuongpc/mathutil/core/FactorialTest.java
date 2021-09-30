/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongpc.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;


/**
 *
 * @author ASUS
 */
public class FactorialTest {
    
    
        // test unit level- là viết code test tới đó
        /* tao project- đặt tên project theo cách đảo tên miền để 
         quản lí tốt dự án , và nhất quán cho tất cả cty*/
        /* viết ra hàm và sử dụng unit test- để làm được việc nayf thầy dùng bộ 
         thư viện có tên unit test.
     bộ thư viện này cho phép đánh giá về chất luoengj code thông qua màu sắc xanh đỏ
     để thể hiện màu sắc xanh đỏ này thầy giới thiệu cho chúng em về TDD*/
        @Test
        public void checkFactorialGivenRightArgumentReturnsWell(){
            
            long expected = 120;
            long actual = MathUtil.getFactorial(5);
            
            Assert.assertEquals(expected, actual);
            Assert.assertEquals(720,MathUtil.getFactorial(6));
            Assert.assertEquals(1,MathUtil.getFactorial(0));
            
        
    }
        
        //check xem có xd ngoại lệ hay không khi đưa vào data sai!!!
        @Test(expected =  IllegalArgumentException.class)
        public void checkFactorialGivenRightArgumentThrowsException(){
          // ta ko dùng hàm assertEquals(2 value để so sánh)
          // ngoại lệ chỉ có thể nó xh hay ko??
            MathUtil.getFactorial(-5);
        }
    
}

// quy ước xanh đỏ:
// 1. xanh, tất cả tình huống so sánh xài hàm cùng fxanh
//2. đỏ , chỉ cần q tình huống xài hàm bị đỏ, coi như cả hàm đỏ
// đỏ;
// hoặc bạn tính toán trong thuật toán , trong hàm sai
// hoặc bạn kì vọng sai.