package com.atfan.bean;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author fx
 * @create 2021-01-08 22:10
 */
public class Hello {
    //模板六：prsf / psf / psfi / psfs
    private static final int i = 0;
    public static final int j = 0;
    public static final int j1 = 0;
    public static final String j2 = "s";
    //自定义模板2：pric
    /**
     * java bean
     */
    private int a;
    public static int b;

    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout /soutp / sputm / sputv / xxx.sout
        System.out.println();
        //模板三：fori / iter / itar
        String[] arr = {"arr1", "arr2"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四--for循环：list.for / list.fori / list.forr
        // itco / itit / itli

        ArrayList<Integer> alist = new ArrayList();
        alist.add(123);
        alist.add(456);
        alist.add(789);
        alist.add(012);

        for (Integer integer : alist) {

        }
        for (int i = 0; i < alist.size(); i++) {

        }
        for (int i = alist.size() - 1; i >= 0; i--) {

        }

        for (Iterator<Integer> iterator = alist.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();

        }
        Iterator<Integer> iterator = alist.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();

        }
        for (int k = 0; k < alist.size(); k++) {
            Integer integer = alist.get(k);

        }
        //模板五--if：ifn / inn，xxx.null / xxx.n
        if (alist == null) {

        }
        if (alist != null) {

        }
        if (alist == null) {

        }
        if (alist != null) {

        }
    }

    //自定义模板1：测试函数 test
    public void testUpdata() {

    }

    // 自定义模板3：
    // 创建方法 pu
    public int getA() {
        return a;
    }

    // 创建静态方法 ps
    public static int getB() {
        return b;
    }

    // 创建无返回值的方法 pv
    public void setA() {

    }

    // 创建静态无返回值的方法 psv
    public static void setA1() {

    }
    public static void setB(){

    }

    // 快捷键

    // 运行 Art+Shift+F10; 调试 Shift+F9； 停止 Ctrl+F2
    // 格式化代码/import列表 Ctrl+Alt+L/o
    // 快速修复错误、new对象时返回对象的定义都是 Alt+Enter

    /*快捷键1：代码生成：*/
    // Ctrl+j、上面的所有模板
    // Alt+Insert(编辑窗口生成构造函数、toString、getter/setter、重写父类方法)
    // xxx.var、xxx.方法名().var+Tab/Enter 生成变量并赋值
    // Ctrl+Shift+Enter 补全if/for的花括号{}、一行代码结束的末尾封号;

    /*快捷键2：编辑：*/
    // 选择(取消)光标所在处的单词 Ctrl+W、Ctrl+Shift+W
    // 批量修改变量名 Ctrl+Shift+Alt+J
    // 移动光标到前后单词 Ctrl+左/右键
    // 复制、删除当前行 Ctrl+D/Y
    // 将当前行移动到上/下一行 Shift + Alt + 上/下键
    // 当前行上/下一行插入空行 Ctrl + Alt + Enter、Shift + Enter
    // 选择当前行 ：
        /*按End(定位到行尾)然后按Shift+Home*/
        /*按Home（定位到行首）然后按Shift+↓
        */
        /*    按Home（定位到行首）然后按Shift+Dnd（行尾）*/

    /*快捷键3：UML类图*/
    // Ctrl + Shift +Alt + U、Ctrl +Alt + U

    /*快捷键4：查看源码*/
    // 光标移动到要查看的类，按Ctrl+左击鼠标
    // 查看类中方法 先Ctrl+F12，接着在出现的面板直接输入要查找的方法名
}
