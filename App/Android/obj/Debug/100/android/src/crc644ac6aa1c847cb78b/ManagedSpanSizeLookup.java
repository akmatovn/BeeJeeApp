package crc644ac6aa1c847cb78b;


public class ManagedSpanSizeLookup
	extends androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getSpanSize:(I)I:GetGetSpanSize_IHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.DataControlsRenderer.Android.ManagedSpanSizeLookup, Telerik.XamarinForms.DataControls", ManagedSpanSizeLookup.class, __md_methods);
	}


	public ManagedSpanSizeLookup ()
	{
		super ();
		if (getClass () == ManagedSpanSizeLookup.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.DataControlsRenderer.Android.ManagedSpanSizeLookup, Telerik.XamarinForms.DataControls", "", this, new java.lang.Object[] {  });
	}

	public ManagedSpanSizeLookup (com.telerik.widget.list.RadListView p0, androidx.recyclerview.widget.GridLayoutManager p1)
	{
		super ();
		if (getClass () == ManagedSpanSizeLookup.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.DataControlsRenderer.Android.ManagedSpanSizeLookup, Telerik.XamarinForms.DataControls", "Com.Telerik.Widget.List.RadListView, Telerik.Xamarin.Android.List:AndroidX.RecyclerView.Widget.GridLayoutManager, Xamarin.AndroidX.RecyclerView", this, new java.lang.Object[] { p0, p1 });
	}


	public int getSpanSize (int p0)
	{
		return n_getSpanSize (p0);
	}

	private native int n_getSpanSize (int p0);

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
