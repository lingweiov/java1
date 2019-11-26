package com.huidian.day5.demo05;/*
@outhor shkstart
@date 2019/11/25-14:41
*/

import javax.swing.*;

public abstract class RedPacketFrame extends JFrame {

    /* ownerName : 群主名称 */

    public String ownerName = "谁谁谁谁";

    /* openMode : 红包的类型 [普通红包/手气红包] */

    public OpenMode openMode = null;

    /** * 构造方法:生成红包界面.

     * @param title 页面的标题

    . */

    public RedPacketFrame(String title) {

        super(title);

        //init();// 页面相关的初始化操作

    }

    /* set方法 */

    public void setOwnerName(String ownerName) {

        this.ownerName = ownerName;

    }

    public void setOpenMode(OpenMode openMode) {

        this.openMode = openMode;

    }

}

