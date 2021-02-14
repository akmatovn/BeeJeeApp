package crc648f4167c40236b0a7;


public class ComboBoxWindowCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.Window.Callback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_dispatchGenericMotionEvent:(Landroid/view/MotionEvent;)Z:GetDispatchGenericMotionEvent_Landroid_view_MotionEvent_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_dispatchKeyEvent:(Landroid/view/KeyEvent;)Z:GetDispatchKeyEvent_Landroid_view_KeyEvent_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_dispatchKeyShortcutEvent:(Landroid/view/KeyEvent;)Z:GetDispatchKeyShortcutEvent_Landroid_view_KeyEvent_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_dispatchPopulateAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)Z:GetDispatchPopulateAccessibilityEvent_Landroid_view_accessibility_AccessibilityEvent_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_dispatchTouchEvent:(Landroid/view/MotionEvent;)Z:GetDispatchTouchEvent_Landroid_view_MotionEvent_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_dispatchTrackballEvent:(Landroid/view/MotionEvent;)Z:GetDispatchTrackballEvent_Landroid_view_MotionEvent_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActionModeFinished:(Landroid/view/ActionMode;)V:GetOnActionModeFinished_Landroid_view_ActionMode_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActionModeStarted:(Landroid/view/ActionMode;)V:GetOnActionModeStarted_Landroid_view_ActionMode_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onContentChanged:()V:GetOnContentChangedHandler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onCreatePanelMenu:(ILandroid/view/Menu;)Z:GetOnCreatePanelMenu_ILandroid_view_Menu_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onCreatePanelView:(I)Landroid/view/View;:GetOnCreatePanelView_IHandler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onMenuItemSelected:(ILandroid/view/MenuItem;)Z:GetOnMenuItemSelected_ILandroid_view_MenuItem_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onMenuOpened:(ILandroid/view/Menu;)Z:GetOnMenuOpened_ILandroid_view_Menu_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onPanelClosed:(ILandroid/view/Menu;)V:GetOnPanelClosed_ILandroid_view_Menu_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z:GetOnPreparePanel_ILandroid_view_View_Landroid_view_Menu_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onSearchRequested:()Z:GetOnSearchRequestedHandler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onSearchRequested:(Landroid/view/SearchEvent;)Z:GetOnSearchRequested_Landroid_view_SearchEvent_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onWindowAttributesChanged:(Landroid/view/WindowManager$LayoutParams;)V:GetOnWindowAttributesChanged_Landroid_view_WindowManager_LayoutParams_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onWindowFocusChanged:(Z)V:GetOnWindowFocusChanged_ZHandler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onWindowStartingActionMode:(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;:GetOnWindowStartingActionMode_Landroid_view_ActionMode_Callback_Handler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onWindowStartingActionMode:(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;:GetOnWindowStartingActionMode_Landroid_view_ActionMode_Callback_IHandler:Android.Views.Window/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.ComboBoxWindowCallback, Telerik.XamarinForms.Input", ComboBoxWindowCallback.class, __md_methods);
	}


	public ComboBoxWindowCallback ()
	{
		super ();
		if (getClass () == ComboBoxWindowCallback.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.ComboBoxWindowCallback, Telerik.XamarinForms.Input", "", this, new java.lang.Object[] {  });
	}

	public ComboBoxWindowCallback (android.view.Window.Callback p0, android.content.Context p1)
	{
		super ();
		if (getClass () == ComboBoxWindowCallback.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.ComboBoxWindowCallback, Telerik.XamarinForms.Input", "Android.Views.Window+ICallback, Mono.Android:Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean dispatchGenericMotionEvent (android.view.MotionEvent p0)
	{
		return n_dispatchGenericMotionEvent (p0);
	}

	private native boolean n_dispatchGenericMotionEvent (android.view.MotionEvent p0);


	public boolean dispatchKeyEvent (android.view.KeyEvent p0)
	{
		return n_dispatchKeyEvent (p0);
	}

	private native boolean n_dispatchKeyEvent (android.view.KeyEvent p0);


	public boolean dispatchKeyShortcutEvent (android.view.KeyEvent p0)
	{
		return n_dispatchKeyShortcutEvent (p0);
	}

	private native boolean n_dispatchKeyShortcutEvent (android.view.KeyEvent p0);


	public boolean dispatchPopulateAccessibilityEvent (android.view.accessibility.AccessibilityEvent p0)
	{
		return n_dispatchPopulateAccessibilityEvent (p0);
	}

	private native boolean n_dispatchPopulateAccessibilityEvent (android.view.accessibility.AccessibilityEvent p0);


	public boolean dispatchTouchEvent (android.view.MotionEvent p0)
	{
		return n_dispatchTouchEvent (p0);
	}

	private native boolean n_dispatchTouchEvent (android.view.MotionEvent p0);


	public boolean dispatchTrackballEvent (android.view.MotionEvent p0)
	{
		return n_dispatchTrackballEvent (p0);
	}

	private native boolean n_dispatchTrackballEvent (android.view.MotionEvent p0);


	public void onActionModeFinished (android.view.ActionMode p0)
	{
		n_onActionModeFinished (p0);
	}

	private native void n_onActionModeFinished (android.view.ActionMode p0);


	public void onActionModeStarted (android.view.ActionMode p0)
	{
		n_onActionModeStarted (p0);
	}

	private native void n_onActionModeStarted (android.view.ActionMode p0);


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onContentChanged ()
	{
		n_onContentChanged ();
	}

	private native void n_onContentChanged ();


	public boolean onCreatePanelMenu (int p0, android.view.Menu p1)
	{
		return n_onCreatePanelMenu (p0, p1);
	}

	private native boolean n_onCreatePanelMenu (int p0, android.view.Menu p1);


	public android.view.View onCreatePanelView (int p0)
	{
		return n_onCreatePanelView (p0);
	}

	private native android.view.View n_onCreatePanelView (int p0);


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();


	public boolean onMenuItemSelected (int p0, android.view.MenuItem p1)
	{
		return n_onMenuItemSelected (p0, p1);
	}

	private native boolean n_onMenuItemSelected (int p0, android.view.MenuItem p1);


	public boolean onMenuOpened (int p0, android.view.Menu p1)
	{
		return n_onMenuOpened (p0, p1);
	}

	private native boolean n_onMenuOpened (int p0, android.view.Menu p1);


	public void onPanelClosed (int p0, android.view.Menu p1)
	{
		n_onPanelClosed (p0, p1);
	}

	private native void n_onPanelClosed (int p0, android.view.Menu p1);


	public boolean onPreparePanel (int p0, android.view.View p1, android.view.Menu p2)
	{
		return n_onPreparePanel (p0, p1, p2);
	}

	private native boolean n_onPreparePanel (int p0, android.view.View p1, android.view.Menu p2);


	public boolean onSearchRequested ()
	{
		return n_onSearchRequested ();
	}

	private native boolean n_onSearchRequested ();


	public boolean onSearchRequested (android.view.SearchEvent p0)
	{
		return n_onSearchRequested (p0);
	}

	private native boolean n_onSearchRequested (android.view.SearchEvent p0);


	public void onWindowAttributesChanged (android.view.WindowManager.LayoutParams p0)
	{
		n_onWindowAttributesChanged (p0);
	}

	private native void n_onWindowAttributesChanged (android.view.WindowManager.LayoutParams p0);


	public void onWindowFocusChanged (boolean p0)
	{
		n_onWindowFocusChanged (p0);
	}

	private native void n_onWindowFocusChanged (boolean p0);


	public android.view.ActionMode onWindowStartingActionMode (android.view.ActionMode.Callback p0)
	{
		return n_onWindowStartingActionMode (p0);
	}

	private native android.view.ActionMode n_onWindowStartingActionMode (android.view.ActionMode.Callback p0);


	public android.view.ActionMode onWindowStartingActionMode (android.view.ActionMode.Callback p0, int p1)
	{
		return n_onWindowStartingActionMode (p0, p1);
	}

	private native android.view.ActionMode n_onWindowStartingActionMode (android.view.ActionMode.Callback p0, int p1);

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
