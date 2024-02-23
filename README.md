无任何改动，只是在RecyclerView的基础上自定义了  LayoutManager  <br/>
用法简单，无需重写复写 <br/>
可自定义选中样式，未选中样式 <br/>

使用方式如下:  <br/>

GalleryLayoutManager manager = new GalleryLayoutManager(RecyclerView.HORIZONTAL);   <br/>
//mRv 你的RecyclerView
manager.attach(mRv);  <br/>
//设置滑动缩放效果，可自定义并重写  <br/>
manager.setItemTransformer(new Transformer());  <br/>

回调监听，此时就不需要 setOnClick 方法了，和ViewPage 一样，根据滑动监听处理: <br/>

manager.setOnItemSelectedListener(new GalleryLayoutManager.OnItemSelectedListener() { <br/>
@Override <br/>
public void onItemSelected(RecyclerView recyclerView,ArrayList<View> list,View item, int position) { <br/>
    //说明: list-当前列表的所有子条目， item-当前选中的 View， position-当前选中的下标 <br/>
               
   } <br/>
}); <br/>
