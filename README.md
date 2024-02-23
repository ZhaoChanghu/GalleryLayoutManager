无任何改动，只是在RecyclerView的基础上自定义了  LayoutManager
用法简单，无需重写复写
可自定义选中样式，未选中样式

使用方式如下

GalleryLayoutManager manager = new GalleryLayoutManager(RecyclerView.HORIZONTAL);  
        manager.attach(mRv);
        //设置滑动缩放效果
        manager.setItemTransformer(new Transformer());
