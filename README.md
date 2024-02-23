无任何改动，只是在RecyclerView的基础上自定义了  LayoutManager
用法简单，无需重写复写
可自定义选中样式，未选中样式



https://github.com/ZhaoChanghu/GalleryLayoutManager/assets/102503630/9fe707dd-0735-48b0-b6db-520cdcefbc2e

![5f59dcaa413946e98eea7d6ece3bd4c](https://github.com/ZhaoChanghu/GalleryLayoutManager/assets/102503630/0f3b2c24-4d4e-49c6-94e8-4e736717f6ea)


使用方式如下

GalleryLayoutManager manager = new GalleryLayoutManager(RecyclerView.HORIZONTAL);  
        manager.attach(mRv);
        //设置滑动缩放效果
        manager.setItemTransformer(new Transformer());
