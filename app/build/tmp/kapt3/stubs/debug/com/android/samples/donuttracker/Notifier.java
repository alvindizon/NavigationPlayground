package com.android.samples.donuttracker;

/**
 * Utility class for posting notifications.
 * This class creates the notification channel (as necessary) and posts to it when requested.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/android/samples/donuttracker/Notifier;", "", "()V", "channelId", "", "init", "", "activity", "Landroid/app/Activity;", "postBagelNotification", "context", "Landroid/content/Context;", "intent", "Landroid/app/PendingIntent;", "postNotification", "id", "", "app_debug"})
public final class Notifier {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String channelId = "Default";
    @org.jetbrains.annotations.NotNull()
    public static final com.android.samples.donuttracker.Notifier INSTANCE = null;
    
    private Notifier() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void postNotification(long id, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.PendingIntent intent) {
    }
    
    public final void postBagelNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.PendingIntent intent) {
    }
}