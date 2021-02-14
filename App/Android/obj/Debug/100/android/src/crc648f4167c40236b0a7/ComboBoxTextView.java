package crc648f4167c40236b0a7;


public class ComboBoxTextView
	extends android.widget.TextView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getFreezesText:()Z:GetGetFreezesTextHandler\n" +
			"n_setFreezesText:(Z)V:GetSetFreezesText_ZHandler\n" +
			"n_isCursorVisible:()Z:GetIsCursorVisibleHandler\n" +
			"n_getEllipsize:()Landroid/text/TextUtils$TruncateAt;:GetGetEllipsizeHandler\n" +
			"n_setEllipsize:(Landroid/text/TextUtils$TruncateAt;)V:GetSetEllipsize_Landroid_text_TextUtils_TruncateAt_Handler\n" +
			"n_getEditableText:()Landroid/text/Editable;:GetGetEditableTextHandler\n" +
			"n_getAccessibilityClassName:()Ljava/lang/CharSequence;:GetGetAccessibilityClassNameHandler\n" +
			"n_getDefaultMovementMethod:()Landroid/text/method/MovementMethod;:GetGetDefaultMovementMethodHandler\n" +
			"n_getDefaultEditable:()Z:GetGetDefaultEditableHandler\n" +
			"n_setText:(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V:GetSetText_Ljava_lang_CharSequence_Landroid_widget_TextView_BufferType_Handler\n" +
			"n_onInitializeAccessibilityNodeInfo:(Landroid/view/accessibility/AccessibilityNodeInfo;)V:GetOnInitializeAccessibilityNodeInfo_Landroid_view_accessibility_AccessibilityNodeInfo_Handler\n" +
			"n_onSelectionChanged:(II)V:GetOnSelectionChanged_IIHandler\n" +
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_onFocusChanged:(ZILandroid/graphics/Rect;)V:GetOnFocusChanged_ZILandroid_graphics_Rect_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.ComboBoxTextView, Telerik.XamarinForms.Input", ComboBoxTextView.class, __md_methods);
	}


	public ComboBoxTextView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ComboBoxTextView.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.ComboBoxTextView, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ComboBoxTextView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ComboBoxTextView.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.ComboBoxTextView, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ComboBoxTextView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ComboBoxTextView.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.ComboBoxTextView, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public ComboBoxTextView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == ComboBoxTextView.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.ComboBoxTextView, Telerik.XamarinForms.Input", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public boolean getFreezesText ()
	{
		return n_getFreezesText ();
	}

	private native boolean n_getFreezesText ();


	public void setFreezesText (boolean p0)
	{
		n_setFreezesText (p0);
	}

	private native void n_setFreezesText (boolean p0);


	public boolean isCursorVisible ()
	{
		return n_isCursorVisible ();
	}

	private native boolean n_isCursorVisible ();


	public android.text.TextUtils.TruncateAt getEllipsize ()
	{
		return n_getEllipsize ();
	}

	private native android.text.TextUtils.TruncateAt n_getEllipsize ();


	public void setEllipsize (android.text.TextUtils.TruncateAt p0)
	{
		n_setEllipsize (p0);
	}

	private native void n_setEllipsize (android.text.TextUtils.TruncateAt p0);


	public android.text.Editable getEditableText ()
	{
		return n_getEditableText ();
	}

	private native android.text.Editable n_getEditableText ();


	public java.lang.CharSequence getAccessibilityClassName ()
	{
		return n_getAccessibilityClassName ();
	}

	private native java.lang.CharSequence n_getAccessibilityClassName ();


	public android.text.method.MovementMethod getDefaultMovementMethod ()
	{
		return n_getDefaultMovementMethod ();
	}

	private native android.text.method.MovementMethod n_getDefaultMovementMethod ();


	public boolean getDefaultEditable ()
	{
		return n_getDefaultEditable ();
	}

	private native boolean n_getDefaultEditable ();


	public void setText (java.lang.CharSequence p0, android.widget.TextView.BufferType p1)
	{
		n_setText (p0, p1);
	}

	private native void n_setText (java.lang.CharSequence p0, android.widget.TextView.BufferType p1);


	public void onInitializeAccessibilityNodeInfo (android.view.accessibility.AccessibilityNodeInfo p0)
	{
		n_onInitializeAccessibilityNodeInfo (p0);
	}

	private native void n_onInitializeAccessibilityNodeInfo (android.view.accessibility.AccessibilityNodeInfo p0);


	public void onSelectionChanged (int p0, int p1)
	{
		n_onSelectionChanged (p0, p1);
	}

	private native void n_onSelectionChanged (int p0, int p1);


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);


	public void onFocusChanged (boolean p0, int p1, android.graphics.Rect p2)
	{
		n_onFocusChanged (p0, p1, p2);
	}

	private native void n_onFocusChanged (boolean p0, int p1, android.graphics.Rect p2);

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
