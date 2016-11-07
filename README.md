# MyUtility
Kumpulan kelas yg meskipun *ecek-ecek* tapi pernah berguna.

## 1. [MoneyEditText](https://github.com/hangga/MyUtility/blob/master/MoneyEditText.java)

Pastikan menggunakan input type = numberDecimal
```
android:inputType="numberDecimal"
```

Contoh
```
<id.web.hangga.gemi.CustomView.MoneyEditText
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="numberDecimal"
                        android:textColor="@color/black_muda_2"
                        android:textSize="@dimen/text_size_normal"
                        android:hint="@string/nilai"
                        android:ems="10"
                        android:gravity="top|left"
                        android:id="@+id/edtVal" />          
```
## 2. [ImageViewGlow](https://github.com/hangga/MyUtility/blob/master/ImageViewGlow.java)
```
<id.web.hangga.glow.ImageViewGlow
        android:id="@+id/imgIronman"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:src="@mipmap/ironman"/>

    <id.web.hangga.glow.ImageViewGlow
        android:id="@+id/imgWolverine"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:src="@mipmap/buzz_wolverine"/>
```
