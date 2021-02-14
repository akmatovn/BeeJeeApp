package crc644f99bf883c54e766;


public class RichTextViewHandler
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_OnMessageReceived:(Ljava/lang/String;)V:__export__\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.RichTextEditor.Android.RichTextViewHandler, Telerik.XamarinForms.RichTextEditor", RichTextViewHandler.class, __md_methods);
	}


	public RichTextViewHandler ()
	{
		super ();
		if (getClass () == RichTextViewHandler.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.RichTextEditor.Android.RichTextViewHandler, Telerik.XamarinForms.RichTextEditor", "", this, new java.lang.Object[] {  });
	}

	@android.webkit.JavascriptInterface

	public void postMessage (java.lang.String p0)
	{
		n_OnMessageReceived (p0);
	}

	private native void n_OnMessageReceived (java.lang.String p0);

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
