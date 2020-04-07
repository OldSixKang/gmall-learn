package com.kss.gmall.sms.api;

import com.kss.core.bean.Resp;
import com.kss.gmall.sms.vo.SkuSaleVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface GmallSmsApi {

    @PostMapping("/sms/skubounds/sku/sale/save")
    Resp<Object> saveSale(@RequestBody SkuSaleVO skuSaleVO);
}
