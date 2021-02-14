package crc644ac6aa1c847cb78b;


public class ListViewAccessibilityDelegateCompat
	extends androidx.core.view.AccessibilityDelegateCompat
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPopulateAccessibilityEvent:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V:GetOnPopulateAccessibilityEvent_Landroid_view_View_Landroid_view_accessibility_AccessibilityEvent_Handler\n" +
			"n_onInitializeAccessibilityNodeInfo:(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V:GetOnInitializeAccessibilityNodeInfo_Landroid_view_View_Landroidx_core_view_accessibility_AccessibilityNodeInfoCompat_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.DataControlsRenderer.Android.ListViewAccessibilityDelegateCompat, Telerik.XamarinForms.DataControls", ListViewAccessibilityDelegateCompat.class, __md_methods);
	}


	public ListViewAccessibilityDelegateCompat ()
	{
		super ();
		if (getClass () == ListViewAccessibilityDelegateCompat.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.DataControlsRenderer.Android.ListViewAccessibilityDelegateCompat, Telerik.XamarinForms.DataControls", "", this, new java.lang.Object[] {  });
	}


	public ListViewAccessibilityDelegateCompat (android.view.View.AccessibilityDelegate p0)
	{
		super (p0);
		if (getClass () == ListViewAccessibilityDelegateCompat.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.DataControlsRenderer.Android.ListViewAccessibilityDelegateCompat, Telerik.XamarinForms.DataControls", "Android.Views.View+AccessibilityDelegate, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	public ListViewAccessibilityDelegateCompat (crc644ac6aa1c847cb78b.RadListViewDataSourceAdapter p0)
	{
		super ();
		if (getClass () == ListViewAccessibilityDelegateCompat.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.DataControlsRenderer.Android.ListViewAccessibilityDelegateCompat, Telerik.XamarinForms.DataControls", "Telerik.XamarinForms.DataControlsRenderer.Android.RadListViewDataSourceAdapter, Telerik.XamarinForms.DataControls", this, new java.lang.Object[] { p0 });
	}


	public void onPopulateAccessibilityEvent (android.view.View p0, android.view.accessibility.AccessibilityEvent p1)
	{
		n_onPopulateAccessibilityEvent (p0, p1);
	}

	private native void n_onPopulateAccessibilityEvent (android.view.View p0, android.view.accessibility.AccessibilityEvent p1);


	public void onInitializeAccessibilityNodeInfo (android.view.View p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1)
	{
		n_onInitializeAccessibilityNodeInfo (p0, p1);
	}

	private native void n_onInitializeAccessibilityNodeInfo (android.view.View p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1);

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
