package crc648f4167c40236b0a7;


public class DynamicEditorSpinnerAdapter
	extends com.telerik.widget.dataform.visualization.editors.adapters.EditorSpinnerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.DynamicEditorSpinnerAdapter, Telerik.XamarinForms.Input", DynamicEditorSpinnerAdapter.class, __md_methods);
	}


	public DynamicEditorSpinnerAdapter (android.content.Context p0, int p1, java.lang.Object[] p2)
	{
		super (p0, p1, p2);
		if (getClass () == DynamicEditorSpinnerAdapter.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DynamicEditorSpinnerAdapter, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android:System.Int32, mscorlib:Java.Lang.Object[], Mono.Android", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public DynamicEditorSpinnerAdapter (android.content.Context p0, java.lang.Object[] p1)
	{
		super (p0, p1);
		if (getClass () == DynamicEditorSpinnerAdapter.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DynamicEditorSpinnerAdapter, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android:Java.Lang.Object[], Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}

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
