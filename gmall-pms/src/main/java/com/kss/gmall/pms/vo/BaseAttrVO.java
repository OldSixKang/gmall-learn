package com.kss.gmall.pms.vo;

import com.kss.gmall.pms.entity.ProductAttrValue;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Data
public class BaseAttrVO extends ProductAttrValue {

    public void setValueSelected(List<String> selected) {
        if (!CollectionUtils.isEmpty(selected)) {
            this.setAttrValue(StringUtils.join(selected, ","));
        }
    }
}
