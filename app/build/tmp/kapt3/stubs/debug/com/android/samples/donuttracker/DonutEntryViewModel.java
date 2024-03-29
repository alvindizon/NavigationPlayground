package com.android.samples.donuttracker;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J:\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/android/samples/donuttracker/DonutEntryViewModel;", "Landroidx/lifecycle/ViewModel;", "donutDao", "Lcom/android/samples/donuttracker/storage/DonutDao;", "(Lcom/android/samples/donuttracker/storage/DonutDao;)V", "donutLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/android/samples/donuttracker/Donut;", "addData", "", "id", "", "name", "", "description", "rating", "", "setupNotification", "Lkotlin/Function1;", "get", "insert", "donut", "(Lcom/android/samples/donuttracker/Donut;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class DonutEntryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.android.samples.donuttracker.storage.DonutDao donutDao = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<com.android.samples.donuttracker.Donut> donutLiveData;
    
    public DonutEntryViewModel(@org.jetbrains.annotations.NotNull()
    com.android.samples.donuttracker.storage.DonutDao donutDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.android.samples.donuttracker.Donut> get(long id) {
        return null;
    }
    
    public final void addData(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int rating, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> setupNotification) {
    }
    
    private final java.lang.Object insert(com.android.samples.donuttracker.Donut donut, kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    private final kotlinx.coroutines.Job update(com.android.samples.donuttracker.Donut donut) {
        return null;
    }
}