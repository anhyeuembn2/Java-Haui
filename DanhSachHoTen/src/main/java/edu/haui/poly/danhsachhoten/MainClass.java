/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.danhsachhoten;

/**
 *
 * @author Nguyen Hai Trieu
 */
/*
 CÁC PHƯƠNG THỨC SỬ DỤNG STRINGS TRONG JAVA
length() lấy ra độ dài của chuỗi
charAt(int index) trả về kí tự tại index
substring(start,end) cắt chuỗi tuwg start-> end
indexOf lấy ra vị trí khoảng trắng đầu tiên
lastIndexOf lấy ra vị trí khoảng trắng cuối cùng
startWith(str) trả về true nếu chuỗi bắt đầu bằng str
endWith trả về rue neeis chuỗi bắt đầu bằng str
toLowercase chuyển hoa thành thương
toUpperCase chuyển thường thành hoa
trim() loại bỏ khoảng trắng ở đầu và cuối chuỗi
split() chuyển chuôi thành mảng
replace(str old,str new) thay thế chuỗi
replaceAll(String regex,String new) 
matches(string  regex) kiểm tra chuỗi có khớp vơi biểu thức chính quay
compareto(str)  so sánh 2 chuỗi
contact là hàm nối chuối
equalsIgnoreCase(str) so sánh 2 chuỗi k phân biệt chữ hoa chữ thường
isEmpty(str) kiểm tra chuỗi có rỗng hay không
equals so sánh 2 chuỗi





*/

/*
 CÁC PHƯƠNG THỨC SỬ DỤNG VỚI MẢNG
 int []arr=new int[5]
 truy cập phần tử thông qua index
 lấy ra độ dài của mảng sử dụng lenth
sort(arr) sắp xếp mảng theo tăng dần
binarySearch(arr,key) trả về vị trí
fill(arr,giá tri)






*/
/*
 CÁC PHƯƠNG THỨC XỬ LÝ VƠI ARRAYlIST



*/

public class MainClass {
    public static void main(String[] args) {
        DanhSachHoTen ds=new DanhSachHoTen();
        ds.danhSachChuongTrinh();
    }
}
