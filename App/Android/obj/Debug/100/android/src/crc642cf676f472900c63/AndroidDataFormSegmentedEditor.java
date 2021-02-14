package crc642cf676f472900c63;


public class AndroidDataFormSegmentedEditor
	extends com.telerik.widget.dataform.visualization.editors.DataFormSegmentedEditor
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.DataForm.AndroidDataFormSegmentedEditor, Telerik.XamarinForms.Input", AndroidDataFormSegmentedEditor.class, __md_methods);
	}


	public AndroidDataFormSegmentedEditor (com.telerik.widget.dataform.visualization.RadDataForm p0, com.telerik.widget.dataform.engine.EntityProperty p1)
	{
		super (p0, p1);
		if (getClass () == AndroidDataFormSegmentedEditor.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataForm.AndroidDataFormSegmentedEditor, Telerik.XamarinForms.Input", "Com.Telerik.Widget.Dataform.Visualization.RadDataForm, Telerik.Xamarin.Android.Input:Com.Telerik.Widget.Dataform.Engine.IEntityProperty, Telerik.Xamarin.Android.Input", this, new java.lang.Object[] { p0, p1 });
	}


	public AndroidDataFormSegmentedEditor (com.telerik.widget.dataform.visualization.RadDataForm p0, int p1, int p2, int p3, int p4, int p5, int p6, com.telerik.widget.dataform.engine.EntityProperty p7)
	{
		super (p0, p1, p2, p3, p4, p5, p6, p7);
		if (getClass () == AndroidDataFormSegmentedEditor.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataForm.AndroidDataFormSegmentedEditor, Telerik.XamarinForms.Input", "Com.Telerik.Widget.Dataform.Visualization.RadDataForm, Telerik.Xamarin.Android.Input:System.Int32, mscorlib:System.Int32, mscorlib:System.Int32, mscorlib:System.Int32, mscorlib:System.Int32, mscorlib:System.Int32, mscorlib:Com.Telerik.Widget.Dataform.Engine.IEntityProperty, Telerik.Xamarin.Android.Input", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5, p6, p7 });
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
