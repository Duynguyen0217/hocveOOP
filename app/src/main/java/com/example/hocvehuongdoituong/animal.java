package com.example.hocvehuongdoituong;

import android.util.Log;

public class animal {

    //1 : thuộc tính
   //  public String name;
   //  public Integer weight;

    private  String name;
    private  Integer weight;


    //2: hành vi

    //constructor :phương thức khởi tạo
    //mặc định object sẽ cung cấp constructor rỗng cho lớp đối tượng

    public animal(String name , Integer weight)
    {
        /*name của class animal ở trên*/ this.name= name /* name của phương thức khởi tạo*/;
        this.weight =weight; //từ khóa this: đại diện cho lớp khởi tạo ra nó

    } //constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<=0)
        {
            Log.d("BBBB" , "thuộc tính chưa có giá trị");
        }
        else
        {
            this.name = name;
        }
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
