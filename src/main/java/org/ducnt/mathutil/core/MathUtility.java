/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ducnt.mathutil.core;

/**
 *
 * @author Admin
 */
//class  này clone lại cái class huyền thoại java.util.Math
//vs các hàm nổi tiếng Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    public static final double PI = 3.1415;
    
    //class này chứa hàm static, chấm xài luôn
    //tính n giai thừa số âm. Nếu đứa số âm, chửi 
    //giai thừa tăng nhanh, 20! vừa khớp full kiểu long 
    //do đó 21! ko dùng kiểu long đc, Nếu đưa > 21, CHỬI
    //CHỬI: ko trả về giá trị gì cà mà NÉM RA NGOẠI LỆ EXCEPTION
    public static long getFactorial(int n){
        if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be between 0->20, plz");
        if (n == 0 || n == 1) return 1;
        
        long product = 1; // tích nhân dồn khởi động từ 1
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}

//TDD: Test Driven Development phát triển phần mềm theo phong cách kiểm thử (code đến đâu kiểm đến đó)
//viết code và viết test case/ test run diễn ra song song
// cứ có hàm là có test case 

// viết ra các test case đủ bao quát các tình huống xài hàm 
// test case: bộ dữ liệu đưa vào app để mô phỏng lại
// 1 tình huống xài app/ hàm. Nó có input data, giải thích cách dùng hàm
// và có giá trị về expected
// lát hồi run( test run/ test execution) để luận đúng sai

// Dân DEV GIỐNG DÂN QC:
//ĐỀU PHẢI VIẾT/ TẠO RA TEST CASE, ĐỀU PHẢI TIẾN HÀNH RUN/CHẠY TEST
//VÀ ĐỀU PHẢI ĐỌC KẾT QUẢ ĐÚNG SAI
// DEV KHÁC TESTER LÀ PHẢI VIẾT CODE LÀM APP!!!

//Test case ko viết tự do mà phải theo template
//VIết tự do: 0! -> 1; 1!->1; 2->2; 3! ->...
//Viết chuẩn lại test case (XUẤT HIỆN TRONG ĐỀ THI PE, đi làm) 
//Test case #1: (mục tiêu test) check getF() with n = 0;
// Step-Procedures (cách tiến hành test - input/output..)
//      1. Given n = 0;
//      2. Call the getF(n) (getF(0)
// Expected results: (kết quả kì vọng)
//                 getF(0) must return 1;

//Test case #2: (mục tiêu test) check getF() with n = 1;
// Step-Procedures (cách tiến hành test - input/output..)
//      1. Given n = 1;
//      2. Call the getF(n) (getF(1)
// Expected results: (kết quả kì vọng)
//                 getF(1) must return 1;

