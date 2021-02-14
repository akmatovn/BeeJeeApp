package crc648f4167c40236b0a7;


public class TemplateDayEventView
	extends com.telerik.widget.calendar.dayview.DayEventViewBase
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.TemplateDayEventView, Telerik.XamarinForms.Input", TemplateDayEventView.class, __md_methods);
	}


	public TemplateDayEventView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == TemplateDayEventView.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.TemplateDayEventView, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

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
