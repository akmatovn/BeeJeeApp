package crc648f4167c40236b0a7;


public class AndroidAgendaViewAdapter
	extends com.telerik.widget.calendar.agendaview.AgendaViewAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getStyleForMonthItem:(Lcom/telerik/widget/calendar/agendaview/CalendarAgendaMonthItem;)Lcom/telerik/widget/calendar/agendaview/styles/AgendaMonthItemStyle;:GetGetStyleForMonthItem_Lcom_telerik_widget_calendar_agendaview_CalendarAgendaMonthItem_Handler\n" +
			"n_getStyleForDayItem:(Lcom/telerik/widget/calendar/agendaview/CalendarAgendaDayItem;)Lcom/telerik/widget/calendar/agendaview/styles/AgendaDayItemStyle;:GetGetStyleForDayItem_Lcom_telerik_widget_calendar_agendaview_CalendarAgendaDayItem_Handler\n" +
			"n_getStyleForAppointment:(Lcom/telerik/widget/calendar/agendaview/CalendarAgendaAppointmentItem;)Lcom/telerik/widget/calendar/agendaview/styles/AgendaAppointmentStyle;:GetGetStyleForAppointment_Lcom_telerik_widget_calendar_agendaview_CalendarAgendaAppointmentItem_Handler\n" +
			"n_getStyleForWeekItem:(Lcom/telerik/widget/calendar/agendaview/CalendarAgendaWeekItem;)Lcom/telerik/widget/calendar/agendaview/styles/AgendaWeekItemStyle;:GetGetStyleForWeekItem_Lcom_telerik_widget_calendar_agendaview_CalendarAgendaWeekItem_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.AndroidAgendaViewAdapter, Telerik.XamarinForms.Input", AndroidAgendaViewAdapter.class, __md_methods);
	}


	public AndroidAgendaViewAdapter (com.telerik.widget.calendar.agendaview.CalendarAgendaView p0)
	{
		super (p0);
		if (getClass () == AndroidAgendaViewAdapter.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.AndroidAgendaViewAdapter, Telerik.XamarinForms.Input", "Com.Telerik.Widget.Calendar.Agendaview.CalendarAgendaView, Telerik.Xamarin.Android.Input", this, new java.lang.Object[] { p0 });
	}


	public com.telerik.widget.calendar.agendaview.styles.AgendaMonthItemStyle getStyleForMonthItem (com.telerik.widget.calendar.agendaview.CalendarAgendaMonthItem p0)
	{
		return n_getStyleForMonthItem (p0);
	}

	private native com.telerik.widget.calendar.agendaview.styles.AgendaMonthItemStyle n_getStyleForMonthItem (com.telerik.widget.calendar.agendaview.CalendarAgendaMonthItem p0);


	public com.telerik.widget.calendar.agendaview.styles.AgendaDayItemStyle getStyleForDayItem (com.telerik.widget.calendar.agendaview.CalendarAgendaDayItem p0)
	{
		return n_getStyleForDayItem (p0);
	}

	private native com.telerik.widget.calendar.agendaview.styles.AgendaDayItemStyle n_getStyleForDayItem (com.telerik.widget.calendar.agendaview.CalendarAgendaDayItem p0);


	public com.telerik.widget.calendar.agendaview.styles.AgendaAppointmentStyle getStyleForAppointment (com.telerik.widget.calendar.agendaview.CalendarAgendaAppointmentItem p0)
	{
		return n_getStyleForAppointment (p0);
	}

	private native com.telerik.widget.calendar.agendaview.styles.AgendaAppointmentStyle n_getStyleForAppointment (com.telerik.widget.calendar.agendaview.CalendarAgendaAppointmentItem p0);


	public com.telerik.widget.calendar.agendaview.styles.AgendaWeekItemStyle getStyleForWeekItem (com.telerik.widget.calendar.agendaview.CalendarAgendaWeekItem p0)
	{
		return n_getStyleForWeekItem (p0);
	}

	private native com.telerik.widget.calendar.agendaview.styles.AgendaWeekItemStyle n_getStyleForWeekItem (com.telerik.widget.calendar.agendaview.CalendarAgendaWeekItem p0);

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
