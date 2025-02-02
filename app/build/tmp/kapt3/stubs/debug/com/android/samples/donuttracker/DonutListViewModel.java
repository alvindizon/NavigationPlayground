package com.android.samples.donuttracker;

/**
 * This ViewModel is used to access the underlying data and to observe changes to it.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/android/samples/donuttracker/DonutListViewModel;", "Landroidx/lifecycle/ViewModel;", "donutDao", "Lcom/android/samples/donuttracker/storage/DonutDao;", "(Lcom/android/samples/donuttracker/storage/DonutDao;)V", "donuts", "Landroidx/lifecycle/LiveData;", "", "Lcom/android/samples/donuttracker/Donut;", "getDonuts", "()Landroidx/lifecycle/LiveData;", "delete", "Lkotlinx/coroutines/Job;", "donut", "app_debug"})
public final class DonutListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.android.samples.donuttracker.storage.DonutDao donutDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.android.samples.donuttracker.Donut>> donuts = null;
    
    public DonutListViewModel(@org.jetbrains.annotations.NotNull()
    com.android.samples.donuttracker.storage.DonutDao donutDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.android.samples.donuttracker.Donut>> getDonuts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull()
    com.android.samples.donuttracker.Donut donut) {
        return null;
    }
}