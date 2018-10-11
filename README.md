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

## 6. [DotIndicator](https://github.com/hangga/DotIndicator)
Dots Indicator for ViewPager
# Screenshot
![alt tag](https://github.com/hangga/DotIndicator/blob/master/device-2017-02-13-115125.png)

# how to use
```
<com.sebangga.sebangga.customview.DotIndicator
        android:id="@+id/viewIncicator"
        android:layout_above="@+id/wadahbottom"
        android:layout_width="match_parent"
        android:layout_height="55dp"
        android:layout_centerHorizontal="true"
        android:gravity="center"
        android:orientation="horizontal"
        android:paddingTop="10dp"
        android:layout_marginBottom="0dp"/>
 ```
 
 
 ```
 viewIncicator = (DotIndicator) findViewById(R.id.viewIncicator);
 mViewPager.setAdapter(mSectionsPagerAdapter);
 viewIncicator.setViewPager(mViewPager);
```        
        
## 7. [DecimalToHex](https://github.com/hangga/MyUtility/blob/master/DecimalToHex.java)
Print decimal to hex from 100% to 0%

100% — FF       
99% — FC       
98% — FA       
97% — F7       
96% — F5       
95% — F2       
94% — F0       
93% — ED       
92% — EB       
91% — E8       
90% — E6       
89% — E3       
88% — E0       
87% — DE       
86% — DB       
85% — D9       
84% — D6       
83% — D4       
82% — D1       
81% — CF       
80% — CC       
79% — C9       
78% — C7       
77% — C4       
76% — C2       
75% — BF       
74% — BD       
73% — BA       
72% — B8       
71% — B5       
70% — B3       
69% — B0       
68% — AD       
67% — AB       
66% — A8       
65% — A6       
64% — A3       
63% — A1       
62% — 9E       
61% — 9C       
60% — 99       
59% — 96       
58% — 94       
57% — 91       
56% — 8F       
55% — 8C       
54% — 8A       
53% — 87       
52% — 85       
51% — 82       
50% — 80       
49% — 7D       
48% — 7A       
47% — 78       
46% — 75       
45% — 73       
44% — 70       
43% — 6E       
42% — 6B       
41% — 69       
40% — 66       
39% — 63       
38% — 61       
37% — 5E       
36% — 5C       
35% — 59       
34% — 57       
33% — 54       
32% — 52       
31% — 4F       
30% — 4D       
29% — 4A       
28% — 47       
27% — 45       
26% — 42       
25% — 40       
24% — 3D       
23% — 3B       
22% — 38       
21% — 36       
20% — 33       
19% — 30       
18% — 2E       
17% — 2B       
16% — 29       
15% — 26       
14% — 24       
13% — 21       
12% — 1F       
11% — 1C       
10% — 1A       
9% — 17       
8% — 14       
7% — 12       
6% — 0F       
5% — 0D       
4% — 0A       
3% — 08       
2% — 05       
1% — 03       
0% — 00
