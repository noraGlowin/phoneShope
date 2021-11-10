package com.example.phoneshope.data

import com.example.phoneshope.R
import com.example.phoneshope.model.Product

class Datasource {
    fun loadMyShopData():List<Product>{
        return listOf<Product>(
            Product(R.string.iphone12,R.drawable.iphone,R.string.iphone12_price ,5,true),
            Product(R.string.samsung,R.drawable.samsung_galaxy_uitra,R.string.samsung_price,5,false ),
            Product(R.string.xiaomi,R.drawable.xiaomi_pro,R.string.xiaomi_price,0,false),
            Product(R.string.huawei,R.drawable.huawei_yp,R.string.huawei_price,0,false),
            Product(R.string.samsungz,R.drawable.samsung_galaxy_z_flip,R.string.samsungz_price,70,true),
            Product(R.string.iphone13,R.drawable.iphone13,R.string.iphone13_price,36,true)
        )
    }
}