package com.ytt.designpattern.zuhemoshi;

/**
 * Created by ytt on 2018/12/22.
 *
 * 1. 开闭原则。   增加新功能（新文件类型压缩包），不用修改原来代码，只用增加一个类。
 * 2. 里氏替换原则。 基类定义。
 *          ----不满足
 *              add()，remove()，客户端，不能完全针对抽象构建编程，会出现异常提示。
 * 3. 依赖倒转。 关联关系中，使用高层次抽象类。
 *          private ArrayList<AbstractFile> fileArrayList = new ArrayList<AbstractFile>();
 * 4. 单一职责。接口隔离。
 *          --- 不满足。：例如，文件的，add()，remove()，是不需要的，应该不开放。
 *                      叶子构建中需要进行多次的异常处理。
 *          --- 解决办法。（里氏替换 和 最小知识的矛盾）
 *              1. 将叶子构件的方法 add()，remove() 移到 AbstractFile中统一处理。
 *                  客户端，不能完全针对抽象构建编程，会出现异常提示。
 *                  或者使用，子类定义对象。
 *              2. 减小接口颗粒度。
 *                  不在 abstractFile 中声明，add(),remove(),等容器方法。
 *                      ---问题: 客户端，不能统一对待。 容器，和，叶子 构件。
 * 5. 组合复用
 * 6. 最小知识。
 *         满足，，，我只用和 AbstractFile 类打交道，不用和具体的实现类打交道。
 */
public class Client {
    public static void main(String[] args) {
        //针对抽象构建进行编程--里氏替换原则--尽量使用基本类型进行对象定义
        AbstractFile file1,file2,file3,file4,file5;
        AbstractFile folder1,folder2,folder3,folder4;

        folder1 = new Folder("Sunny的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        file3 = new TextFile("九阴真经.txt");
        file4 = new TextFile("葵花宝典.doc");
        file5 = new VideoFile("笑傲江湖.rmvb");

        file1.add(file1);
        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder1.killVirus();

    }
}
