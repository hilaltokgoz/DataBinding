package com

import android.view.View
import android.widget.TextView
import androidx.core.view.setPadding
import androidx.databinding.BindingAdapter

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 25.03.2022               │
//└──────────────────────────┘

@BindingAdapter("CatName")//xml'de nasıl gözükecek.
fun setText(textView:TextView,name:String){ //BindingAdapter ne yapsın istiyoruz
    textView.text="Hello Cat $name"
}
//Yalnzca sol padding biz giricez.Diğrelerini default verilen değer gösterecek
@BindingAdapter("leftPadding")
fun leftPaddingAdd(view: View,padding:Int){
    view.setPadding(padding,view.paddingTop,view.paddingRight,view.paddingBottom) }
//2 argümanlı padding
@BindingAdapter("topPadding","bottomPadding")
fun paddingAdd(view:View,topPadding:Int,bottomPadding:Int){
  view.setPadding(view.left,topPadding,view.right,bottomPadding)
}