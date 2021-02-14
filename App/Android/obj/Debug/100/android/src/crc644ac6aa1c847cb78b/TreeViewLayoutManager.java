package crc644ac6aa1c847cb78b;


public class TreeViewLayoutManager
	extends androidx.recyclerview.widget.LinearLayoutManager
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_canScrollHorizontally:()Z:GetCanScrollHorizontallyHandler\n" +
			"n_scrollHorizontallyBy:(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I:GetScrollHorizontallyBy_ILandroidx_recyclerview_widget_RecyclerView_Recycler_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"n_layoutDecorated:(Landroid/view/View;IIII)V:GetLayoutDecorated_Landroid_view_View_IIIIHandler\n" +
			"n_layoutDecoratedWithMargins:(Landroid/view/View;IIII)V:GetLayoutDecoratedWithMargins_Landroid_view_View_IIIIHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.DataControlsRenderer.Android.TreeViewLayoutManager, Telerik.XamarinForms.DataControls", TreeViewLayoutManager.class, __md_methods);
	}


	public TreeViewLayoutManager (android.content.Context p0)
	{
		super (p0);
		if (getClass () == TreeViewLayoutManager.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.DataControlsRenderer.Android.TreeViewLayoutManager, Telerik.XamarinForms.DataControls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public TreeViewLayoutManager (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == TreeViewLayoutManager.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.DataControlsRenderer.Android.TreeViewLayoutManager, Telerik.XamarinForms.DataControls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public TreeViewLayoutManager (android.content.Context p0, int p1, boolean p2)
	{
		super (p0, p1, p2);
		if (getClass () == TreeViewLayoutManager.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.DataControlsRenderer.Android.TreeViewLayoutManager, Telerik.XamarinForms.DataControls", "Android.Content.Context, Mono.Android:System.Int32, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public boolean canScrollHorizontally ()
	{
		return n_canScrollHorizontally ();
	}

	private native boolean n_canScrollHorizontally ();


	public int scrollHorizontallyBy (int p0, androidx.recyclerview.widget.RecyclerView.Recycler p1, androidx.recyclerview.widget.RecyclerView.State p2)
	{
		return n_scrollHorizontallyBy (p0, p1, p2);
	}

	private native int n_scrollHorizontallyBy (int p0, androidx.recyclerview.widget.RecyclerView.Recycler p1, androidx.recyclerview.widget.RecyclerView.State p2);


	public void layoutDecorated (android.view.View p0, int p1, int p2, int p3, int p4)
	{
		n_layoutDecorated (p0, p1, p2, p3, p4);
	}

	private native void n_layoutDecorated (android.view.View p0, int p1, int p2, int p3, int p4);


	public void layoutDecoratedWithMargins (android.view.View p0, int p1, int p2, int p3, int p4)
	{
		n_layoutDecoratedWithMargins (p0, p1, p2, p3, p4);
	}

	private native void n_layoutDecoratedWithMargins (android.view.View p0, int p1, int p2, int p3, int p4);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
