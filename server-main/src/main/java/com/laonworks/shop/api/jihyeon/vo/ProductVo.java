package com.laonworks.shop.api.jihyeon.vo;

import com.laonworks.shop.api.mapper.vo.UserVo;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ToString
public class ProductVo {

  public String sllrId;   // 판매자 아이디

  public int prdtNo;      // 상품번호

  public double prdtPrce; // 상품가격

  public String prdtNm;   // 상품이름

  public String prdtDesc; // 상품설명

  public Date crtDt;    // 생성날짜

  public Date updtDt;   // 수정날짜

  public List<String> imageList;  // 이미지

  public void set(UserVo vo) {
    this.sllrId = vo.userId;
  }

}
