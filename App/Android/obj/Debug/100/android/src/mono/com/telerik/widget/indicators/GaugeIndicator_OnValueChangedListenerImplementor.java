package mono.com.telerik.widget.indicators;


public class GaugeIndicator_OnValueChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.telerik.widget.indicators.GaugeIndicator.OnValueChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_valueChanged:(Lcom/telerik/widget/indicators/GaugeIndicator;)V:GetValueChanged_Lcom_telerik_widget_indicators_GaugeIndicator_Handler:Com.Telerik.Widget.Indicators.GaugeIndicator/IOnValueChangedListenerInvoker, Telerik.Xamarin.Android.Gauges\n" +
			"";
		mono.android.Runtime.register ("Com.Telerik.Widget.Indicators.GaugeIndicator+IOnValueChangedListenerImplementor, Telerik.Xamarin.Android.Gauges", GaugeIndicator_OnValueChangedListenerImplementor.class, __md_methods);
	}


	public GaugeIndicator_OnValueChangedListenerImplementor ()
	{
		super ();
		if (getClass () == GaugeIndicator_OnValueChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Telerik.Widget.Indicators.GaugeIndicator+IOnValueChangedListenerImplementor, Telerik.Xamarin.Android.Gauges", "", this, new java.lang.Object[] {  });
	}


	public void valueChanged (com.telerik.widget.indicators.GaugeIndicator p0)
	{
		n_valueChanged (p0);
	}

	private native void n_valueChanged (com.telerik.widget.indicators.GaugeIndicator p0);

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
