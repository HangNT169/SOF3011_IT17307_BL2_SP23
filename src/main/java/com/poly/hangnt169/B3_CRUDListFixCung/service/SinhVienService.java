package com.poly.hangnt169.B3_CRUDListFixCung.service;

import com.poly.hangnt169.B3_CRUDListFixCung.entity.SinhVien;

import java.util.List;

/**
 * @author hangnt169
 */
public interface SinhVienService {

    List<SinhVien>fakeData();

    void removeSinhVien(List<SinhVien>lists, String mssv);

    SinhVien findBySinhVienByMSSV(List<SinhVien>list,String mssv);

}
