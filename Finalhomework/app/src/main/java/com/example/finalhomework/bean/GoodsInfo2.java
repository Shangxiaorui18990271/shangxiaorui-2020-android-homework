package com.example.finalhomework.bean;

import com.example.finalhomework.R;

import java.util.ArrayList;

public class GoodsInfo2 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo2() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个商品的名称数组
    private static String[] mNameArray = {
            "PUCKY毕奇精灵星座系列", "PUCKY精灵气球宝宝系列", "Dimoo太空旅行系列",
            "Dimoo社会大学系列", "Molly小鸟系列", "Molly宫廷瑞兽"
    };
    // 声明一个商品的描述数组
    private static String[] mDescArray = {
            "POPMART泡泡玛特 PUCKY毕奇精灵星座系列盲盒公仔不支持退货退款",
            "POPMART泡泡玛特 Pucky精灵气球宝宝系列盲盒手办玩具不支持退款",
            "POPMART泡泡玛特 Dimoo太空旅行系列盲盒一套不支持无理由退换",
            "POPMART泡泡玛特 Dimoo社会大学系列盲盒一套公仔不支持退货退款",
            "POPMART泡泡玛特 Molly小鸟系列盲盒公仔潮玩摆件不支持退货退款",
            "POPMART泡泡玛特 Molly宫廷瑞兽盲盒公仔手办不支持退货退款",

    };
    // 声明一个商品的价格数组
    private static float[] mPriceArray = {708, 708, 708, 708, 59, 59};
    // 声明一个商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.pm01_s, R.drawable.pm02_s, R.drawable.pm03_s, R.drawable.pm04_s,
            R.drawable.pm05_s, R.drawable.pm06_s
    };
    // 声明一个商品的大图数组
    private static int[] mPicArray = {
            R.drawable.pm01, R.drawable.pm02, R.drawable.pm03, R.drawable.pm04,
            R.drawable.pm05, R.drawable.pm06
    };

    // 获取默认的商品信息列表
    public static ArrayList<GoodsInfo2> getDefaultList() {
        ArrayList<GoodsInfo2> goodsList = new ArrayList<GoodsInfo2>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo2 info = new GoodsInfo2();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}