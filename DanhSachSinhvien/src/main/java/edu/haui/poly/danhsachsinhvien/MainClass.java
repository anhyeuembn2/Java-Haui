/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.danhsachsinhvien;

/**
 *
 * @author Nguyen Hai Trieu
 */
/*
   CÁC PHƯƠNG THỨC XỬ LÝ VỚI CHUỖI
   charAt(int index) lấy một kí tự tại vị trí
   length() trả về độ dài của chuỗi
   substring(start,end) 
   indexOf tra về vị trí dầu tiên tìm thấy
   lastindexof trả về vị trí cuối cùng tìm thấy
   ToLowerCase chuyển hoa thành thường
   ToUpperCase chuyển thường thành hoa
   trim() loại bỏ phần tử ở đầu và cuối chuỗi
   startWidth(string str) kiểm trâ chuỗi có bắt dầu bằng str
   endWidth(string str) kiểm tra chuỗi có kết thúc bằng str
   replace(str old,str new) thay thể tất cả các old thành new
   split() chuyển chuỗi thành mảng
   equals so sánh hai chuỗi
   compareTo() so sánh dựa trên từ điển
   contains kiểm tra xem có chứa hay không
  
*/
/*
 các phương thức sử dụng với mảng
 asList(arr) chuyển array thành List list<interger> tenlist=Arrays.asList(arr)
*/
public class MainClass {
    public static void main(String[] args) {
        DanhSachSinhvien sv=new DanhSachSinhvien();
        sv.hienThiMenu();
    }
}
