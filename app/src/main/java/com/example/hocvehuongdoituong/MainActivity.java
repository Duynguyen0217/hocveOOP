package com.example.hocvehuongdoituong;

import androidx.appcompat.app.AppCompatActivity;

import android.media.tv.TvContract;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* 15/12/2020
                + thuộc tính adjust view bound trong ImangeView?

        +Học về hướng đối tượng :
*tính chất :
        -tính kế thừa (-tính quan hệ
        -tính đóng gói
        -tính đa hình
        -tính trừu tượng*/


//   Access modifier : phạm vi truy cập
        animal/*tên lớp vừa tạo */ dog = new animal("kiki",5);
    //    dog.name = "kiki";
        // dog.weight = 5;
        //vidu: dog.name(): đang gọi phương thức
        //dog.name :gọi thuộc tính


        //public: ai cũng có thể nhìn thấy
        //private: ai tạo thì chỉ người đó thấy
        //default: giống private nhưng các class trong package có thể thấy giá trị trong default

       dog.setName("Milu");
       Log.d("BBBB" , dog.getName());



    }
}
