/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.employee;

/**
 *
 * @author Nguyen Hai Trieu
 * phương thức có thể có 1 or nhiều tham số
 * pp có kiểu tra về or không
 * trong 1 lớp có thể co nhiều phương thức  trùng tên nhưng khác nhau về tham số và kiểu dữ liệu và thứ tự
 * this đại diện cho đối tượng 
 * this.field dùng để phân biệt với các biến cuc bộ or tham số của phương thức
 * tính toàn vẹn dữ liệu dùng private để truy xuất dùng setter và getter
 * quy tắc đặt tên class hay interface,biến
 * class và interface phải viết hoa chữ cái đầu mỗ từ
 * biến và pp thì viết tg từ đầu tiên từ thứ 2 thì viết hoa chữ cái đầu
 */
/*
ArrayList là dùng mảng động
ArrayList có hai loai:không định kiểu(khi truy xuát phần tử phải ép kiểu về kiểu góc) và 
có định kiểu ( k cần ép kiểu)
============ CÁC THAO TÁC XỬ LÝ VỚI ARRAYLIST===========================
boolean add(object) thêm váo cuối
void add(int index,obj ele) chèn thêm phần tử vào vị trí
boolean remove(object) xóa phần tử
object remove(int index) xóa phần tử tại ví trí
void clear() xóa sạch
Object set(int index,Object ele) thay đổi phần tử tại vị trí
Object get(int index) truy xuất phần tử tại vị trí
int size() số phần tử
boolean contains kiểm tra sự tồn tại
boolran isEmpty kiểm tra rỗng
int indexOf tìm vị trí phần tử
============= THAO TÁC TẬP HỢP ==========================
addAll(collection) hợp của hai tập hợp
removeAll(collection) hiệu hai tập hợp
retainAll(collection) giao hai tập hợp
boolean containAll(collection) kiểm tra sự tồn tại
toArray(T) chuyển đổi sang mảng
==== LỢI ÍCH COLLECTION XỬ LÝ VỚI ARRAYLIST
int binarySearch(List list,Object key) tìm kiếm theo thuật toán chia đôi
void fill(găn cho tất cả 1 giá trị)
void shuffle (List list) hoán vị ngẫu nhiên
void sort săp xếp tăng dần
void reverse dao nguoc
void rotate xoay tron
void swap(List list,int i,int j) đổi chỗ


*/

public class MainClass {
    public static void main(String[] args) {
        Employee sv=new Employee();
        sv.nhap();
        sv.xuat();
    }
}
