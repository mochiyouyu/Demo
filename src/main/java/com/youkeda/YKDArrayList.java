package com.youkeda;

public class YKDArrayList {
    // 此处需要声明一个数组，作为底层存储
    int[] array = new int[20];
    int size = 0;

    public YKDArrayList() {
    }

    // 获取数组的长度
    public int size() {
        return this.size;
    }

    // 数组获取某个索引值
    public int get(int index) {
        return this.array[index];
    }

    // 添加元素在末尾
    public void add(int element) {
        //相当于调用传入this.size
        this.add(this.size, element);
    }

    // 添加元素在中间
    public void add(int index, int element) {
        if (index < 0 || index > this.size) {
            return;
        }

        // 支持扩容
        if(this.size>array.length){
            int[] newArray = new int[this.array.length*2];
            for(int i =0;i<this.array.length;i++){
                newArray[i]=this.array[i];
            }
            for (int i = this.size - 1; i >= index; i--) {
                newArray[i + 1] = newArray[i];
            }
            // 插入元素
            newArray[index] = element;
            // 调整size
            this.size++;
        }
        // TODO
        // 元素依次右移
        for (int i = this.size - 1; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }
        // 插入元素
        this.array[index] = element;
        // 调整size
        this.size++;
    }

    // 删除元素
    public void remove(int index) {
        if (index < 0 || index > this.size - 1) {
            return;
        }

        // 元素依次左移
        for (int i = index; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        // 删除最后一个元素
        this.array[this.size - 1] = 0;
        // 调整size
        this.size--;
    }

    public static void main(String[] args) {
        YKDArrayList ykdArrayList = new YKDArrayList();
        ykdArrayList.add(1);
        ykdArrayList.add(2);
        ykdArrayList.add(3);
        ykdArrayList.add(4);

        ykdArrayList.add(0, 5);

        ykdArrayList.remove(3);
        for (int i = 0; i < ykdArrayList.size(); i++) {
            System.out.println(ykdArrayList.get(i));
        }
    }
}
