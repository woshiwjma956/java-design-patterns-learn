package com.atguigu.adapter.classadapter;

import com.ycorn.patterns.bridge.OldManPhone;

public class Phone extends OldManPhone {

	//���
	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("��ѹΪ5V, ���Գ��~~");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("��ѹ����5V, ���ܳ��~~");
		}
	}
}
