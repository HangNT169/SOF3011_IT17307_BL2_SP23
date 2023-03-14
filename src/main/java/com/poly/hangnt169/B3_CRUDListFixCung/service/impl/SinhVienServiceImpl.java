package com.poly.hangnt169.B3_CRUDListFixCung.service.impl;

import com.poly.hangnt169.B3_CRUDListFixCung.entity.SinhVien;
import com.poly.hangnt169.B3_CRUDListFixCung.service.SinhVienService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hangnt169
 */
public class SinhVienServiceImpl implements SinhVienService {

    @Override
    public List<SinhVien> fakeData() {
        List<SinhVien> lists = new ArrayList<>();
        lists.add(new SinhVien("HangNT169", "Nguyễn Thuý Hằng", 10, "Hà Nội", false));
        lists.add(new SinhVien("PhongTT35", "Trần Tuấn Phong", 11, "Hà Nội1", true));
        lists.add(new SinhVien("NguyenVV4", "Vũ Văn Nguyên", 12, "Hà Nội2", true));
        lists.add(new SinhVien("KhanhPG", "Phạm Gia Khánh", 13, "Hà Nội", true));
        lists.add(new SinhVien("TienNH21", "Nguyễn Hoàng Tiến", 14, "Hà Nội3", true));
        lists.add(new SinhVien("DungNA29", "Nguyễn Anh Dũng", 15, "Hà Nội4", true));
        return lists;
    }

    @Override
    public void removeSinhVien(List<SinhVien> lists, String mssv) {
        // Lay ra vi tri can tim
        int viTri = findSinhVien(lists, mssv);
        // Xoa
        lists.remove(viTri);
    }

    @Override
    public SinhVien findBySinhVienByMSSV(List<SinhVien> list, String mssv) {
        // Lay ra vi tri can tim
        int viTri = findSinhVien(list, mssv);
        return list.get(viTri);
    }

    // Tra ve vi tri cua phan tu duoc tim thay
    // -1:  khi khong tim thay phan tu
    private int findSinhVien(List<SinhVien> lists, String mssv) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getMssv().equalsIgnoreCase(mssv)) {
                return i;
            }
        }
        return -1;
    }
}
