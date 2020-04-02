package com.kss.gmall.pms.vo;

import com.kss.gmall.pms.entity.Attr;
import com.kss.gmall.pms.entity.AttrAttrgroupRelation;
import com.kss.gmall.pms.entity.AttrGroup;
import lombok.Data;

import java.util.List;

@Data
public class GroupVO extends AttrGroup {

    private List<Attr> attrEntities;

    private List<AttrAttrgroupRelation> relations;
}
