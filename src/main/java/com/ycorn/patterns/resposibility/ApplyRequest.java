package com.ycorn.patterns.resposibility;

import lombok.Data;

/**
 * 描述: 报销申请
 * 1000以下部门经理审批
 * 1000-5000 财务总监审批
 * 5000 以上总经理审批
 *
 * @author JimWu
 * @create 2020-04-28 22:23
 */
@Data
public class ApplyRequest {

    public ApplyRequest(float money, String applier) {
        this.money = money;
        this.applier = applier;
    }

    private float money;//申请金额

    private String applier; //申请人
}