package crc648f4167c40236b0a7;


public class EntryRenderer
	extends crc648f4167c40236b0a7.EntryRendererBase
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.EntryRenderer, Telerik.XamarinForms.Input", EntryRenderer.class, __md_methods);
	}


	public EntryRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == EntryRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.EntryRenderer, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public EntryRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == EntryRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.EntryRenderer, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public EntryRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == EntryRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.EntryRenderer, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
