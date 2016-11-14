# MyUtility
Kumpulan kelas yg meskipun *ecek-ecek* tapi pernah berguna.

## 1. [MoneyEditText](https://github.com/hangga/MyUtility/blob/master/MoneyEditText.java)
*MoneyEditText* adalah EditText dengan format money.
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

![alt tag](https://github.com/hangga/MyUtility/blob/master/device-2016-11-08-052345.png)
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
## 3. [LayoutGlow](https://github.com/hangga/MyUtility/blob/master/LayoutGlow.java)
```
<id.web.hangga.glow.LayoutGlow
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:background="@color/colorAccent"/>
```
![alt_tag](https://github.com/hangga/MyUtility/blob/master/device-2016-11-08-102750.png)

## 4. [JavaneseCalenderUtils](https://github.com/hangga/MyUtility/blob/master/JavaneseCalenderUtils.java)
Modul ini berisi algoritma hari pasaran Jawa.  
Misal:  **Selasa** `Pahing`, **08-Nopember-2016**

## 5. [MonthSpinner](https://github.com/hangga/MyUtility/blob/master/MonthSpinner.java)
Spinner dengan item Nama-nama Bulan (Januari, Februari,... , Desember).   
```
<com.poniyem.kangsen.CustomView.MonthSpinner
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:theme="@style/ThemeOverlay.AppCompat.Dark"/>
            ```
![alt_tag](https://github.com/hangga/MyUtility/blob/master/device-2016-11-14-101144.png)
