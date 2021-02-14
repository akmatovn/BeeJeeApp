package crc64e506792e4c07fbf8;


public class RadPopup_ScrollListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnScrollChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScrollChanged:()V:GetOnScrollChangedHandler:Android.Views.ViewTreeObserver/IOnScrollChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.Primitives.RadPopup+ScrollListener, Telerik.XamarinForms.Primitives", RadPopup_ScrollListener.class, __md_methods);
	}


	public RadPopup_ScrollListener ()
	{
		super ();
		if (getClass () == RadPopup_ScrollListener.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.Primitives.RadPopup+ScrollListener, Telerik.XamarinForms.Primitives", "", this, new java.lang.Object[] {  });
	}


	public void onScrollChanged ()
	{
		n_onScrollChanged ();
	}

	private native void n_onScrollChanged ();

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
